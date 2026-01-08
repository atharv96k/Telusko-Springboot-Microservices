<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Customer</title>
    <link rel="stylesheet" href="<c:url value='/css/form.css' />">
</head>
<body>
  
<div class="container">
    <h2>Update Customer</h2>

    <form action="<c:url value='/registerCustomer' />" method="post">

             <!-- IMPORTANT: keep id hidden for update -->
        <input type="hidden" name="id" value="${customer.id}" />

        <label>First Name</label>
        <input type="text" name="fname" value="${customer.fname}" required />

        <label>Last Name</label>
        <input type="text" name="lname" value="${customer.lname}" required />

        <label>City</label>
        <input type="text" name="city" value="${customer.city}" required />

        <div class="actions">
            <button type="submit">Update</button>
            <a href="<c:url value='/cxinfo' />">Back</a>
        </div>

    </form>
</div>

</body>
</html>
