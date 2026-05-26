<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Available Courses</h2>

<form action="CourseServlet" method="post">

<select name="course">

	<option>Java Full Stack</option>
	<option>Python </option>
	<option>Data Science</option>
	<option>Cloud Computing</option>
	<option>Networking</option>

	</select>

	<br><br>

	<input type="submit" value="Enroll">

	</form>


</body>
</html>