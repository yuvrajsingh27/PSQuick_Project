<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
ResultSet resultset = (ResultSet)request.getAttribute("rs");
while(resultset.next())
{
%>
<br><br><br>
<div class="row">
	<div class="col-sm-12">
	<div class="col-sm-2"></div>
	<div class="col-sm-10">
		<form action="UpdateEmployee" method="post">
			<div class="form-group">
				<input type="hidden" id="ID" name="ID1" value="<%=resultset.getString("id")%>">
               	<label class="col-sm-2">Name:</label>
                <input type="text" class="col-sm-2" style="border-radius:5px; padding-left:2px;" value=<%=resultset.getString("name")%> name="employeeName"><br><br>
                <label class="col-sm-2">EmailId:</label>
                <input type="text" class="col-sm-2" style="border-radius:5px; padding-left:2px;" value=<%=resultset.getString("emailid")%> name="emailid"><br><br>
				<label class="col-sm-2">ContactNo:</label>
                <input type="text" class="col-sm-2" style="border-radius:5px; padding-left:2px;" value=<%=resultset.getString("contactno")%> name="contactno"><br><br>
				<div class="col-sm-2"></div>
				<input type="submit" class="col-sm-2" value="Update Details">
			</div>
		</form>
	</div>
	</div>
</div>
<%} %>
</body>
</html>