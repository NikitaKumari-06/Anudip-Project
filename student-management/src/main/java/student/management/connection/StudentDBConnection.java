package student.management.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDBConnection {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentManagementSystem";
	static Connection conn;

	// Database Credentials
	static final String user = "root";
	static final String password = "mysql";

	public static Connection createC() {
		try {
			// Load the driver explicitly before creating the connection
			Class.forName(JDBC_DRIVER);

			// Create the connection
			conn = DriverManager.getConnection(DB_URL, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
