package com.akil.dao;

import java.sql.SQLException;
import java.util.List;

import com.akil.model.Employee;

public interface EmployeeDAO {
	boolean addEmployee(Employee user);
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee user);
	Employee getEmployeeData(int userId);
	String getEmployeeName(int userId);
	void display();
	List<Employee> listAll();
}
