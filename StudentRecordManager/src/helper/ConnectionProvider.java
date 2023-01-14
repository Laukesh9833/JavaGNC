package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private Connection con;

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root";
		String pass = "Gnc123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass);
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return con;
	}

}
