package com.psq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.psq.ems.pojo.*;
import com.psq.ems.employee.daoimpl.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
		
		res.setContentType("text/html");  
	    PrintWriter out = res.getWriter();
		
		int id =Integer.parseInt(req.getParameter("employeeID"));
		String name = req.getParameter("employeeName");
		String phoneNo =req.getParameter("contactno");
		String emailid = req.getParameter("emailid");
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		p.setEmployeeName(name);
		p.setPhoneNo(phoneNo);
		p.setEmail(emailid);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.addEmployee(p);
	    System.out.println(x+"Employee Added");
	     if(x==1) {
	    out.print("Employee Record Added");  
        RequestDispatcher rd=req.getRequestDispatcher("/addEmployeeDetails.jsp");  
        rd.include(req, res);
	     }
	     else {
	    	 RequestDispatcher rd=req.getRequestDispatcher("/Error.jsp");  
	         rd.include(req, res);
	 	     }
	     }
	    
	    
	}
	
