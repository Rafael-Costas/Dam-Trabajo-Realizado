package ModeloConexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBd {

	private Connection con;
	private String host="localhost";
	private String puerto="3306";
	private String  user="root";
	private String pswd="";
		
		private Connection conexion;
		
	public   ConexionBd() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://"+host+":"+String.valueOf(puerto);
				//conexion=DriverManager.getConnection("jdbc:mysql://localhost//:3306",user, pswd);
				conexion=DriverManager.getConnection(url,user, pswd);
				
			
				

				
			}catch(Exception e){
				e.printStackTrace();
			}
			
	}
		
		public  Connection getConexion() {
			return this.conexion;
		}
		
		public void desconectar(){
			conexion = null;
		   }
		}
