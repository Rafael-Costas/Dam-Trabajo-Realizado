package EjercicioAntonio;



	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConexionBd {
	private Connection con;
	private String host;
	private String puerto;
	private String  user;
	private String pswd ;
		
		private Connection conexion;
		
		public ConexionBd(String host, String puerto, String user, String pswd) {
			this.host=host;
			this.puerto=puerto;
			this.user=user;
			this.pswd=pswd;
			this.con=Conexion(host, puerto, user, pswd);
		}
	public  Connection Conexion(String host, String puerto, String user, String pswd) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://"+host+":"+String.valueOf(puerto);
				conexion=DriverManager.getConnection(url,user,pswd);
				
			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}
		
		public Connection getConexion() {
			return this.conexion;
		}
		}
