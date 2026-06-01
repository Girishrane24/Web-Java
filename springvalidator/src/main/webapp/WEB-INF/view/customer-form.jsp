<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type = "text/css">

.error {
color = red;
}
</style>
</head>
<body>
<form:form action="process" modelAttribute = "theCustomer" method = "post">
<table>
<tr>
<td> Enter FirstName : 
</td>
<td> <form:input path="FirstName"/>
</td>
</tr>

<tr>
<td> Enter LastName * : 
</td>
<td> <form:input path="LastName"/>
	<form:errors path = "lastName" cssClass = "error"/>
</td>
</tr>

<tr>
<td>
</td>
<td>
	<form:button> Submit </form:button>
</td>
</tr>
</table>
</form:form>
</body>
</html>