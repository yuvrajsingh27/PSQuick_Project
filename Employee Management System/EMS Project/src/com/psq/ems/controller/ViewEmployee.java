package com.psq.ems.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psq.ems.pojo.*;
import com.psq.ems.employee.daoimpl.*;

public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("employeeid"));	
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		ArrayList<Pojo> al=e.viewEmployee(p);
		System.out.println(al);
		request.setAttribute("rs", al);
		request.getRequestDispatcher("detailsbyId.jsp").forward(request, response);
	}

}
