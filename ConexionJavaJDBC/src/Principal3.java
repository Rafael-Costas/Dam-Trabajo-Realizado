import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal3 {

	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("PETÓ");
		}
		try {
			String url="jdbc:mysql://localhost:3306";
			 con = DriverManager.getConnection(url, "root", "1234");
			 Statement s = con.createStatement();
			 s.execute("USE sakila");
			 ResultSet rs = s.executeQuery("Select first_name, last_name, actor_id from actor");
			 int numPelis=0;
			 while(rs.next()) {
				numPelis++;
				 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			 }
			 System.out.println("Hay "+numPelis+" en la tabla film");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
