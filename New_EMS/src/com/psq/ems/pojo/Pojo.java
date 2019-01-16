package com.psq.ems.pojo;

public class Pojo {
	private static String employeeName;
	private static int employeeId;
	private static String phoneNo;
	private static String email;
	private static String projectdetails;
	private static int projectId;
	private static int salary;
	
	
	
	public String getEmployeeName() {
		
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		Pojo.employeeName = employeeName;
		
	}
	
	
	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Pojo.email = email;
	}
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		Pojo.employeeId = employeeId;
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		Pojo.projectId = projectId;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		Pojo.salary = salary;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		Pojo.phoneNo = phoneNo;
	}

	public String getProjectdetails() {
		return projectdetails;
	}

	public void setProjectdetails(String projectdetails) {
		Pojo.projectdetails = projectdetails;
	}
	
	

}
