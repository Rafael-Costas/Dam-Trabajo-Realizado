package tpcDos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
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
		
		String ayuda="";
		while ((cad=fentrada.readLine())!=null) {
			
			System.out.println(" =>ECO: "+cad);
			System.out.println("Introduce una cadena");
			ayuda=in.readLine();
			fsalida.println(ayuda);
			if(cad.equals("*"))break;
			
		}
	System.out.println("Cerrando conexion... ");
	fentrada.close();
	fsalida.close();
	ClienteConectado.close();
	servidor.close();
	}// main



}
//fin de Ejemplo1Servidor


