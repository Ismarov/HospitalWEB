var url = "obtenerHorasPaciente";

$(document).ready(function(){
	// Leer parametros de la url
	// acceder com myHosp.getParams() #=> Object
	initMyHosp();

	if(myHosp.getParams().id != undefined){
		$.get(url, {id : myHosp.getParams().id}, function(data){
			var horas = eval("("+data+")");
			console.log(horas);
			fillTable(horas);
		}).error(function(){
			alert("La consulta no se pudo realizar, intentelo nuevamente en un momento");
		});
	}
	else{
		alert("debe proveer el id del paciente");
	}

});


function fillTable(horas){
	var str = "";
	$("#tableHoras tbody").html("");

	for (var i = 0; i < horas.length; i++) {
		str += "<tr><td>"+horas[i].finicio+"</td>"+"<td>"+horas[i].boxvo.nombre+"</td>"+"<td>"+horas[i].medicovo.persona.nombres +" "+horas[i].medicovo.persona.apellidos+"</td>"+"<td>"+horas[i].medicovo.especialidad.nombre+"</td>"+"<td><button class='btnAtender' data-horaid="+horas[i].id+" data-pacienteid="+myHosp.getParams().id+">Atender</button></td></tr>";
	};

	$("#tableHoras tbody").append(str);
	evtAtender();
}

function evtAtender(){
	$(".btnAtender").click(function(){
		var idhora = $(this).data("horaid");
		var idpac = $(this).data("pacienteid");
		var url = "m_ingresar_rce.html?idhora="+idhora+"&idpaciente="+idpac;
		console.log("Redirecting: ", url)
		window.location.replace(url);
	});
}