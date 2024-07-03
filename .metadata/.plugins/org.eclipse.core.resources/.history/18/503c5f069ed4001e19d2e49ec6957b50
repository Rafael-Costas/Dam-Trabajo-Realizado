package Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Calendar;

import org.apache.commons.lang3.StringUtils;

import ChatGrafico.HiloServidor;

public class Servidor5 {
	static ServerSocket servidor;
	public static void main(String[] arg) throws IOException {
		int numeroPuerto = 6000;// Puerto
		 servidor = new ServerSocket(numeroPuerto);
		String cad="";
		System.out.println("Esperando Conexion...");
		Socket ClienteConectado;
		
	
	
		while (true) {
			 ClienteConectado = new Socket();
			try {
				ClienteConectado = servidor.accept();

			} catch (SocketException ns) {
				break;

			}

			
			HiloEco hilo = new HiloEco(ClienteConectado);
			hilo.start();

		}
		
	
	}// main



}
//fin de Ejemplo1Servidor

