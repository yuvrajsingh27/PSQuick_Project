package com.psq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psq.ems.pojo.*;
import com.psq.ems.employee.daoimpl.*;


public class AddSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException {
		int id =Integer.parseInt(req.getParameter("employeeid"));
		int salary =Integer.parseInt(req.getParameter("salary"));
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		p.setSalary(salary);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.addSalary();
	    System.out.println(x+"Salary Added");
	}
}
