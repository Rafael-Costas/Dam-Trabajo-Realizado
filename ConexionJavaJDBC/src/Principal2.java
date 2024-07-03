import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Principal2 {

	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/sakila";
		Connection con;
		try {
			 con = DriverManager.getConnection(url, "root", "1234");
			 Statement s = con.createStatement();
			 ResultSet rs= s.executeQuery("Select title from film");
			 
			 while(rs.next()) {
				 System.out.println(rs.getString(1));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
