
var url = "getPacienteRut";

$(document).ready(function(){
	// Leer parametros de la url
	// acceder com myHosp.getParams() #=> Object
	initMyHosp();

	$("#btnBuscar").click(function(){
		if(!validar()){
			// consultar al servlet pasandole los datos del form de forma serializada
			$.get(url, $("#form_paciente").serialize(), function(data){
				var pac = eval("("+data+")");
				console.log(pac);
				llenarTabla(pac);
			})
			.error(function(){
				alert("Ocurrió un error al intentar consultar los datos.\nIntentelo nuevamente en un momento.");
			});
		}
		else{
			alert("debe llenar todos los campos");
		}
	});

	/*
	$("form_paciente").submit(function (e) {
		e.preventDefault();
		$("#btnBuscar").click();
	});*/

	$("#paciente_rut").on("keypress", function(event) {
	    if (event.keyCode == 13) {
	        event.preventDefault();
	        $("#btnBuscar").click();
	    }
	});

});


function llenarTabla(paciente){
	var row = "";
	row += "<tr>"+"<td>"+paciente.personavo.rut+"</td>"+"<td>"+paciente.personavo.nombres+"</td>"+"<td>"+paciente.personavo.apellidos+"</td>"+"<td><button class='btnHoras' data-id='"+paciente.id+"'>Ver Horas</button></td>"+"<td><button class='btnHce' data-id='"+paciente.id+"'>Ver HCE</button></td></tr>";
	$("#table_paciente tbody").html("");
	$("#table_paciente tbody").append(row);
	evtHoras();
	evtHce();
}

function evtHoras(){
	$(".btnHoras").click(function(){
		var url = "m_ver_horas_paciente.html?id="+$(this).data("id");
		console.log("Redirecting: ", url)
		window.location.replace(url);
	});
}

function evtHce(){
	$(".btnHce").click(function(){
		var url = "m_hce.html?id="+$(this).data("id");
		console.log("Redirecting: ", url)
		window.location.replace(url);
	});
}

function validar(){
	//Traer todos los input del form como array
	var inp = $("#form_paciente");
	var ret = true;
	//recorrer el array y retornar false si el value de un input es vacío ""
	$.each(inp, function(i, el){
		if($(el).val() == ""){
			ret = false;
		}
	});
	return ret;
}