<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty restaurant }">
<h1>Add Restaurant</h1>
<form action="add" method="post">
</c:if>

<c:if test="${ not empty restaurant}">
<h1>Edit Restaurant</h1>
<form action="save" method="post">
</c:if>


Rid : <input type='text' name="rid" value="${restaurant.getRid()}">
<br>
Rname : <input type='text' name="rname" value="${restaurant.getRname()}">
<br>
Radd : <input type='text' name="radd" value="${restaurant.getRadd()}">
<br>
Rphno : <input type='text' name="rphno" value="${restaurant.getRphno()}">
<br>
OpeningTime : <input type='text' name="openingTime" value="${restaurant.getOpeningTime()}">
<br>
ClosingTime : <input type='text' name="closingTime" value="${restaurant.getClosingTime()}">
<br>
Cuisine : <input type='text' name="cuisine" value="${restaurant.getCuisine()}">
<br>
<button type="submit">Save</button>
</form>
</body>
</html>