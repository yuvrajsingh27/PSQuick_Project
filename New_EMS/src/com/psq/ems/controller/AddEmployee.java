package com.psq.ems.controller;

import java.io.IOException;
import com.psq.ems.pojo.*;
import com.psq.ems.employee.daoimpl.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
		int id =Integer.parseInt(req.getParameter("employeeID"));
		String name = req.getParameter("employeeName");
		String phoneNo =req.getParameter("contactno");
		String address = req.getParameter("emailid");
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		p.setEmployeeName(name);
		p.setPhoneNo(phoneNo);
		Pojo.setEmail(address);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.addEmployee();
	    System.out.println(x+"Employee Added");	
	}
	

}
