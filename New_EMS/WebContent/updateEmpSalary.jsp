<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
ResultSet resultset = (ResultSet)request.getAttribute("rs");
while(resultset.next()) {
%>
<h2>Update Salary to Employee :</h2><br>
<form action="UpdateSalary" method="post">
Employee Id: <input type="text" name="employeeid" value=<%=resultset.getString("employee_id")%>>
Salary : <input type="text" name="salary" value=<%=resultset.getString("salary")%>>
<input type="submit" value="Update"> 
</form>
<%
}
%>
</body>
</html>