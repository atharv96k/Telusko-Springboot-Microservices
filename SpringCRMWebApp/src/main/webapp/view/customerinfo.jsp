<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
    <link rel="stylesheet" href="<c:url value='/css/customer.css' />">
</head>
<body>

<div class="container">

    <h2>Customer List</h2>

    <div class="action-bar">
        <a href="<c:url value='/showForm' />" class="btn">Register Customer</a>
    </div>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>City</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="c" items="${customer}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.fname}</td>
                    <td>${c.lname}</td>
                    <td>${c.city}</td>

                    <!-- UPDATE -->
                    <td>
                        <a href="<c:url value='/updateForm'>
                                    <c:param name='id' value='${c.id}'/>
                                 </c:url>"
                           class="btn-update">
                            Update
                        </a>
                    </td>

                    <!-- DELETE -->
                    <td>
                        <a href="<c:url value='/deletecx'>
                                    <c:param name='id' value='${c.id}'/>
                                 </c:url>"
                           class="btn-delete"
                           onclick="return confirm('Are you sure you want to delete this customer?');">
                            Delete
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>