<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h2>Employee Details:</h2>
<a href="Alldetails.jsp"><input type="submit" value="View All Employees Data"></a>
<hr><br><br>

<form action="ViewEmployee" method="post">
Employee ID : <input type="text" name="employeeid">
<input type="submit" value="Search Employee By Id">
</form>

</body>
</html>