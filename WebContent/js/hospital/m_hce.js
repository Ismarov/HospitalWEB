var url = "getHcePaciente";

$(document).ready(function(){
	// Leer parametros de la url
	// acceder com myHosp.getParams() #=> Object
	initMyHosp();
	llenarForm();

	consultarHce();
});

function consultarHce(){
	if(validar()){
		console.log("cargando");
		$.get(url, $("#form_id").serialize(), function(data){
			var hce = eval("("+data+")");
			if(hce != null){
				procesarHce(hce);
			}
			else{
				alert("Ocurrió un error consultando el Historial.\nIntentelo otra vez en un momento.");
			}
		}).error(function(){
			alert("Ocurrió un error consultando el Historial.\nIntentelo otra vez en un momento.");
		});
	}
}

function llenarForm(){
	if(myHosp.getParams().id != undefined){
		$("#paciente_id").val(myHosp.getParams().id);
	}
}

function validar(){
	var ret = true;
	if($("#paciente_id").val().length < 1){
		ret = false;
	}
	return ret;
}

function procesarHce(hce){
	console.log("hce", hce);

	if(hce.length > 0){

		//Si hay registros mostrar info del paciente

		var paciente = hce[0].paciente.personavo;
		$("#table_datos").html("");
			var str_datos = "<tr> <td><h2>Nombre</h2></td> <td>"+paciente.nombres + " "+ paciente.apellidos +"</td> </tr>";
			str_datos += "<tr> <td>RUT</td> <td>"+paciente.rut+"</td> </tr>";
			str_datos += "<tr> <td>Fecha nacimiento</td> <td>"+paciente.f_nac+"</td> </tr>";
		$("#table_datos").append(str_datos);
	

		// Luego iterar sobre sus RCE

		$("#hce").html("");
		for (var i = 0; i < hce.length; i++) {
			var html = "<div>";
				html += "<h2>"+hce[i].horamedica.finicio+"</h2>";
				html += "<h4>Medico: "+hce[i].horamedica.medicovo.persona.nombres+" "+hce[i].horamedica.medicovo.persona.apellidos+" - "+ hce[i].horamedica.medicovo.especialidad.nombre +"</h4>";
				html += "<table>";
					//html += JSON.stringify(hce[i]);
					//html += "<tr> <td><h3>AAAA</h3></td> <td>"+hce[i].+"</td> </tr>";
					html += "<tr> <td><h3>Anamnesis</h3></td> <td>"+hce[i].anamnesis+"</td> </tr>";
					html += "<tr> <td><h3>Motivo</h3></td> <td>"+hce[i].motivo+"</td> </tr>";
					html += "<tr> <td><h3>Examen fisico</h3></td> <td>"+hce[i].examen_fisico+"</td> </tr>";
					html += "<tr> <td><h3>Hipotesis</h3></td> <td>"+hce[i].hipotesis+"</td> </tr>";
					html += "<tr> <td><h3>Detalle GES</h3></td> <td>"+hce[i].detalle_ges+"</td> </tr>";
					html += "<tr> <td><h2>Diagnostico</h2></td> <td>"+hce[i].diagnostico.desc+"</td> </tr>";

					// Iterar sobre las recetas
					for(var r=0; r<hce[i].receta.length; r++){
						html += "<tr> <td><h2>Receta</h2></td> <td>"+hce[i].receta[r].desc+"</td> </tr>";
						html += "<tr> <td><h4>GES:</h4></td> <td>";
							if(hce[i].receta[r].paciente_ges == 1)
								html += "Paciente GES ";
							if(hce[i].receta[r].paciente_cronico == 1)
								html += "Cronico ";
							if(hce[i].receta[r].patologia_ges == 1)
								html += "Patologia GES ";
							if( hce[i].receta[r].paciente_ges == 0 && hce[i].receta[r].paciente_cronico == 0 && hce[i].receta[r].patologia_ges == 0 )
								html += " - Receta sin detalles GES - ";
						html +="</td> </tr>";
					}
					// Fin recetas
					
					//html += "<tr> <td><h2>Diagnostico</h2></td> <td>"+hce[i].diagnostico.desc+"</td> </tr>";
					
					// Iterar sobre Procedimientos
					for(var p=0; p<hce[i].procedimiento.length; p++){
						html += "<tr> <td><h2>Procedimiento: </h2></td> <td>"+hce[i].procedimiento[p].desc+"</td> </tr>";
					}
					// Fin procedimientos
					// Iterar sobre actividades
					for(var a=0; a<hce[i].actividad.length; a++){
						html += "<tr> <td><h2>Actividad: </h2></td> <td>"+hce[i].actividad[a].desc+"</td> </tr>";
					}
					html += "<tr> <td><h3>Indicador Medico</h3></td> <td>"+hce[i].indicador_medico+"</td> </tr>";
					html += "<tr> <td><h3>Indicador Cierre</h3></td> <td>"+hce[i].indicador_cierre+"</td> </tr>";
				html += "<table>";
			html += "</div><hr>";
			$("#hce").append(html);
		};
	}//fin if
}