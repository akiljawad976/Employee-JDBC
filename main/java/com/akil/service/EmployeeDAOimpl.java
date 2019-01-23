package com.akil.service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.akil.DatabaseUtil.DBOperations;
import com.akil.DatabaseUtil.JDBCConnection;
import com.akil.dao.EmployeeDAO;
import com.akil.model.Employee;

public class EmployeeDAOimpl implements EmployeeDAO {

	private static Connection conn;

	@Override
	public boolean addEmployee(Employee user) {
		DBOperations dbo = new DBOperations();
		try {
			dbo.insertData(user);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		DBOperations dbo = new DBOperations();
		try {
			dbo.deleteData(id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee user) {
		// TODO Auto-generated method stub
		DBOperations dbo = new DBOperations();
		try {
			dbo.updateData(user);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee getEmployeeData(int userId) {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getFullData(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String getEmployeeName(int userId) {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getData(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void display() {
		DBOperations dbo = new DBOperations();
		try {
			dbo.display();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
