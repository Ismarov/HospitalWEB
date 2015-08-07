<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Paciente</h3>

Obtener especialidades
<form action="ObtenerEspecialidades" method="GET">
	<button type="submit">Ver Especialidades</button>
</form>

Obtener Medicos De Un Especialidad
<form action="ObtenerMedicosDeUnEspecialidad" method="GET">
	<input type="hidden" value="1" name="idEspecialidad"/>
	<button type="submit">Ver Medicos de una Especialidad</button>
</form>

Buscar Hora APS
<form action="BuscarHoraAPS" method="GET">
	<input value="10/01/2014 00:00:00" name="fecha1"/>
	<br />
	<input value="10/01/2016 00:00:00" name="fecha2"/>
	<br />
	<input value="1" name="idMedico"/>
	<br />
	<button type="submit">Ver Horas</button>
</form>

<h3>Medico</h3>
 
Obtener Medicos
<form action="ObtenerMedicos" method="GET">
	<button type="submit">Ver Especialidades</button>
</form>
 
 
 
</body>
</html>