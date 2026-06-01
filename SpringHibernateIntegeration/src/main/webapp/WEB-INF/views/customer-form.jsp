<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Spring MVC 5 - CRUD  Operation</h2>
<h3>Customer Form</h3>
<hr>
<form:form action="saveCustomer" method="post" modelAttribute="customer">
<table>
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
	<tr>
		<td>Enter FirstName:</td>
		<td><form:input path="firstName"/></td>
	</tr>
	<tr>
		<td>Enter Last Name:</td>
		<td><form:input path="lastName"/></td>
	</tr>
	<tr>
		<td>Enter Email ID:</td>
		<td><form:input path="email"/></td>
	</tr>
	<tr>
		<td></td>
		<td>
			<form:button>Submit</form:button>
		</td>
	
	</tr>
</table>
</form:form>
</body>
</html>