package com.psq.ems.employee.daoimpl;
import java.sql.ResultSet;
import java.sql.*;
import com.psq.ems.connectionfactory.*;
import com.psq.ems.pojo.*;
import com.psq.ems.employee.dao.*;
public class EmployeeDAOImpl implements EmployeeDAO{
	
	public Pojo p = new Pojo();
	private Connection con=DBConnection.createConnection();
	private Statement st=null;
	private PreparedStatement pst=null;
	public ResultSet rs;
	
	@Override
	public int addEmployee( ) {
		
		int employeeAdded=0;
		int employeeId = p.getEmployeeId();
		String employeeName= p.getEmployeeName();
		String phoneNo = p.getPhoneNo();
		String Email = Pojo.getEmail();
			
		try {
		pst=con.prepareStatement("insert into Employee values (?,?,?,?)");
		pst.setInt(1, employeeId);
		pst.setString(2, employeeName);
		pst.setString(3, Email);
		pst.setString(4, phoneNo);
		employeeAdded =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return employeeAdded;
	}

	@Override
	public int deleteEmployee() {
		int employeeDeleted=0;
		int employeeId = p.getEmployeeId();
		try {
		pst=con.prepareStatement("delete from Employee where Id_Employee=?");
		pst.setInt(1, employeeId);
		employeeDeleted =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return employeeDeleted;
	}

	@Override
	public int updateEmployee( ) {
		
		int employeeUpdated=0;
		int employeeId = p.getEmployeeId();
		String name=p.getEmployeeName();
		String phoneno=p.getPhoneNo();
		String Emailid=Pojo.getEmail();
		try {
		pst=con.prepareStatement("update employee set name=?,emailid=?,contactno=? where id="+employeeId+"");
		pst.setString(1, name);
		pst.setString(2, Emailid);
		pst.setString(3, phoneno);
		
		employeeUpdated =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return employeeUpdated;
	}

	@Override
	public ResultSet viewEmployee() {
		int employeeId = p.getEmployeeId();
		try {
		st=con.createStatement();
		rs =st.executeQuery("select * from Employee where id="+employeeId+"");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return rs;
	}
	
	@Override
	public ResultSet viewSalaryEmployee() {
		int employeeId = p.getEmployeeId();
		try {
		st=con.createStatement();
		rs =st.executeQuery("select employee_id,salary from salary where employee_id="+employeeId+"");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return rs;
	}
	
		@Override
		public int addSalary( ) {
		
		int salaryadded=0;
		int employeeId = p.getEmployeeId();
		int Salary = p.getSalary();
			
		try {
		pst=con.prepareStatement("insert into salary values (?,?)");
		pst.setInt(1, employeeId);
		pst.setInt(2, Salary);
		
		salaryadded =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return salaryadded;
	}
	
		@Override
		public ResultSet sortEmployeeBySalary() {
		
			try {
			st=con.createStatement();
			rs =st.executeQuery("Select name, salary from employee, salary where id=employee_id");
			}
			catch(SQLException e) {
				System.out.println(e);
			}
			return rs;
		}
		
		@Override
		public int updateSalary( ) {
			
			int employeeUpdated=0;
			int employeeId = p.getEmployeeId();
			int salary = p.getSalary();
			try {
			pst=con.prepareStatement("update salary set salary=? where employee_id="+employeeId+"");
			pst.setInt(1, salary);
			
			
			employeeUpdated =pst.executeUpdate();
			}
			catch(SQLException e) {
				System.out.println(e);
			}
			return employeeUpdated;
		}
		
	

	@Override
	public ResultSet employeeOnProject() {
		int projectId = p.getProjectId();
		return null;
	}

	@Override
	public int assignProject() {
		int assigned=0;
		int employeeId = p.getEmployeeId();
		int projectid = p.getProjectId();
			
		try {
		pst=con.prepareStatement("insert into employeeproject values (?,?)");
		pst.setInt(1, employeeId);
		pst.setInt(2, projectid);
		
		assigned =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return assigned;
		
	}

	@Override
	public int addProject() {
		int projectAdded=0;
		int projectId = p.getProjectId();
		String projectdetails= p.getProjectdetails();
		
			
		try {
		pst=con.prepareStatement("insert into project values (?,?)");
		pst.setInt(1, projectId);
		pst.setString(2, projectdetails);
		
		projectAdded =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return projectAdded;
		
	}

	

	

}
