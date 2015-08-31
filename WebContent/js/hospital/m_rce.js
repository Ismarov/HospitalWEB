//url del servlet que insertará el RCE
var url = "ingresarRce";
var url_receta = "ingresarReceta"
var params = [];


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
			insertarReceta();
		}
		else{
			alert("debe llenar todos los campos");
		}
	});

	$(".cert_chk").change(function(){
		$("#lCertificados").val(certsArray());
	});
	
});

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
	var opt_str = "<option disabled selected style='display:none;' value=0>Elija una opción</option>";
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
	var data_receta = {
		p_cron : 0,
		p_ges : 0,
		p_pges : 0,
		desc : ""
	};

	var checks = $("#form_receta input:checked");
	for (var i = 0; i < checks.length; i++) {
		var n = $(checks[i]).attr(name);
		if(n = "p_cron"){
			data_receta.p_cron = 1;
		}
		else if(n = "p_ges"){
			data_receta.p_ges = 1;
		}
		else if(n = "p_pges"){
			data_receta.p_pges = 1;
		}
	};
	data_receta.desc = $("#receta_desc").val();
	console.log(data_receta);
	return data_receta;
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
}