//url del servlet que insertará el RCE
var url = "RseInsertar";

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

	//Si boton ingresar es clickeado
	$("#btnIngresar").click(function(){
		//Si todos los campos se llenaron
		if(!validar()){
			// consultar al servlet pasandole los datos del form de forma serializada
			$.post(url, $("#form_rce").serialize(), function(data){
				var rce = eval("("+data+")");
				alert("El registro "+rce.id+"fué ingresado correctamente");
			})
			.error(function(){
				alert("Ocurrió un error al intentar insertar los datos.\nIntentelo nuevamente en un momento.");
			});
		}
		else{
			alert("debe llenar todos los campos");
		}
	});
	
});

function hiddenParams(){
	$("#paciente_id").val(myHosp.getParams().idPaciente);
	$("#horamedica_id").val(myHosp.getParams().idHora);
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
	var opt_str = "<option disabled selected style='display:none;'>Elija una opción</option>";
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
	var inp = $("#form_rce input");
	var ret = true;
	//recorrer el array y retornar false si el value de un input es vacío ""
	$.each(inp, function(i, el){
		if($(el).val() == ""){
			ret = false;
		}
	});
	return ret;
}