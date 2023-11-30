
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("update admin set username=?,password=? where userid=?");
		
		ps.setString(1, "admin");
		ps.setString(2, "admin@123");
		ps.setInt(3, 1001);
		ps.executeUpdate();
		con.close();
		 System.out.println("updated successfully");

	}

}