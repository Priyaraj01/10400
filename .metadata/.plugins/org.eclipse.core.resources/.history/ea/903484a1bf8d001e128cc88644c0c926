
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("insert into admin values(?,?,?)");
		ps.setInt(1, 1001);
		ps.setString(2, "Raj");
		ps.setString(3, "Raj@123");
		ps.executeUpdate();
		con.close();
		 System.out.println("inserted successfully");
		 
		 

	}

}