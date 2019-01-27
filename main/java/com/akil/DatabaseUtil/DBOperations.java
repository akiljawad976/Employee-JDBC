package com.akil.databaseUtil;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.akil.model.Employee;
import com.akil.model.EmployeeInfo;

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
		statement.setDouble(3, user.getE_salary());
		statement.setString(4, user.getE_country());
		statement.setString(5, user.getE_city());
		statement.setString(6, user.getE_zipcode());
		statement.executeUpdate();
	}

	public void updateData(Employee user) throws SQLException {

		String insertSQL = "UPDATE dbo.T_Employee_Akil " + "SET Employee_Name=? ," + "Employee_Salary=?,"
				+ "Employee_Country=?," + "Employee_City=?," + "Employee_ZipCode=? " + "WHERE Employee_ID=?";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.setString(1, user.getE_name());
		statement.setDouble(2, user.getE_salary());
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

		String insertSQL = "SELECT Employee_Name FROM dbo.T_Employee_Akil WHERE Employee_ID = " + id;
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		// statement.setInt(1, id);
		// rs = statement.executeQuery("SELECT Employee_Name FROM dbo.T_Employee_Akil
		// WHERE Employee_ID = "+id);
//		statement.executeUpdate();
//		statement.close();
		while (rs.next()) {
			String name = rs.getString("Employee_Name");
			return name;
		}
		return null;
	}

	public Employee getFullData(int id) throws SQLException {

		String insertSQL = "SELECT Employee_Name," + " Employee_Salary," + " Employee_Country," + " Employee_City,"
				+ " Employee_ZipCode" + " FROM dbo.T_Employee_Akil WHERE Employee_ID = " + id;
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		// statement.setInt(1, id);
		// rs = statement.executeQuery("SELECT Employee_Name FROM dbo.T_Employee_Akil
		// WHERE Employee_ID = "+id);
//		statement.executeUpdate();
//		statement.close();
		while (rs.next()) {
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			return emp;
		}
		return null;
	}

	public void display() throws SQLException {
		String insertSQL = "SELECT *FROM dbo.T_Employee_Akil";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			System.out.println("ID: " + id + " Name: " + name + ", Salary: " + salary + ", Country: " + country
					+ ", City: " + city + ", Zip code : " + zipcode);
		}

	}

	public double getMaxSalary() throws SQLException {

		String insertSQL = "SELECT MAX(Employee_Salary) as Max_Salary" + "				FROM [dbo].[T_Employee_Akil] ";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			double salary = rs.getDouble("Max_Salary");
			return salary;
		}
		return 0;
	}

	public double getMinSalary() throws SQLException {

		String insertSQL = "SELECT Min(Employee_Salary) as Min_Salary" + "				FROM [dbo].[T_Employee_Akil] ";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			double salary = rs.getDouble("Min_Salary");
			return salary;
		}
		return 0;
	}

	public Employee getMinSalaryEmp() throws SQLException {

		String insertSQL = "SELECT Min(Employee_Salary) as Min_Salary,Employee_ID,Employee_Name,Employee_Country,Employee_City,Employee_ZipCode"
				+ "				FROM [dbo].[T_Employee_Akil] Group by Employee_ID,Employee_Name,Employee_Country,Employee_City,Employee_ZipCode ";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Min_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			System.out.println("ID: " + id + " Name: " + name + ", Salary: " + salary + ", Country: " + country
					+ ", City: " + city + ", Zip code : " + zipcode);
			return emp;
		}
		return null;
	}

	public ArrayList<Employee> displayTop3Max() throws SQLException {
		ArrayList<Employee> list = new ArrayList<>();
		String insertSQL = "SELECT TOP 3 * FROM dbo.T_Employee_Akil ORDER BY [Employee_Salary] DESC";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			list.add(emp);
		}
		return list;
	}

	public double getAverageSalary() throws SQLException {

		String insertSQL = "SELECT AVG(Employee_Salary) as Avg_Salary FROM [dbo].[T_Employee_Akil] ";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			double salary = rs.getDouble("Avg_Salary");
			return salary;
		}
		return 0;
	}

	public double getSecondMax() throws SQLException {

		String insertSQL = "SELECT MAX(Employee_Salary) as Max_Salary " + "FROM [dbo].[T_Employee_Akil]"
				+ "WHERE Employee_Salary < (SELECT MAX(Employee_Salary) FROM [dbo].[T_Employee_Akil]) ";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			double salary = rs.getDouble("Max_Salary");
			return salary;
		}
		return 0;
	}

	public double getSecondMin() throws SQLException {

		String insertSQL = "SELECT MIN(Employee_Salary) as Min_Salary " + "FROM [dbo].[T_Employee_Akil]"
				+ "WHERE Employee_Salary > (SELECT MIN(Employee_Salary) FROM [dbo].[T_Employee_Akil]) ";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			double salary = rs.getDouble("Min_Salary");
			return salary;
		}
		return 0;
	}

	public Employee getNameLike() throws SQLException {
		String insertSQL = "SELECT * FROM [dbo].[T_Employee_Akil] WHERE Employee_Name LIKE 'M%'";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			return emp;
		}
		return null;
	}

	public ArrayList<Employee> getCountryIn() throws SQLException {
		ArrayList<Employee> list = new ArrayList<>();
		String insertSQL = "SELECT * FROM [dbo].[T_Employee_Akil] WHERE Employee_Country IN ('Brazil','England','Portugal')";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			list.add(emp);
		}
		return list;
	}

	public ArrayList<Employee> getSalaryBetween() throws SQLException {
		ArrayList<Employee> list = new ArrayList<>();
		String insertSQL = "SELECT * FROM [dbo].[T_Employee_Akil] WHERE Employee_Salary BETWEEN 400000 and 700000";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("Employee_ID");
			String name = rs.getString("Employee_Name");
			double salary = rs.getDouble("Employee_Salary");
			String country = rs.getString("Employee_Country");
			String city = rs.getString("Employee_City");
			String zipcode = rs.getString("Employee_ZipCode");
			Employee emp = new Employee(id, name, salary, country, city, zipcode);
			list.add(emp);
		}
		return list;
	}

	public void insertDataInEmploeeInfo(EmployeeInfo user) throws SQLException {
		String insertSQL = "INSERT INTO dbo.T2_Employee_Akil"
				+ "(Employee_ID, Employee_Email,Employee_Phone) VALUES"
				+ "(?,?,?)";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.setInt(1, user.getE_id());
		statement.setString(2, user.getE_email());
		statement.setString(3, user.getE_phone());
		statement.executeUpdate();
		
	}

	public void innerJoin() throws SQLException{
		String insertSQL = "SELECT [dbo].[T2_Employee_Akil].[Employee_ID]"
				+ ",[dbo].[T_Employee_Akil].[Employee_ID] as Emp_id"
				+ ",[dbo].[T2_Employee_Akil].[Employee_Email] as Emp_email"
				+ ",[dbo].[T_Employee_Akil].[Employee_Name] as Emp_name"  
				+ ",[dbo].[T2_Employee_Akil].[Employee_Phone] as Emp_phone"
				+ " FROM [dbo].[T2_Employee_Akil]" 
				+ "INNER JOIN [dbo].[T_Employee_Akil] ON [dbo].[T2_Employee_Akil].[Employee_ID]=[dbo].[T_Employee_Akil].[Employee_ID]";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("Emp_id");
			String name = rs.getString("Emp_name");
			String e_mail = rs.getString("Emp_email");
			String phone = rs.getString("Emp_phone");
			System.out.println("ID :"+id+" Name :"+name+" E-Mail :"+e_mail+" Phone :"+phone);
		}
	}

	public void leftJoin() throws SQLException {
		String insertSQL = "SELECT [dbo].[T2_Employee_Akil].[Employee_ID]"
				+ ",[dbo].[T_Employee_Akil].[Employee_ID] as Emp_id"
				+ ",[dbo].[T2_Employee_Akil].[Employee_Email] as Emp_email"
				+ ",[dbo].[T_Employee_Akil].[Employee_Name] as Emp_name"  
				+ ",[dbo].[T2_Employee_Akil].[Employee_Phone] as Emp_phone"
				+ " FROM [dbo].[T_Employee_Akil]" 
				+ "LEFT JOIN [dbo].[T2_Employee_Akil] ON [dbo].[T2_Employee_Akil].[Employee_ID]=[dbo].[T_Employee_Akil].[Employee_ID]";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("Emp_id");
			String name = rs.getString("Emp_name");
			String e_mail = rs.getString("Emp_email");
			String phone = rs.getString("Emp_phone");
			System.out.println("ID :"+id+" Name :"+name+" E-Mail :"+e_mail+" Phone :"+phone);
		}		
	}

	public void rightJoin() throws SQLException {
		String insertSQL = "SELECT [dbo].[T2_Employee_Akil].[Employee_ID]"
				+ ",[dbo].[T_Employee_Akil].[Employee_ID] as Emp_id"
				+ ",[dbo].[T2_Employee_Akil].[Employee_Email] as Emp_email"
				+ ",[dbo].[T_Employee_Akil].[Employee_Name] as Emp_name"  
				+ ",[dbo].[T2_Employee_Akil].[Employee_Phone] as Emp_phone"
				+ " FROM [dbo].[T_Employee_Akil]" 
				+ "RIGHT JOIN [dbo].[T2_Employee_Akil] ON [dbo].[T2_Employee_Akil].[Employee_ID]=[dbo].[T_Employee_Akil].[Employee_ID]";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("Emp_id");
			String name = rs.getString("Emp_name");
			String e_mail = rs.getString("Emp_email");
			String phone = rs.getString("Emp_phone");
			System.out.println("ID :"+id+" Name :"+name+" E-Mail :"+e_mail+" Phone :"+phone);
		}		
	}

	public void fullJoin() throws SQLException {
		String insertSQL = "SELECT [dbo].[T2_Employee_Akil].[Employee_ID]"
				+ ",[dbo].[T_Employee_Akil].[Employee_ID] as Emp_id"
				+ ",[dbo].[T2_Employee_Akil].[Employee_Email] as Emp_email"
				+ ",[dbo].[T_Employee_Akil].[Employee_Name] as Emp_name"  
				+ ",[dbo].[T2_Employee_Akil].[Employee_Phone] as Emp_phone"
				+ ",[dbo].[T_Employee_Akil].[Employee_Country] as Emp_country"
				+ ",[dbo].[T_Employee_Akil].[Employee_City] as Emp_city"
				+ " FROM [dbo].[T_Employee_Akil]" 
				+ "FULL OUTER JOIN [dbo].[T2_Employee_Akil] ON [dbo].[T2_Employee_Akil].[Employee_ID]=[dbo].[T_Employee_Akil].[Employee_ID]";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("Emp_id");
			String name = rs.getString("Emp_name");
			String e_mail = rs.getString("Emp_email");
			String phone = rs.getString("Emp_phone");
			String country = rs.getString("Emp_country");
			String city = rs.getString("Emp_city");
			System.out.println("ID :"+id+" Name :"+name+" E-Mail :"+e_mail+" Phone :"+phone+" Country :"+country+" City :"+city);
		}		
		
	}

	public void selfJoin() throws SQLException{
		String insertSQL = "SELECT A.[Employee_ID] as Emp_id_T1"
				+ ",B.[Employee_Email] as Emp_email"
				+ ",A.[Employee_Name] as Emp_name"  
				+ ",B.[Employee_Phone] as Emp_phone"
				+ ",A.[Employee_Country] as Emp_country"
				+ ",A.[Employee_City] as Emp_city"
				+ " FROM [dbo].[T_Employee_Akil] A," 
				+ "[dbo].[T2_Employee_Akil] B WHERE B.[Employee_ID]=A.[Employee_ID]"
				+ "ORDER BY A.[Employee_Name]";
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("Emp_id_T1");
			String name = rs.getString("Emp_name");
			String e_mail = rs.getString("Emp_email");
			String phone = rs.getString("Emp_phone");
			String country = rs.getString("Emp_country");
			String city = rs.getString("Emp_city");
			System.out.println("ID :"+id+" Name :"+name+" E-Mail :"+e_mail+" Phone :"+phone+" Country :"+country+" City :"+city);
		}		
		
	}

	public void alterTableColumn(String s) throws SQLException {
		String insertSQL = "ALTER TABLE  [dbo].[T2_Employee_Akil] ADD "+s+" varchar(200)"; 
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.executeUpdate();
	}

	public void dropTableColumn(String col_name) throws SQLException {
		String insertSQL = "ALTER TABLE  [dbo].[T2_Employee_Akil] DROP COLUMN "+col_name; 
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.executeUpdate();
		
	}

	public void modifyTableColumn(String col_name) throws SQLException {
		String insertSQL = "ALTER TABLE  [dbo].[T2_Employee_Akil] ALTER COLUMN "+col_name+" float"; 
		PreparedStatement statement = getInit().prepareStatement(insertSQL);
		statement.executeUpdate();
		
	}
}
