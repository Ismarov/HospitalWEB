
var prefix = "";

var urlObtenerEspecialidades = prefix + "ObtenerEspecialidades";
var urlObtenerMedicosDeUnEspecialidad = prefix + "ObtenerMedicosDeUnEspecialidad";
var urlBuscarHoraAPS = prefix + "BuscarHoraAPS";
var urlReservarHoraAps = prefix + "ReservarHoraAps";

$(document).ready(function(){
	//
	$("#divMedico").hide();
	$("#divHora").hide();
	$.get(urlObtenerEspecialidades, function(data){
		var Especialidades = eval("(" + data + ")");
		console.log(Especialidades);
		for(i=0; i< Especialidades.length; i++){
			$("#selectEspecialidad").append( '<option value="' + Especialidades[i].id +'">' + Especialidades[i].nombre + '</option>'  );
		}
	});
});

$("#selectEspecialidad").change(function(){
	cleanMedicos();
	cleanHoras();
	//Obtener el id de la especialidad
	var option = $("option:selected", this);
	var id = parseInt($(option).val());
	if ( id != -1 ){
		//Obtener medicos de la especialidad
		$.get(urlObtenerMedicosDeUnEspecialidad, { idEspecialidad : id }, function(data){
			$("#divMedico").show();
			var Medicos = eval("(" + data + ")");
			for(i=0; i< Medicos.length; i++){
				$("#selectMedico").append( '<option value="' + Medicos[i].id +'">' + Medicos[i].persona.nombres + " " + Medicos[i].persona.apellidos + '</option>'  );
			}
		});
	}
	else{
		$("#divMedico").hide();
	}
});


$("#selectMedico").change(function(){
	cleanHoras();
	var option = $("option:selected", this);
	var id = parseInt($(option).val());
	if ( id != -1 ){
		//force a year from now
		var d = new Date();
		var f1 = d.format("dd/mm/yyyy HH:MM:ss");
		var y2 = parseInt(d.format("yyyy"));
		d.setYear(y2+1);
		var f2 = d.format("dd/mm/yyyy HH:MM:ss");
		f1 = "01/01/2000 00:00:00";
		$.get(urlBuscarHoraAPS, { idMedico : id, fecha1 : f1, fecha2 : f2 }, function(data){
			$("#divHora").show();
			var Horas = eval("(" + data + ")");
			console.log(Horas);
			for(i=0; i< Horas.length; i++){
				$("#selectHora").append( '<option value="' + Horas[i].id +'">' + 'Box ' + Horas[i].boxvo.nombre + ' - ' + Horas[i].medicovo.persona.nombres + ' ' + Horas[i].medicovo.persona.apellidos + '</option>'  );
			}
		});
	}
	else{
		$("#divHora").hide();
	}
});

$("#btnReservar").click(function(){
	var idHora = parseInt($("#selectHora option:selected").val());
	if(idHora != -1){
		$.post(urlReservarHoraAps, {idHoraMedicaAPS : idHora, idPaciente : 1}, function(data){
			console.log(data);
			alert("Se reservó la hora con exito");
		})
		.fail(function(){
			alert("Ocurrió un error.\nIntentelo nuevamente.");
		});
	}
	else{
		alert("Seleccione una hora");
	}
});

function cleanMedicos(){
	$("divMedico").hide();
	var optsMedicos = $("#selectMedico > option");
	//Borrar medicos si ya habian sido cargados para otra especialidad
	for(i=1; i<optsMedicos.length; i++){
		$(optsMedicos[i]).remove();
	}
}

function cleanHoras(){
	$("#divHora").hide();
	var optsHoras = $("#selectHora > option");
	//Borrar medicos si ya habin sido cargados para otra especialidad
	for(i=1; i<optsHoras.length; i++){
		$(optsHoras[i]).remove();
	}
}