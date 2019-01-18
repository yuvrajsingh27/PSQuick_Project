<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*"%>
    <%@ page import="java.util.*"%>
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
	out.println("<h2>Details Of Employee :</h2><br>");
	out.println("id : "+ p.getEmployeeId());
	out.println("<br><br>");
	out.println("Name : "+ p.getEmployeeName());
	out.println("<br><br>");
	out.println("Email Id : "+ p.getEmail());
	out.println("<br><br>");
	out.println("Contact No : "+ p.getPhoneNo());
}
%>

</body>
</html>