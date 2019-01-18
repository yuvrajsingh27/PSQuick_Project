package com.psq.ems.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.psq.ems.employee.daoimpl.EmployeeDAOImpl;
import com.psq.ems.pojo.Pojo;

class EmployeeDAOImplTest {

	@Test
	void testAddEmployee() {
		
		Pojo p = new Pojo();
		p.setEmployeeId(10);
		p.setEmployeeName("himanshu sir");
		p.setPhoneNo("9871162854");
		p.setEmail("sir@gmail.com");
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.addEmployee(p);
		assertEquals(1,x);
		
	}

}
