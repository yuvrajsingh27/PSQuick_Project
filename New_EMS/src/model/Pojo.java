package model;

public class Pojo {
	private static String employeeName;
	
	private static int employeeId;
	private static String phoneNo;
	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Pojo.email = email;
	}
	private static String email;
	private static String projectName;
	private static int projectId;
	private static int salary;
	private static String projectDesciption;
	
	
	public String getEmployeeName() {
		
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		Pojo.employeeName = employeeName;
		
	}
	public int getEmployeeId() {
		
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		Pojo.employeeId = employeeId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		Pojo.projectName = projectName;
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
	public String getProjectDesciption() {
		return projectDesciption;
	}
	public void setProjectDesciption(String projectDesciption) {
		Pojo.projectDesciption = projectDesciption;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		Pojo.phoneNo = phoneNo;
	}
	
	

}
