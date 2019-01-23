package com.akil.DatabaseUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class JDBCConnection {
//	private static final Logger logger=LoggerFactory.getLogger(DBConnection.class);

	private static Connection conn;
	private static JDBCConnection instance=null;

	private JDBCConnection() {
		try {
//				Class.forName("oracle.jdbc.OracleDriver");
//				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "mymy");
				// Load the SQLServerDriver class, build the
				// connection string, and get a connection
				//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			log.info("connection created.");
			//conn.close();		
		} catch (Exception e) {
		  log.info("error");
			//log.error("Connection error: "+e.getMessage());
		}
	}
 public static JDBCConnection getInstance() {
	if (instance==null) {
		instance=new JDBCConnection();
		return instance;
	}
	else {
		return instance;
	}
	
}
	
	public Connection getConnection() {
		return conn;
		
	}

	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs!=null)
	    {
	        try
	        {
	            rs.close();

	        }
	        catch(SQLException e)
	        {
	          //  log.error("The result set cannot be closed.", e);
	        	log.info("The result set cannot be closed.");
	        }
	    }
	    if (stmt != null)
	    {
	        try
	        {
	            stmt.close();
	        } catch (SQLException e)
	        {
	           // log.error("The statement cannot be closed.", e);
	        	log.info("The statement cannot be closed.");
	        }
	    }
	    if (conn != null)
	    {
	        try
	        {
	            conn.close();
	        } catch (SQLException e)
	        {
	           //log.error("The data source connection cannot be closed.", e);
	        	log.info("The data source connection cannot be closed.");
	        }
	    }
	}
	public static void main(String[] args) {
		//System.out.println("successfull");
		new JDBCConnection();
	}
}