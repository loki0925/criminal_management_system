package UtilDB;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilDB {

	public static Connection getConnection() {

		Connection conn = null;

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}

		String cs = "jdbc:mysql://localhost:3306/db3";

		try {
			conn = DriverManager.getConnection(cs, "root", "Vishal@123");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
