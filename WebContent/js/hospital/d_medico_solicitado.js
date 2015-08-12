window._idMedico = 1;


var prefix = "";

var urlMedicoSolicitado = prefix + "ObtenerMedicosMasSolicitados";

$(document).ready(function(){
	$("#tableMedicos").hide();
	console.log("ready");

	$("#btnReporte").click(function(){
		var f1 = $("#datetimepicker1 > input").val();
		var f2 = $("#datetimepicker2 > input").val();

		$.get(urlMedicoSolicitado, {fecha1 : f1, fecha2 : f2}, function(data){
			var medicos = eval( "(" + data + ")" );
			console.log(medicos);

			if(medicos != null){
				
				$("#tableMedicos").show();
				$("#tableMedicos > tbody").html("");
				var row = "";

				for (var i = 0; i < medicos.length; i++) {
					row += '<tr>\
						<td>'+medicos[i].medico.id+'</td>\
						<td>'+medicos[i].medico.persona.nombres+'</td>\
						<td>'+medicos[i].medico.persona.apellidos+'</td>\
						<td>'+medicos[i].medico.persona.telefono+'</td>\
						<td>'+medicos[i].medico.persona.ciudad+'</td>\
						<td>'+medicos[i].medico.persona.email+'</td>\
						<td>'+medicos[i].medico.especialidad.nombre+'</td>\
						<td>'+medicos[i].reservas+'%</td>\
					</tr>';
					//row += '<tr><td>'+medicos[i].medico.id+'</td><td>'+medicos[i].medico.persona.nombres+'</td><td>'+medicos[i].medico.persona.apellidos+'</td><td>'+medicos[i].medico.persona.telefono+'</td><td>'+medicos[i].medico.persona.ciudad+'</td><td>'+medicos[i].medico.persona.email+'</td><td>'+medicos[i].medico.especialidad.nombre+'</td><td>'+medicos[i].reservas+'</td></tr>';
				};
				
				$("#tableMedicos > tbody").append(row);
			}
			else{
				alert("la conexion ha tadado demasiado en responder, intentelo nuevamente en un momento");
			}
		});
	});

});
