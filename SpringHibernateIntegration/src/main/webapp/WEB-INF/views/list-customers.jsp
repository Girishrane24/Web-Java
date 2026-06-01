<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>>
    <%@ taglib prefix="c" uri = "jakarta.tags.core" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>CRM - Customer relationship Manager</h2>
<hr/>
<input type = "button" value="Add Customer" onclick="window.location.href='showForm'; return false;"/>
<br><br>

<table>
	<tr>
	<th>First Name </th>
	<th>Last Name</th>
	<th>Email </th>
	<th> Update </th>
	<th> Delete</th>
	</tr>
	<!-- loop over and print our customers -->
	<c:forEach var="tempCustomer" items="${listCust}"/>
	
	<!-- construct an "update" link with customer id -->
	
	<c:url var="updateLink" value = "/customer/showFormForUpdate">
	
	<c:param name = "customerId" value = "${tempCustomer.id }"/>
	</c:url>
	
	<!-- construct an "delete" link with customer id -->
	
	<c:url var = "deletLink" value = "/customer/delete">
	<c:param name = "customerId" value = "${tempCustomer.id}" />
	</c:url>
	<tr>
		<td>${tempCustomer.firstName } </td>
		<td>${tempCustomer.lastName } </td>
		<td>${tempCustomer.email } </td>
		
		<td> 
		<!-- display the update link -->
		<a href = "${updateLink}">Update</a>
		</td>
		
		<td>
			<!-- display the update link -->
			<a href = "${deleteLink}">Delete</a>
		</td>
		</tr>
		</c:forEach>
	
</table>

</body>
</html>