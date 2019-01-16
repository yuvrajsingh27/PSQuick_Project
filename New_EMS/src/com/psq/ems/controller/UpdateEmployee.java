package com.psq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psq.ems.pojo.*;
import com.psq.ems.employee.daoimpl.*;


public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("ID1"));
		String name = request.getParameter("employeeName");
		String phoneNo =request.getParameter("contactno");
		String address = request.getParameter("emailid");
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		p.setEmployeeName(name);
		p.setPhoneNo(phoneNo);
		Pojo.setEmail(address);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.updateEmployee();
		System.out.println(x+"Employee Added");	
	}

}
