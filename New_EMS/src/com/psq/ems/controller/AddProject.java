package com.psq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psq.ems.employee.daoimpl.EmployeeDAOImpl;
import com.psq.ems.pojo.Pojo;

public class AddProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int projectid =Integer.parseInt(request.getParameter("projectid"));
	String projectdetails = request.getParameter("projectdesc");
	
	Pojo p = new Pojo();
	p.setProjectId(projectid);
	p.setProjectdetails(projectdetails);
	
	EmployeeDAOImpl e = new EmployeeDAOImpl();
	int x =e.addProject();
    System.out.println(x+"Project Added");	
	}

}
