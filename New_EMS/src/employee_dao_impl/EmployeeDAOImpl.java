package employee_dao_impl;
import java.sql.ResultSet;
import java.sql.*;
import model.*;
import util.*;
import employee_DAO.*;
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
		String employeeName= p.getEmployeeName();
		try {
		pst=con.prepareStatement("insert into Employee values (?,?) where Id_Employee=?");
		pst.setInt(1, employeeId);
		pst.setString(2, employeeName);
		pst.setInt(3, employeeId);
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
		rs =st.executeQuery("select * from Employee where Id_Employee="+employeeId+"");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return rs;
	}

	@Override
	public ResultSet sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet employeeOnProject() {
		int projectId = p.getProjectId();
		return null;
	}

	@Override
	public int assignProject() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProject() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int manageSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
