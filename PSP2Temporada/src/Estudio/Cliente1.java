package Estudio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Cliente1 {
	public static void main(String[] args) throws IOException {
		DatagramPacket envio ;
		DatagramSocket socket;
		InetAddress destino = InetAddress.getLocalHost();
		int port = 12345; // puerto al que envio el datagrama
		byte[] mensaje;
		String año;
		do {
			
		
		System.out.println("Introduce un año para saber si es bisiesto !!");
		Scanner src= new Scanner(System.in);
		 año=src.next();
		
		mensaje = año.getBytes(); // codifico String a bytes
		// CONSTRUYO EL DATAGRAMA A ENVIAR
		 envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
		 socket = new DatagramSocket(); // Puerto local asignado automáticamente
		 socket.send(envio);
		
		}while(!año.equals("*"));
		// ENVIO DATAGRAMA
		socket.close(); // cierro el socket
  }
}
