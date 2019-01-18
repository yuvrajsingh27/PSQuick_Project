package com.psq.ems.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psq.ems.employee.daoimpl.*;
import com.psq.ems.pojo.Pojo;

public class SortSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		
		Pojo p = new Pojo();
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		ArrayList<Pojo> al=e.sortEmployeeBySalary(p);
		System.out.println(al);
		request.setAttribute("rs", al);
		request.getRequestDispatcher("sortEmpSalary.jsp").forward(request, response);
	}

}
