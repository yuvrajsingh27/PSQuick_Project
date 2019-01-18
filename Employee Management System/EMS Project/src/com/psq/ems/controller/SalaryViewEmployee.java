package com.psq.ems.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psq.ems.employee.daoimpl.EmployeeDAOImpl;
import com.psq.ems.pojo.Pojo;

public class SalaryViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("employeeid"));	
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		ArrayList<Pojo> al =e.viewSalaryEmployee(p);
		
		request.setAttribute("rs", al);
		request.getRequestDispatcher("updateEmpSalary.jsp").forward(request, response);
	}

}
