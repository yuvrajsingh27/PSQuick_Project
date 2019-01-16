package com.psq.ems.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psq.ems.employee.daoimpl.*;

public class SortSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		ResultSet rs=e.sortEmployeeBySalary();
		System.out.println("yuvraj");
		System.out.println(rs);
		try {
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
