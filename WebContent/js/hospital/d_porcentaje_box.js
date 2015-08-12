window._idMedico = 1;


var prefix = "";

var urlObtenerOcupacion = prefix + "ObtenerPorcentajeOcupacionBox";
var urlObtenerBoxes = prefix + "ObtenerBox";



$(document).ready(function(){
	$("#tablePorcentaje").hide();
	console.log("ready");

	$.get(urlObtenerBoxes, function(data){
		var boxes = eval( "(" + data + ")" );
		$("#selectBoxes").html("");
		for (var i = 0; i < boxes.length; i++) {
			$("#selectBoxes").append( '<option value="' + boxes[i].id +'">' + boxes[i].nombre + '</option>'  );
		};
	});

	$("#btnReporte").click(function(){
		var f1 = $("#datetimepicker1 > input").val();
		var f2 = $("#datetimepicker2 > input").val();
		var id_box = $("#selectBoxes").val();

		$.get(urlObtenerOcupacion, {idBox : id_box, fecha1 : f1, fecha2 : f2}, function(data){
			var percent = eval( "(" + data + ")" );
			console.log(percent);
			$("#tablePorcentaje").show();
			$("#tablePorcentaje > tbody").html("");

			var row = '<tr><td>'+$("#selectBoxes").val()+'</td><td>'+$("#selectBoxes > option").html()+'</td><td>'+percent+'%</td></tr>'
			$("#tablePorcentaje > tbody").append(row);
		});
	});

});
