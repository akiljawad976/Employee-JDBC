package com.akil.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.akil.model.Employee;

public interface EmployeeDAO {
	boolean addEmployee(Employee user);
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee user);
	Employee getEmployeeData(int userId);
	String getEmployeeName(int userId);
	double getMaxSalary();
	double getMinSalary();
	Employee getMinSalaryEmpInfo();
	void display();
	double getAverage();
	double getSecondMax();
	double getSecondMin();
	Employee getNameLike();
	ArrayList<Employee> getCountryIn();
	ArrayList<Employee> getSalaryBetween(); 
	ArrayList<Employee> displayTop3Max();
	List<Employee> listAll();
}
