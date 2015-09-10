window._idMedico = 1;


var prefix = "";

var urlBuscarDisponibilidadHora = prefix + "BuscarSuDisponbilidadHora";



$(document).ready(function(){
	$("#divHoras").hide();
	console.log("ready");
});

$("#btnBuscar").click(function(){
	var f1 = $("#datetimepicker1 > input").val();
	var f2 = $("#datetimepicker2 > input").val();
	
	$.get(urlBuscarDisponibilidadHora, {idMedico : _idMedico, fecha1 : f1, fecha2 : f2}, function(data){
		var Horas = eval( "(" + data + ")" );
		console.log(Horas);
		$("#divHoras").show();
		for(i=0; i< Horas.length; i++){
			var row = '<tr><td><input type="checkbox" value="'+Horas[i].id+'"><br></td><td>' + Horas[i].finicio + '</td><td>' + Horas[i].medicovo.persona.nombres + " " + Horas[i].medicovo.persona.apellidos + '</td></tr>'
			$("#tableHoras > tbody").append(row);
		}
	});

});