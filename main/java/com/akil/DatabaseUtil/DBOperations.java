package com.akil.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.akil.model.Employee;

public class DBOperations {
	public Connection getInit() {
		JDBCConnection jdb = JDBCConnection.getInstance();
		Connection conn = jdb.getConnection();
		return conn;
	}

	public void insertData(Employee user) throws SQLException {

		String insertSQL = "INSERT INTO dbo.T_Employee_Akil"
				+ "(Employee_ID, Employee_Name,Employee_Salary, Employee_Country, Employee_City, Employee_ZipCode) VALUES"
				+ "(?,?,?,?,?,?)";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.setInt(1, user.getE_id());
		statement.setString(2, user.getE_name());
		statement.setString(3, user.getE_salary());
		statement.setString(4, user.getE_country());
		statement.setString(5, user.getE_city());
		statement.setString(6, user.getE_zipcode());
		statement.executeUpdate();
	}

	public void updateData(Employee user) throws SQLException {

		String insertSQL = "UPDATE dbo.T_Employee_Akil "
				+ "SET Employee_Name=? ,"
				+ "Employee_Salary=?,"
				+ "Employee_Country=?,"
				+ "Employee_City=?,"
				+ "Employee_ZipCode=? "
				+ "WHERE Employee_ID=?";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.setString(1, user.getE_name());
		statement.setString(2, user.getE_salary());
		statement.setString(3, user.getE_country());
		statement.setString(4, user.getE_city());
		statement.setString(5, user.getE_zipcode());
		statement.setInt(6, user.getE_id());
		statement.executeUpdate();
		statement.close();
	}
	public void deleteData(int id) throws SQLException {

		String insertSQL = "DELETE dbo.T_Employee_Akil WHERE Employee_ID = ?";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.setInt(1, id);
		statement.executeUpdate();
		statement.close();
	}
	public String getData(int id) throws SQLException {

		String insertSQL = "SELECT Employee_Name FROM dbo.T_Employee_Akil WHERE Employee_ID = "+id;
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs=statement.executeQuery();
		//statement.setInt(1, id);
		//rs = statement.executeQuery("SELECT Employee_Name FROM dbo.T_Employee_Akil WHERE Employee_ID = "+id);
//		statement.executeUpdate();
//		statement.close();
		while(rs.next()) {
			String name = rs.getString("Employee_Name");
			return name;
		}
		return null;
	}
	public Employee getFullData(int id) throws SQLException {

		String insertSQL = "SELECT Employee_Name,"
				+ " Employee_Salary,"
				+ " Employee_Country,"
				+ " Employee_City,"
				+ " Employee_ZipCode"
				+ " FROM dbo.T_Employee_Akil WHERE Employee_ID = "+id;
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs=statement.executeQuery();
		//statement.setInt(1, id);
		//rs = statement.executeQuery("SELECT Employee_Name FROM dbo.T_Employee_Akil WHERE Employee_ID = "+id);
//		statement.executeUpdate();
//		statement.close();
		while(rs.next()) {
			String name = rs.getString("Employee_Name");
			String salary = rs.getString("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id,name,salary,country,city,zipcode);
			return emp;
		}
		return null;
	}
	public void display() throws SQLException {

		String insertSQL = "SELECT *FROM dbo.T_Employee_Akil";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs=statement.executeQuery();
		//statement.setInt(1, id);
		//rs = statement.executeQuery("SELECT Employee_Name FROM dbo.T_Employee_Akil WHERE Employee_ID = "+id);
//		statement.executeUpdate();
//		statement.close();
		while(rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			String salary = rs.getString("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id,name,salary,country,city,zipcode);
			System.out.println("ID: "+id+" Name: " + name + ", Salary: " + salary + ", Country: " + country + ", City: " + city
					+ ", Zip code : " + zipcode);
		}
		
	}
}
