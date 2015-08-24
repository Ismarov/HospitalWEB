<%
	//Remove session vars
	session.removeAttribute("logged");
	session.removeAttribute("name");
	session.removeAttribute("id");
	session.removeAttribute("type");
	//Redirect to login page
	response.sendRedirect("login.jsp");
%>