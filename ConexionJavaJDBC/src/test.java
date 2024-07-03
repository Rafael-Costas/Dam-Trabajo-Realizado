import java.util.Scanner;
import java.sql.*;
public class test {

	public static void main(String[] args) throws SQLException {
		String servidor= "localhost";
		int puerto=3306;
		String user="root";
		String passwd = "1234";
		String bd="sakila";
		Conexion conexion= new Conexion(servidor, puerto, user, passwd, bd);
		Connection miConexion= conexion.getConexion();
		
		try {
			Statement s = conexion.getConexion().createStatement();
			s.execute("USE "+bd);
			ResultSet rs = s.executeQuery("Select * from film");
			ResultSetMetaData rsmd=rs.getMetaData();
			int numRegistros=0;
			while(rs.next()) {
				numRegistros++;
			}
			
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.println("Columna "+i+" "+rsmd.getColumnName(i));
			}
			System.out.println("Hay " +numRegistros+" peliculas");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			miConexion.close();
		}
	}
}
