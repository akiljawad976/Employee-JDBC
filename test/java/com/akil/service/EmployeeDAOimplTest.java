package com.akil.service;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.akil.model.Employee;

public class EmployeeDAOimplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

//	@Test
//	public void testEmployeeAdd() throws SQLException {
//		Employee emp = new Employee(2,"Messi","550000$","Argentina","River Plate","B222");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.addEmployee(emp);
//		assertEquals(true, done);
//	}

//	@Test
//	public void testEmployeeUpdate() throws SQLException {
//		Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.updateEmployee(emp);
//		assertEquals(true, done);
//	}

//	@Test
//	public void testEmployeeDelete() throws SQLException {
//		//Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.deleteEmployee(2);
//		assertEquals(true, done);
//	}

//	@Test
//	public void testEmployeeGet() throws SQLException {
//		//Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		String done = empdao.getEmployee(2);
//		assertEquals("Ronaldo", done);
//	}

//	@Test
//	public void testEmployeeGetFullData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		Employee done = empdao.getEmployeeData(4);
//		assertEquals(new Employee(4,"Kaka","150000$","Brazil","Rio de Jenerio","B222"), done);
//		assertNotEquals(new Employee(2,"Messi","550000$","Argentina","River Plate","B222"), done);
//	}
	@Test
	public void testdisplay() throws SQLException {
		// Employee emp = new Employee(3,"/","/","/","/","/");
		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
		empdao.display();
	}

}
