<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="response" method="POST">
		<table>
			<tr>
			<th>Employee ID</th>
			<td> <input type="text" name="eid"></td>
			</tr>
			
			<tr>
			<th>Employee Name</th>
			<td> <input type="text" name="ename"></td>
			</tr>
			
			<tr>
			<th>Employee City</th>
			<td> <input type="text" name="ecity"></td>
			</tr>
			
			<tr>
			<th>Employee Salary</th>
			<td> <input type="number" name="esalary"></td>
			</tr>
			
			<tr> 
			<td> <input type="submit" name="Submit"></td>
			</tr>
		</table>
	</form>	

</body>
</html>