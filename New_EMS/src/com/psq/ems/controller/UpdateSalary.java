package com.psq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psq.ems.employee.daoimpl.EmployeeDAOImpl;
import com.psq.ems.pojo.Pojo;

public class UpdateSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("employeeid"));
		int salary =Integer.parseInt(request.getParameter("salary"));
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		p.setSalary(salary);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.updateSalary();
	    System.out.println(x+"Salary Added");
	}

}
