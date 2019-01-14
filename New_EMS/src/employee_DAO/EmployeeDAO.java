package employee_DAO;
import java.sql.ResultSet;

public interface EmployeeDAO {
	public int addEmployee();
	public int deleteEmployee();
	public int updateEmployee();
	public ResultSet viewEmployee();
	public ResultSet sortEmployeeBySalary();
	public ResultSet employeeOnProject();
	public int assignProject();
	public int addProject();
	public int manageSalary();
}
