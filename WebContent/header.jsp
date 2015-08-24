<%
	if(session.getAttribute("logged")==null){
		response.sendRedirect("login.jsp");
	}
	else{
		if(session.getAttribute("logged").equals("false")){
			response.sendRedirect("login.jsp");
		}
	}
%>
Hola <%= session.getAttribute("name")%>
<a href="logout.jsp">Salir</a>