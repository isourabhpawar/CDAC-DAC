package utils;

import java.sql.*;

public class DBUtils {
	// static data member : Connection => fixed connnectivity
	private static Connection cn;

	// add static method to open the db connection
	public static Connection openConnection() throws /* ClassNotFoundException, */ SQLException {
		// load JDBC driver class in method area
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		// establish db connection
		String dbURL = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(dbURL, "root", "root");
		
		return cn;
	}

}
