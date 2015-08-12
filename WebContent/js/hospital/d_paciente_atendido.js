window._idMedico = 1;


var prefix = "";

var urlPacienteAtendido = prefix + "ObtenerPacientesMasAtendidos";

$(document).ready(function(){
	$("#tablePacientes").hide();
	console.log("ready");

	$("#btnReporte").click(function(){
		var f1 = $("#datetimepicker1 > input").val();
		var f2 = $("#datetimepicker2 > input").val();

		$.get(urlPacienteAtendido, {fecha1 : f1, fecha2 : f2}, function(data){
			var pacientes = eval( "(" + data + ")" );
			console.log(pacientes);

			if(pacientes != null){
				
				$("#tablePacientes").show();
				$("#tablePacientes > tbody").html("");
				var row = "";

				for (var i = 0; i < pacientes.length; i++) {
					row += '<tr>\
						<td>'+pacientes[i].paciente.id+'</td>\
						<td>'+pacientes[i].paciente.personavo.nombres+'</td>\
						<td>'+pacientes[i].paciente.personavo.apellidos+'</td>\
						<td>'+pacientes[i].paciente.personavo.telefono+'</td>\
						<td>'+pacientes[i].paciente.personavo.ciudad+'</td>\
						<td>'+pacientes[i].paciente.personavo.email+'</td>\
						<td>'+pacientes[i].reservas+'%</td>\
					</tr>';
					//row += '<tr><td>'+medicos[i].medico.id+'</td><td>'+medicos[i].medico.personavo.nombres+'</td><td>'+medicos[i].medico.persona.apellidos+'</td><td>'+medicos[i].medico.persona.telefono+'</td><td>'+medicos[i].medico.persona.ciudad+'</td><td>'+medicos[i].medico.persona.email+'</td><td>'+medicos[i].medico.especialidad.nombre+'</td><td>'+medicos[i].reservas+'</td></tr>';
				};
				
				$("#tablePacientes > tbody").append(row);
			}
			else{
				alert("la conexion ha tadado demasiado en responder, intentelo nuevamente en un momento");
			}
		});
	});

});
