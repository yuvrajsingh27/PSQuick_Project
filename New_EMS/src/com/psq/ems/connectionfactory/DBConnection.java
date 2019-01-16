package com.psq.ems.connectionfactory;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	public static Connection createConnection()
	{
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/ps_employee";;
		String username="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
}
