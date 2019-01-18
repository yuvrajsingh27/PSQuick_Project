package com.psq.ems.employee.dao;
import java.util.ArrayList;

import com.psq.ems.pojo.Pojo;

public interface EmployeeDAO {
	public int addEmployee(Pojo P);
	public int deleteEmployee(Pojo P);
	public int updateEmployee(Pojo P);
	public ArrayList<Pojo> viewEmployee(Pojo P);
	public ArrayList<Pojo> viewSalaryEmployee(Pojo P);
	public int updateSalary(Pojo P);
	public ArrayList<Pojo> sortEmployeeBySalary(Pojo P);
	public ArrayList<Pojo> viewEmployeeProject(Pojo P);
	public int employeeOnProject(Pojo P);
	public int assignProject(Pojo P);
	public int addProject(Pojo P);
	public int addSalary(Pojo P);
}
