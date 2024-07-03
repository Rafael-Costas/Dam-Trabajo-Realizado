package Multicast2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;

public class ServidorMcTime {

	public static void main(String args[]) throws Exception {
		// FLUJO PARA ENTRADA ESTANDAR
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Se crea el socket multicast.
		MulticastSocket ms = new MulticastSocket();
		int Puerto = 12345;// Puerto multicast
		InetAddress grupo = InetAddress.getByName("225.0.0.1");// Grupo
		String cadena = "";
		while (!cadena.trim().equals("*")) {
			/*System.out.print("Datos a enviar al grupo: ");
			cadena = in.readLine();
			*/
			cadena = mostrarTiempo();
			Thread.sleep(1000);
			// ENVIANDO AL GRUPO
			DatagramPacket paquete = new DatagramPacket(cadena.getBytes(), cadena.length(), grupo, Puerto);
			ms.send(paquete);
		} // Fin de while
			// cierro socket
		ms.close();
		System.out.println("Socket cerrado...");
	}// Fin de main
	
	public static String mostrarTiempo() {
		Date date = new Date();
		
		System.out.println(date.toString());
		
		return date.toString();
	}
}// Fin de ServidorMC
