<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ResultSet resultset = (ResultSet)request.getAttribute("rs");
while(resultset.next())
{
%>
<table>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>emailid</th>
    <th>contactno</th>
  </tr>
  <tr>
    <td><%=resultset.getString("id")%></td>
    <td><%=resultset.getString("name")%></td>
    <td><%=resultset.getString("emailid")%></td>
    <td><%=resultset.getString("contactno")%></td>
  </tr>
</table>
<%
}
%>
</body>
</html>