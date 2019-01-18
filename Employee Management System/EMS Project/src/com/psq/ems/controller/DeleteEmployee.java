package com.psq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psq.ems.employee.daoimpl.EmployeeDAOImpl;
import com.psq.ems.pojo.Pojo;

public class DeleteEmployee extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
		int employeeid =Integer.parseInt(request.getParameter("employeeid"));
		
		Pojo p = new Pojo();
		p.setEmployeeId(employeeid);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.deleteEmployee(p);
		System.out.println(x+"Details Deleted");	
		
		out.print("Record Deleted");  
	    RequestDispatcher rd=request.getRequestDispatcher("/deleteDetails.jsp");  
	    rd.include(request, response);
	}

}
