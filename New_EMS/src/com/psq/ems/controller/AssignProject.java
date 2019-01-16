package com.psq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psq.ems.employee.daoimpl.EmployeeDAOImpl;
import com.psq.ems.pojo.Pojo;

public class AssignProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int employeeid =Integer.parseInt(request.getParameter("employeeid"));
		int projectid =Integer.parseInt(request.getParameter("projectid"));
		
		Pojo p = new Pojo();
		p.setEmployeeId(employeeid);
		p.setProjectId(projectid);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.assignProject();
		System.out.println(x+" Project Assigned");	
	}

}
