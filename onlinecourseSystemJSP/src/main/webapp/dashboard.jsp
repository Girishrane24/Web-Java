<%@ page language="java" %>

<%
String user = (String)session.getAttribute("user");

if(user == null){

    response.sendRedirect("login.jsp");
}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome : <%= user %></h2>

	<a href="courses.jsp">Select Course</a>

	<br><br>
	
	<a href="LogoutServlet">Logout</a>
	



</body>
</html>