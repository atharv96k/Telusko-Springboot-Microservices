<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
<center>
	<h1>Displaying data from Array/Collection</h1>
	<c:forEach var="booksName" items= "${books}">${booksName}</c:forEach>
	<br >
	<br>
	<a href="home">Click here to go back to the Home Page</a>
</center>
</body>
</html>