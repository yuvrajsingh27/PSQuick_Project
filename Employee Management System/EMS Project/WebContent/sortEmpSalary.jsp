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
<h2>Employee Sorted List in Ascending Salary</h2>
<%
@SuppressWarnings("unchecked")
ArrayList<Pojo> list=(ArrayList<Pojo>)request.getAttribute("rs");
Pojo p=null;
for (int i = 0; i < list.size(); i++) {
	p=list.get(i);
	out.println(p.getEmployeeName());
	out.println(p.getSalary());
	out.println("<br>");
}
%>
</body>
</html>