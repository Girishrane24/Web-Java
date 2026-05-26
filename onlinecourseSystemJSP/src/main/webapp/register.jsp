<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
<link rel="stylesheet" href="webapp/Resources/css/style.css">
</head>
<body>

	<h2>Student Registration</h2>

	<form action="RegistrationController" method="post">

	Name :
	<input type="text" name="fullname">
	<br><br>

	Email :
	<input type="email" name="email">
	<br><br>

	Password :
	<input type="password" name="password">
	<br><br>

	<input type="submit" value="Register">

	</form>


</body>
</html>