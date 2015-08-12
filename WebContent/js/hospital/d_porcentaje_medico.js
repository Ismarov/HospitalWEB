window._idMedico = 1;


var prefix = "";

var urlObtenerOcupacion = prefix + "ObtenerPorcentajeOcupacionMedico";
var urlObtenerMedicos = prefix + "ObtenerMedicos";
var medicoSelected = null;
var medicos = null;

$(document).ready(function(){
	$("#tableMedicos").hide();
	console.log("ready");

	$.get(urlObtenerMedicos, function(data){
		console.log(data);
		medicos = eval( "(" + data + ")" );
		console.log(medicos);
		if(medicos.length > 0){
			medicoSelected = medicos[0];
		}
		$("#selectMedico").html("");
		if(medicos != null){
			for (var i = 0; i < medicos.length; i++) {
				$("#selectMedico").append( '<option value="' + medicos[i].id +'">' + medicos[i].persona.nombres + ' ' + medicos[i].persona.apellidos + '</option>'  );
			}
		}
	});

	$("#selectMedico").change(function(){
		medicoSelected = getMedicoById(parseInt( $(this).val() ));
		function getMedicoById(id){
			if(medicos != null){
				for(var i=0; i<medicos.length; i++){
					if(medicos[i].id == id){
						return medicos[i];
					}
				}
			}
			return null
		}
	});

	$("#btnReporte").click(function(){
		var f1 = $("#datetimepicker1 > input").val();
		var f2 = $("#datetimepicker2 > input").val();
		var id_med = $("#selectMedico").val();

		$.get(urlObtenerOcupacion, {idMed : id_med, fecha1 : f1, fecha2 : f2}, function(data){
			var percent = eval( "(" + data + ")" );
			console.log(percent);
			$("#tableMedicos").show();
			$("#tableMedicos > tbody").html("");

			var row = '<tr><td>'+medicoSelected.id+'</td><td>'+medicoSelected.persona.nombres+'</td><td>'+medicoSelected.persona.apellidos+'</td><td>'+medicoSelected.especialidad.nombre+'</td><td>'+percent+'%</td></tr>'
			$("#tableMedicos > tbody").append(row);
		});
	});

});
