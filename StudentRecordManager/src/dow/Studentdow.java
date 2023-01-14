package dow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import helper.ConnectionProvider;
import model.Student;

public class Studentdow {
	public boolean addStudent(Student s) {
		boolean result=false;
		try {
//			create object of ConnectionProvider
			ConnectionProvider con=new ConnectionProvider();
//			create object of java.sql.Connection
			Connection c=con.getConnection();
			
			String query="CREATE TABLE IF NOT EXISTS STUDENT(id INT NOT NULL AUTO_INCREMENT, name VARCHAR(100), number VARCHAR(12), PRIMARY KEY(ID))";
			
			String query1="INSERT INTO STUDENT(name, number) values(?,?)";
			Statement statement=c.createStatement();
			
			statement.executeUpdate(query);
			
			PreparedStatement statement1=c.prepareStatement(query1);
			statement1.setString(1, s.getName());
			statement1.setString(2, s.getNumber());
			statement1.executeUpdate();
			
			c.close();
			
			result=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
}
