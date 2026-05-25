<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" language = "java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  int no = Integer.parseInt(request.getParameter("number"));

%>

<table border = "1">

	<%  
		int i = 0;
		for(i = 1; i<= 10; i++)  {
	%>
	<tr>
		<td> <%= (no * i) %> </td>
	</tr>
	<%} %>
</table>

</body>
</html>