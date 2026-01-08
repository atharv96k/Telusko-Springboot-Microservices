<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Customer</title>
    <link rel="stylesheet" href="<c:url value='/css/form.css' />">
</head>
<body>

<div class="container">
    <h2>Register Customer</h2>

    <form action="<c:url value='/registerCustomer' />" method="post">

        <label>First Name</label>
        <input type="text" name="fname" required />

        <label>Last Name</label>
        <input type="text" name="lname" required />

        <label>City</label>
        <input type="text" name="city" required />

        <div class="actions">
            <button type="submit">Save</button>
            <a href="<c:url value='/cxinfo' />">Back</a>
        </div>

    </form>
</div>

</body>
</html>
