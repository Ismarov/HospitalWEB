<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Reserva Hospital</title>
</head>
<body>

<form action="SObtenerEspecialidades" method = "GET">
<button type="submit">Ver Especialidades</button>
</form>

<form action="SObtenerMedicos" method = "GET">
<button type="submit">Ver Medicos</button>
</form>

<form action="SObtenerBox" method = "GET">
<button type="submit">Ver Boxs</button>
</form>

<form action="SObtenerMedicosMasSolicitados" method = "GET">
<button type="submit">Ver Medicos Mas Solicitados</button>
<input type="text" value="01/01/2014 00:00:00" name="fecha1">
<input type="text" value="01/01/2016 00:00:00" name="fecha2">
</form>

<form action="SObtenerPacienteMasAtendido" method = "GET">
<button type="submit">Obtener Paciente Mas Atendido</button>
<input type="text" value="01/01/2014 00:00:00" name="fecha1">
<input type="text" value="01/01/2016 00:00:00" name="fecha2">
</form>

<form action="SBuscarHoraAPS" method = "GET">
<button type="submit">Buscar Hora APS</button>
<input type="text" value="1" name="idMedico">
<input type="text" value="01/01/2014 00:00:00" name="fecha1">
<input type="text" value="01/01/2016 00:00:00" name="fecha2">
</form>

<form action="SReservarHoraAPS" method = "GET">
<button type="submit">Reservar Hora APS</button>
<input type="text" value="1" name="idHoraMedicaAPS">
<input type="text" value="1" name="idPaciente">
</form>

<form action="SIngresarPaciente" method = "POST">
<button type="submit">Ingresar Paciente</button>
<input type="text" value="nombres" name="nombres">
<input type="text" value="apellidos" name="apellidos">
<input type="text" value="rut" name="rut">
<input type="text" value="01/01/2014 00:00:00" name="f_nac">
<input type="text" value="telefono" name="telefono">
<input type="text" value="direccion" name="direccion">
<input type="text" value="ciudad" name="ciudad">
<input type="text" value="email" name="email">
<input type="text" value="activo" name="activo">   
</form>

<form action="SIngresarMedico" method = "POST">
<button type="submit">Ingresar Medico</button>
<input type="text" value="nombres" name="nombres">
<input type="text" value="apellidos" name="apellidos">
<input type="text" value="rut" name="rut">
<input type="text" value="01/01/2014 00:00:00" name="f_nac">
<input type="text" value="telefono" name="telefono">
<input type="text" value="direccion" name="direccion">
<input type="text" value="ciudad" name="ciudad">
<input type="text" value="email" name="email">
<input type="text" value="activo" name="activo">
<input type="text" value="idEspecialidad" name="idEspecialidad">  
</form>

<form action="SObtenerPorcentajeOcupacionBox" method = "POST">
<button type="submit">Obtener Porcentaje Ocupacion Box</button>
<input type="text" value="1" name="idBox">
<input type="text" value="01/01/2014 00:00:00" name="fecha1">
<input type="text" value="01/01/2016 00:00:00" name="fecha2">
</form>

<form action="SObtenerPorcentajeOcupacionMedico" method = "GET">
<button type="submit">Obtener Porcentaje Ocupacion Medico</button>
<input type="text" value="1" name="idMed">
<input type="text" value="01/01/2014 00:00:00" name="fecha1">
<input type="text" value="01/01/2016 00:00:00" name="fecha2">
</form>

<form action="SBuscarSuDisponibilidadHora" method = "GET">
<button type="submit">Buscar Disponibilidad de Medico por Hora</button>
<input type="text" value="1" name="idMedico">
<input type="text" value="01/01/2014 00:00:00" name="fecha1">
<input type="text" value="01/01/2016 00:00:00" name="fecha2">
</form>

<form action="http://localhost:8080/reservaHospitalWeb/p_index.html">
    <input type="submit" value="Interfaz Beta Paciente">
</form>
<form action="http://localhost:8080/reservaHospitalWeb/d_index.html">
    <input type="submit" value="Interfaz Beta Director">
</form>
<form action="http://localhost:8080/reservaHospitalWeb/m_index.html">
    <input type="submit" value="Interfaz Beta Medico">
</form>

</body>
</html>