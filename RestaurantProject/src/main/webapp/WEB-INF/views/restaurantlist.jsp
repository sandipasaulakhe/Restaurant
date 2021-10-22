<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Restaurant System</h1>
<h3><a href='Addresto.jsp'>Add Restaurant</a></h3>
	<table border=1>
		<tr>
			<th>rid</th>
			<th>rname</th>
			<th>radd</th>
			<th>rphno</th>
			<th>openingTime</th>
			<th>closingTime</th>
			<th>cuisine</th>
			
		</tr>
		<c:forEach var="robj" items="${listRestaurant}">
			<tr>
				<td>${robj.getRid()}</td>
				<td>${robj.getRname()}</td>
				<td>${robj.getRadd()}</td>
				<td>${robj.getRphno()}</td>
				<td>${robj.getOpeningTime()}</td>
				<td>${robj.getClosingTime()}</td>
				<td>${robj.getCuisine()}</td>
				<td>
								<a href="edit/${robj.getRid()}">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
				<a href="delete/${robj.getRid()}">Delete</a>
				
				</td>
			</tr>
		</c:forEach>
		

	</table>

</body>
</html>    