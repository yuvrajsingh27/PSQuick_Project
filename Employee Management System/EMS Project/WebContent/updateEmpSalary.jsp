<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%> 
    <%@ page import="com.psq.ems.pojo.Pojo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
@SuppressWarnings("unchecked")
ArrayList<Pojo> list=(ArrayList<Pojo>)request.getAttribute("rs");
Pojo p=null;
for (int i = 0; i < list.size(); i++) {
	p=list.get(i);
%>
<h2>Update Salary to Employee :</h2><br>
<form action="UpdateSalary" method="post">
Employee Id: <input type="text" name="employeeid" value="<%out.println(p.getEmployeeId());%>">
Salary : <input type="text" name="salary" value="<%out.println(p.getSalary());%>">
<input type="submit" value="Update"> 
</form>
<%
}
%>
</body>
</html>