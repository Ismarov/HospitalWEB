//url del servlet que insertará el RCE
var url = "ingresarRce";
//var url_receta = "ingresarReceta"
var params = [];

var procedimientos = [];
var actividades = [];

var RecetaVo = function(){
	this.id = 0;
	this.desc = "";
	this.paciente_ges = 0;
	this.patologia_ges = 0;
	this.paciente_cronico = 0;
}

// ids de los campos select asociados a las respectivas
// urls para obtener los tipos que serán options en el formulario.
var opts = [
  //["id_select_tag", "url_servlet"]//
	["actividad_id", "getActividades"],
	["procedimiento_id", "getProcedimientos"],
	["diagnostico_id", "getDiagnosticos"]/*,
	["tipos_cierre_clinico", "getTiposCierre"],
	["destinos", "getDestinos"],
	["tiempos_control", "getTiemposControl"]*/
];

$(document).ready(function(){

	// Leer parametros de la url
	// acceder com myHosp.getParams() #=> Object
	initMyHosp();
	
	// Llama a los servlets que consultan los tipos definidos en opts
	// y luego crea el contenido de los select
	consultarTipos();

	//LLenar campos ocultos
	hiddenParams();

	//Si boton ingresar es clickeado
	$("#btnIngresar").click(function(){ 

		//Si todos los campos se llenaron
		if(validar()){
			insertarRce();
		}
		else{
			alert("debe llenar todos los campos");
		}
	});

	$(".cert_chk").change(function(){
		$("#lCertificados").val(certsArray());
	});

	$("#btnAddProcedimiento").click(function(){
		event.preventDefault();
		anadirProcedimiento();
	});

	$("#btnAddActividad").click(function(){
		event.preventDefault();
		anadirActividad();
	});

	$("#btnAddReceta").click(function(){
		event.preventDefault();
		anadirReceta();
	});
	
});

// ############################################################

// PROCEDIMIENTOS

function anadirProcedimiento(){
	var proc = parseInt($("#procedimiento_id").val());
	var text = $("#procedimiento_id option:selected").text();
	if(proc != 0){
		var incluido = false;
		for(var i=0; i<procedimientos.length; i++){
			if(procedimientos[i] == proc){
				incluido = true;
			}
		}
		if(!incluido){
			procedimientos.push(proc);
			//Llenar HTML
			var data_id = (new Date()).getTime().toString();
         	var html = '<tr id="tproc'+data_id+'"><td>'+text+'</td><td><button class="btnRemoveProcedimiento" data-id="'+proc+'" data-rowid="'+data_id+'">Quitar</button></td></tr>';
         	$("#tableProcedimientos").append(html);
         	$("#tproc"+data_id+" .btnRemoveProcedimiento").click(function(){
         		eliminarProcedimiento(this);
         	});
         	$("#lprocedimiento_id").val(JSON.stringify(procedimientos));
		}
		else{
			alert("El procedimiento ya se encuentra asociado!");
		}
	}
	else{
		alert("Debe elegir una opcion de procedimiento de la lista!");
	}

}

function eliminarProcedimiento(elem){
	var id = parseInt($(elem).data('id'));
	var rowid = $(elem).data('rowid');
	var new_procs = [];

	$("#tproc"+rowid).remove();

	for(var i=0; i<procedimientos.length; i++){
		if(procedimientos[i] != id){
			new_procs.push(procedimientos[i])
		}
	}
	procedimientos = new_procs;
	$("#lprocedimiento_id").val(JSON.stringify(procedimientos));
}


// ACTIVIDADES

function anadirActividad(){
	var acti = parseInt($("#actividad_id").val());
	var text = $("#actividad_id option:selected").text();
	if(acti != 0){
		var incluido = false;
		for(var i=0; i<actividades.length; i++){
			if(actividades[i] == acti){
				incluido = true;
			}
		}
		if(!incluido){
			actividades.push(acti);
			//Llenar HTML
			var data_id = (new Date()).getTime().toString();
         	var html = '<tr id="tact'+data_id+'"><td>'+text+'</td><td><button class="btnRemoveActividad" data-id="'+acti+'" data-rowid="'+data_id+'">Quitar</button></td></tr>';
         	$("#tableActividades").append(html);
         	$("#tact"+data_id+" .btnRemoveActividad").click(function(){
         		eliminarActividad(this);
         	});
         	$("#lactividad_id").val(JSON.stringify(actividades));
		}
		else{
			alert("La actividad ya se encuentra asociada!");
		}
	}
	else{
		alert("Debe elegir una opcion de actividad de la lista!");
	}

}

function eliminarActividad(elem){
	var id = parseInt($(elem).data('id'));
	var rowid = $(elem).data('rowid');
	var new_acti = [];

	$("#tact"+rowid).remove();

	for(var i=0; i<actividades.length; i++){
		if(actividades[i] != id){
			new_acti.push(actividades[i])
		}
	}
	actividades = new_acti;
	$("#lactividad_id").val(JSON.stringify(actividades));
}

// ############################################################

function eliminarReceta(elem){
	var id = $(elem).data('id');
	//quitar fila de la tabla
	$("#trec-"+id).remove();
	buildDataRecetaJson();
}

function anadirReceta(){
	var r = getDataReceta();

	document.getElementById("form_receta").reset();

	var data_id = (new Date()).getTime().toString();
    
    var html = '<tr id="trec-'+data_id+'" data-id="'+r.id+'" data-desc="'+r.desc+'" '+
    'data-paciente_ges="'+r.paciente_ges+'"'+
    'data-paciente_cronico="'+r.paciente_cronico+'"'+
    'data-patologia_ges="'+r.patologia_ges+'">'+
    '<td>Desc: '+r.desc+'</td><td><button class="btnRemoveReceta" data-id="'+data_id+'">Quitar</button></td></tr>';

    $("#tableRecetas").append(html);

    $("#trec-"+data_id+" .btnRemoveReceta").click(function(){
		eliminarReceta(this);
	});

	buildDataRecetaJson();
}

function buildDataRecetaJson(){
	var rows = $("#tableRecetas tr");
	var recetas = [];
	for(var i=0; i<rows.length; i++){
		var r = new RecetaVo();
		r.patologia_ges = $(rows[i]).data("patologia_ges");
		r.paciente_ges = $(rows[i]).data("paciente_ges");
		r.paciente_cronico = $(rows[i]).data("paciente_cronico");
		r.desc = $(rows[i]).data("desc");
		recetas.push(r);
	}
	var recetas_str = JSON.stringify(recetas);
	$("#receta_json").val(recetas_str);
}

function hiddenParams(){
	$("#paciente_id").val(myHosp.getParams().idpaciente);
	$("#horamedica_id").val(myHosp.getParams().idhora);
}


function consultarTipos(){
	
	var callback = function(i){
		$.get(opts[i][1], function(data){
			var d = eval("("+data+")");
			crearOptions(opts[i][0], d);
		});
	}
	
	for(var i=0; i < opts.length; i++){
		callback(i);
	}
}

function crearOptions(id, data){
	$("#"+id).html("");
	var opt_str = "<option selected value=0>Elija una opción</option>";
	for(var i=0; i<data.length; i++){
		opt_str += "<option value="+data[i].id+">"+data[i].desc + "</option>";
	}
	$("#"+id).html(opt_str);
}


function certsArray(){
	var certs = new Array();
	$.each($("#form_certificado input[type=checkbox]:checked"), function(idx, el){
		certs.push(parseInt( $(el).val() ));
	});
	return JSON.stringify(certs);
}

function actiArray(){
	//
}

function procArray(){
	//
}


function validar(){
	//Traer todos los input del form como array
	var inp = $("#form_rce input,select");
	var ret = true;
	//recorrer el array y retornar false si el value de un input es vacío ""
	for(var i=0; i<inp.length; i++){
		//console.log("testing: ",$(inp[i]).attr("name"));
		if(inp[i].tagName == "SELECT"){
			if($(inp[i]).val() == null){
				ret = false;
				console.log("Llenar: ", $(inp[i]).attr("name") );
			}
		}
		else if(inp[i].tagName == "INPUT"){
			if($(inp[i]).val().length == 0){
				ret = false;
				console.log("Llenar: ", $(inp[i]).attr("name") );
			}
		}
	}
	return ret;
}


function getDataReceta(){

	var r = new RecetaVo();

	var checks = $("#form_receta input:checked");
	for (var i = 0; i < checks.length; i++) {
		var n = $(checks[i]).attr(name);
		if(n = "p_cron"){
			r.paciente_cronico = 1;
		}
		else if(n = "p_ges"){
			r.paciente_ges = 1;
		}
		else if(n = "p_pges"){
			r.patologia_ges = 1;
		}
	};
	r.desc = $("#receta_desc").val();
	console.log(JSON.stringify(r));
	return r;
}

function insertarRce(){
	
	// consultar al servlet pasandole los datos del form de forma serializada
	$.post(url, $("#form_rce").serialize(), function(data){
		var rce = eval("("+data+")");
		if(rce != null){
			console.log("rce", rce);
			alert("El registro "+rce.id+" fué ingresado correctamente");
		}
		else{
			alert("El registro no pudo ser ingresado correctamente.\nIntentelo nuevamente en un momento");
		}
	})
	.error(function(){
		alert("Ocurrió un error al intentar insertar los datos.\nIntentelo nuevamente en un momento.");
	});
	//
}


/*
function insertarReceta(){
	if($("#receta_id").val() == "0" ){
		$.post(url_receta, getDataReceta(), function(data){
			var receta = eval("("+data+")");
			console.log("receta", receta);
			if(receta != null){
				$("#receta_id").val(receta.id);
				insertarRce();
			}
			else{
				alert("Ocurrió un error al intentar insertar la receta.\nEl registro electronico no se creará..\nIntentelo nuevamente en un momento.");
			}
		})
		.error(function(){
			alert("Ocurrió un error al intentar insertar la receta.\nEl registro electronico no se creará..\nIntentelo nuevamente en un momento.");
		});
	}
	else{
		insertarRce();
	}
<<<<<<< HEAD
}


/*

Objeto Receta

{
	id : 0,
	paciente_ges : 0,
	paciente_cronico : 0,
	patologia_ges : 0,
	desc : ""
}


*/
