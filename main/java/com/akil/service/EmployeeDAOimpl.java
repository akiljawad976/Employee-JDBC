package com.akil.service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.akil.dao.EmployeeDAO;
import com.akil.dao.EmployeeInfoDAO;
import com.akil.databaseUtil.DBOperations;
import com.akil.databaseUtil.JDBCConnection;
import com.akil.model.Employee;
import com.akil.model.EmployeeInfo;

public class EmployeeDAOimpl implements EmployeeDAO,EmployeeInfoDAO {

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
	public double getSecondMin() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getSecondMin();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
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
	public double getMaxSalary() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getMaxSalary();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public double getMinSalary() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getMinSalary();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public Employee getMinSalaryEmpInfo() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getMinSalaryEmp();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public double getSecondMax() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getSecondMax();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public ArrayList<Employee> displayTop3Max() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.displayTop3Max();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public double getAverage() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getAverageSalary();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
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

	@Override
	public Employee getNameLike() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getNameLike();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getCountryIn() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getCountryIn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getSalaryBetween() {
		DBOperations dbo = new DBOperations();
		try {
			return dbo.getSalaryBetween();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	@Override
	public boolean addEmployeeInfo(EmployeeInfo user) {
		DBOperations dbo = new DBOperations();
		try {
			dbo.insertDataInEmploeeInfo(user);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean InnerJoinByID() {
		DBOperations dbo = new DBOperations();
		try {
			dbo.innerJoin();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean LeftJoinByID() {
		DBOperations dbo = new DBOperations();
		try {
			dbo.leftJoin();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean RightJoinByID() {
		DBOperations dbo = new DBOperations();
		try {
			dbo.rightJoin();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean FullJoinByID() {
		DBOperations dbo = new DBOperations();
		try {
			dbo.fullJoin();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean SelfJoinByID() {
		DBOperations dbo = new DBOperations();
		try {
			dbo.selfJoin();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	
}
