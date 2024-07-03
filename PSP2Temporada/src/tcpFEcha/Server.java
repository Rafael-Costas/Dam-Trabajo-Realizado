package tcpFEcha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Server {

	public static void main(String[] arg) throws IOException {
		int numeroPuerto = 6000;// Puerto
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		String cad="";
		System.out.println("Esperando Conexion...");
		Socket ClienteConectado=servidor.accept();
		System.out.println("Cliente conectado");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter fsalida= new PrintWriter(ClienteConectado.getOutputStream(), true);
		BufferedReader fentrada = new BufferedReader(new InputStreamReader(ClienteConectado.getInputStream()));
		String cadena, eco="";
		
		Calendar calendar;
		
		String ayuda="";
		while ((cad=fentrada.readLine())!=null) {
		
			System.out.println("Recibiendo una fecha: "+cad);
			String [] digitos =cad.split("/");
			Date date= new Date(Integer.parseInt(digitos[2])-1900,Integer.parseInt(digitos[1])-1,Integer.parseInt(digitos[0])-1);
		calendar= new GregorianCalendar();
		calendar.setTime(date);
			
		int dia= calendar.get(Calendar.DAY_OF_WEEK);
		String []dias = {"Domingo","Lunes","Martes","Miercoles","jueves","Viernes","Sabado"};
			fsalida.println(dias[dia]);
			if(cad.equals("quit"))break;
			
		}
	System.out.println("Cerrando conexion... ");
	fentrada.close();
	fsalida.close();
	ClienteConectado.close();
	servidor.close();
	}// main



}
//fin de Ejemplo1Servidor
