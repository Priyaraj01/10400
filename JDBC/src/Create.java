
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/10400batch","root","root");
		Statement st=con.createStatement();
		String query="create table admin(userid int,username varchar(78),password varchar(89))";
	    st.execute(query);
	    con.close();
	    System.out.println("created successfully");
	}

}