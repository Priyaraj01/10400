
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/10400batch","root","root");
		PreparedStatement ps=con.prepareStatement("delete from admin where userid=?");
		
		
		ps.setInt(1, 1001);
		ps.executeUpdate();
		con.close();
		 System.out.println("deleted successfully");

	}

}