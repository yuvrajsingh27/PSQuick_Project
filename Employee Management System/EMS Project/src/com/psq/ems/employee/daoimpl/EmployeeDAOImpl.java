package com.psq.ems.employee.daoimpl;
import java.sql.ResultSet;
import java.util.ArrayList;
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
	public int addEmployee(Pojo P) {
		
		int employeeAdded=0;
		int employeeId = p.getEmployeeId();
		String employeeName= p.getEmployeeName();
		String phoneNo = p.getPhoneNo();
		String Email = p.getEmail();
			
		try {
		pst=con.prepareStatement("insert into Employee values (?,?,?,?)");
		pst.setInt(1, employeeId);
		pst.setString(2, employeeName);
		pst.setString(3, Email);
		pst.setString(4, phoneNo);
		employeeAdded =pst.executeUpdate();
		}
		catch(SQLException e) {
			return employeeAdded;
		}
		return employeeAdded;
	}

	@Override
	public int deleteEmployee(Pojo P) {
		int employeeDeleted=0;
		int employeeId = p.getEmployeeId();
		try {
		pst=con.prepareStatement("delete from salary where employee_id=?");
		pst.setInt(1, employeeId);
		employeeDeleted =pst.executeUpdate();
		
		pst=con.prepareStatement("delete from employeeproject where Emp_id=?");
		pst.setInt(1, employeeId);
		employeeDeleted =pst.executeUpdate();
		
		pst=con.prepareStatement("delete from employee where id=?");
		pst.setInt(1, employeeId);
		employeeDeleted =pst.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return employeeDeleted;
	}

	@Override
	public int updateEmployee(Pojo P) {
		
		int employeeUpdated=0;
		int employeeId = p.getEmployeeId();
		String name=p.getEmployeeName();
		String phoneno=p.getPhoneNo();
		String Emailid=p.getEmail();
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
	public ArrayList<Pojo> viewEmployee(Pojo P) {
		int employeeId = p.getEmployeeId();
		ArrayList<Pojo> al=new ArrayList<Pojo>();
		try {
		st=con.createStatement();
		rs =st.executeQuery("select * from Employee where id="+employeeId+"");
		while (rs.next()) {
			p.setEmployeeId(rs.getInt("id"));
			p.setEmployeeName(rs.getString("name"));
			p.setEmail(rs.getString("emailid"));
			p.setPhoneNo(rs.getString("contactno"));
			
			al.add(p);
		}
	}
		catch(SQLException e) {
			System.out.println(e);
		}
		return al;
	}
	
	@Override
	public ArrayList<Pojo> viewSalaryEmployee(Pojo P) {
		int employeeId = p.getEmployeeId();
		ArrayList<Pojo> al=new ArrayList<Pojo>();
		try {
		st=con.createStatement();
		rs =st.executeQuery("select employee_id,salary from salary where employee_id="+employeeId+"");
		while (rs.next()) {
			p.setEmployeeId(rs.getInt("employee_id"));
			p.setSalary(rs.getInt("salary"));
			al.add(p);
		}
		
	}	catch(SQLException e) {
			System.out.println(e);
		}
		return al;
	}
	
		@Override
		public int addSalary(Pojo P) {
		
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
		public ArrayList<Pojo> sortEmployeeBySalary(Pojo P) {
			ArrayList<Pojo> al=new ArrayList<Pojo>();
			try {
			st=con.createStatement();
			rs =st.executeQuery("Select name, salary from employee, salary where id=employee_id order by salary");
			while (rs.next()) {
				Pojo obj=new Pojo();
				obj.setEmployeeName(rs.getString("name"));
				obj.setSalary(rs.getInt("salary"));
				al.add(obj);
			}
			}
			catch(SQLException e) {
				System.out.println(e);
			}
			return al;
		}
		
		@Override
		public int updateSalary(Pojo P) {
			
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
		public ArrayList<Pojo> viewEmployeeProject(Pojo P) {
			int employeeid = p.getEmployeeId();
			ArrayList<Pojo> al=new ArrayList<Pojo>();
			try {
			st=con.createStatement();
			rs =st.executeQuery("Select Emp_id,Project_id from employeeproject where Emp_id="+employeeid+"");
			while (rs.next()) {
				p.setEmployeeId(rs.getInt("Emp_id"));
				p.setProjectId(rs.getInt("Project_id"));
				al.add(p);
			}
		}
			catch(SQLException e) {
				System.out.println(e);
			}
			return al;
		}
	

	@Override
	public int employeeOnProject(Pojo P) {
		
		int employeeProjectUpdated=0;
		int employeeid = p.getEmployeeId();
		int projectid=p.getProjectId();
		try {
			pst=con.prepareStatement("update employeeproject set Project_id=? where Emp_id="+employeeid+"");
			pst.setInt(1, projectid);
			
			
			employeeProjectUpdated =pst.executeUpdate();
			}
			catch(SQLException e) {
				System.out.println(e);
			}
			return employeeProjectUpdated;
	}

	@Override
	public int assignProject(Pojo P) {
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
	public int addProject(Pojo P) {
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
