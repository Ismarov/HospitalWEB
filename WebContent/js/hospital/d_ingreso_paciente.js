
var url = "ingresarPaciente";

$(document).ready(function(){

	$("#btnIngresar").click(function(){
		if(validar()){
			$.post(url, $("#pacienteForm").serialize())
			.success(function(data){
				console.log(data);
				d = eval("("+data+")");
				if(d != null){
					alert("Los datos se ingresaron existosamente");
				}
				else{
					alert("Los datos no pudieron ser ingresados, Espere un momento y vuelva a intentarlo");
				}
			})
			.error(function(data){
				alert("Ocurrió un error al intentar insertar los datos,\nReintentelo en un momento.");
			});
		}
		else{
			alert("Debe completar todos los campos");
		}
	});
});

function validar(){
	var inp = $("#pacienteForm input");
	var ret = true;
	$.each(inp, function(i, el){
		if($(el).val() == ""){
			ret = false;
		}
	});
	return ret;
}