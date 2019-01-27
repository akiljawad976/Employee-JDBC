package com.akil.service;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.akil.model.Employee;
import com.akil.model.EmployeeInfo;

public class EmployeeDAOimplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

//	@Test
//	public void testEmployeeAdd() throws SQLException {
//		//Employee emp = new Employee(4,"Neymar",450000,"Brazil","Rio de Jenerio","B225");
//		Employee emp = new Employee(8,"Mesut Ozil",400000,"Germany","Cairo","A234");
//		Employee emp2 = new Employee(9,"Sergio Aguero",480000,"Argentina","Buence Aearce","25A");
////		Employee emp3 = new Employee(7,"Harry Kane",350000,"England","Manchester","B2567");
////		Employee emp4 = new Employee(4,"Kaka",250000.464,"Brazil","Rio de Jenerio","A25");
////		Employee emp5 = new Employee(3,"Neymar",450000.567,"Brazil","Rio de Jenerio","D67");
////		Employee emp6 = new Employee(2,"Messi",600000.12344,"Argentina","River Plate","E56");
////		Employee emp7 = new Employee(1,"Ronaldo",650000.1243,"Portugal","Lisbon","G26");
//
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.addEmployee(emp);
//		boolean done2 = empdao.addEmployee(emp2);
////		boolean done3 = empdao.addEmployee(emp3);
////		boolean done4 = empdao.addEmployee(emp4);
////		boolean done5 = empdao.addEmployee(emp5);
////		boolean done6 = empdao.addEmployee(emp6);
////		boolean done7 = empdao.addEmployee(emp7);
//
//		//assertEquals(true, done);
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
//		boolean done = empdao.deleteEmployee(4);
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
//	@Test
//	public void testEmployeeGetMaxData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		double done = empdao.getMaxSalary();
//		assertEquals(650000, done,0.1);
//		//assertNotEquals(new Employee(2,"Messi","550000$","Argentina","River Plate","B222"), done);
//	}
//	@Test
//	public void testEmployeeGetMinData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		double done = empdao.getMinSalary();
//		assertNotEquals(150000, done,0.1);
//		assertEquals(350000, done,0.1);
//		//assertNotEquals(new Employee(2,"Messi","550000$","Argentina","River Plate","B222"), done);
//	}
//	@Test
//	public void testMinEmployeeData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		Employee done = empdao.getMinSalaryEmpInfo();
//		//assertNotEquals(150000, done,0.1);
//		//assertEquals(350000, done,0.1);
//		assertNotEquals(new Employee(3,"Kaka",350000,"Brazil","Rio de Jenerio","B225"), done);
//	}
//	@Test
//	public void testDisplayTop3Max() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		ArrayList<Employee> list = empdao.displayTop3Max();
//		assertEquals(new Employee(2,"Ronaldo",650000,"Portugal","Lisbon","B215"), list.get(0));
//	}
//	@Test
//	public void testEmployeeGetAverageData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		double done = empdao.getAverage();
//		assertNotEquals(650000, done,0.1);
//		//assertNotEquals(new Employee(2,"Messi","550000$","Argentina","River Plate","B222"), done);
//	}
//	@Test
//	public void testEmployeeGetSecondMaxData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		double done = empdao.getSecondMax();
//		assertEquals(600000, done,0.1);
//		//assertNotEquals(new Employee(2,"Messi","550000$","Argentina","River Plate","B222"), done);
//	}
//	@Test
//	public void testEmployeeGetSecondMinData() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		double done = empdao.getSecondMin();
//		assertEquals(350000, done,0.1);
//		//assertNotEquals(new Employee(2,"Messi","550000$","Argentina","River Plate","B222"), done);
//	}
//	@Test
//	public void testNameLike() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		Employee done = empdao.getNameLike();
//		//assertNotEquals(150000, done,0.1);
//		//assertEquals(350000, done,0.1);
//		assertEquals(new Employee(2,"Messi",600000,"Argentina","River Plate","E56"), done);
//	}
//	@Test
//	public void testCountryIN() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		ArrayList<Employee> list = empdao.getCountryIn();
//		assertEquals(4,list.size());
//	}
//	@Test
//	public void testCountryIN() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		ArrayList<Employee> list = empdao.getSalaryBetween();
//		assertEquals(4,list.size());
//	}
//	@Test
//	public void testdisplay() throws SQLException {
//		// Employee emp = new Employee(3,"/","/","/","/","/");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		empdao.display();
//	}
//	@Test
//	public void testEmployeeInfoAdd() throws SQLException {
//		//Employee emp = new Employee(4,"Neymar",450000,"Brazil","Rio de Jenerio","B225");
//		EmployeeInfo emp = new EmployeeInfo(10,"ibrahimovic11@gmail.com","159753");
//		EmployeeInfo emp2 = new EmployeeInfo(11,"mbappe10@gmail.com","852456");
////		EmployeeInfo emp3 = new EmployeeInfo(7,"Kane11@gmail.com","785468");
////		EmployeeInfo emp4 = new EmployeeInfo(4,"kaka11@gmail.com","12344568");
////		EmployeeInfo emp5 = new EmployeeInfo(3,"neymar11@gmail.com","1237468");
////		EmployeeInfo emp6 = new EmployeeInfo(2,"messi11@gmail.com","1234038");
////		EmployeeInfo emp7 = new EmployeeInfo(1,"ronaldo11@gmail.com","453468");
//
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.addEmployeeInfo(emp);
//		boolean done2 = empdao.addEmployeeInfo(emp2);
////		boolean done3 = empdao.addEmployeeInfo(emp3);
////		boolean done4 = empdao.addEmployeeInfo(emp4);
////		boolean done5 = empdao.addEmployeeInfo(emp5);
////		boolean done6 = empdao.addEmployeeInfo(emp6);
////		boolean done7 = empdao.addEmployeeInfo(emp7);
//
//		assertEquals(true, done);
//	}
	
//	@Test
//	public void testInnerJoin() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.InnerJoinByID();
//		assertEquals(true, done);
//	}
//	@Test
//	public void testLeftJoin() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.LeftJoinByID();
//		assertEquals(true, done);
//	}
//	@Test
//	public void testRightJoin() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.RightJoinByID();
//		assertEquals(true, done);
//	}
//	@Test
//	public void testFullJoin() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.FullJoinByID();
//		assertEquals(true, done);
//	}
//	@Test
//	public void testSelfJoin() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.SelfJoinByID();
//		assertEquals(true, done);
//	}
//	@Test
//	public void testAlterTable() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.AlterTableData("TelePhone");
//		assertEquals(true, done);
//	}
//	@Test
//	public void testDropTableColumn() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.DropTableData("Fax");
//		assertEquals(true, done);
//	}
//	@Test
//	public void testModifyTableColumn() throws SQLException {
//		//Employee emp = new Employee(1,"Ronaldo","250000","adas","asfa","asfd");
//		EmployeeDAOimpl empdao = new EmployeeDAOimpl();
//		boolean done = empdao.ModifyTableData("TelePhone");
//		assertEquals(true, done);
//	}
}
