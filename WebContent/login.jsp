<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	if(request.getAttribute("logged") != null ){
		if(request.getAttribute("logged").equals("true")){
			session.setAttribute("logged", "true");
			session.setAttribute("name", request.getAttribute("name"));
			session.setAttribute("id", request.getAttribute("id"));
			session.setAttribute("type", request.getAttribute("type"));
			response.sendRedirect("index.jsp");
		}
	}

	if(session.getAttribute("logged") == null){
		session.setAttribute("logged", "false");
	}
%>
<!DOCTYPE html lang=es>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceder</title>
</head>
<body>

	
	<% if(session.getAttribute("logged").equals("false")){ %>

	<form action="LoginSvc" method="post">
	<table style="border: 1px;">
		<tr>
			<td>Correo</td>
			<td><input name="email" value="paciente1@localhost"></td>
		</tr>
		<tr>
			<td>Contraseña</td>
			<td><input type="password" name="pass" value="pac1"></td>
		</tr>
		<tr>
			<td></td>
			<td><button>Acceder</button></td>
		</tr>
		<tr>
			<td>Paciente <input type="radio" name="type" value="p"checked></td>
			<td>Medico <input type="radio" name="type" value="m"></td>
			<td>Director <input type="radio" name="type"value="d"></td>
		</tr>
		<% if(request.getAttribute("logged") != null ){ if(request.getAttribute("logged").equals("false")){ %>
		<tr>
			<td>Usuario o contraseña incorrecta</td>
		</tr>
		<% }} %>
	</table>
	</form>

	<% 	}
		else{
	%>
	
	<form action="LoginSvc" method="post">
		<input type="hidden" name="logout" value="true">
		<input type="submit" value="Cerrar Sesión">
	</form>
		
	<%
		}
	%>
</body>
</html>