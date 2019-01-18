package com.psq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psq.ems.pojo.*;
import com.psq.ems.employee.daoimpl.*;


public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
		int id =Integer.parseInt(request.getParameter("employeeid"));
		String name = request.getParameter("employeeName");
		String phoneNo =request.getParameter("contactno");
		String emailid = request.getParameter("emailid");
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		p.setEmployeeName(name);
		p.setPhoneNo(phoneNo);
		p.setEmail(emailid);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.updateEmployee(p);
		System.out.println(x+"Employee updated");
		
		out.print("Employee Record Updated");  
	    RequestDispatcher rd=request.getRequestDispatcher("/updatemain.jsp");  
	    rd.include(request, response);
		
		
		
	}

}
