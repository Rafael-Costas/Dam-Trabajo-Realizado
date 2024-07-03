package ClientChat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ServerChat {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket serversocket = new DatagramSocket(9876);
		byte[] recibidos = new byte [1234];
		byte [] enviados = new byte [1234];
		String cadena;
		 while(true) {
			 System.out.println("Esperando datagrama");
			 recibidos = new byte[1234];
			 DatagramPacket paqRecibido = new DatagramPacket(recibidos, recibidos.length);
			 serversocket.receive(paqRecibido);
			 cadena = new String(paqRecibido.getData());
			 InetAddress IPOrigen = paqRecibido.getAddress();
			 int puerto = paqRecibido.getPort();
			 
			 System.out.println("\tOrigen: "+IPOrigen+" : "+puerto);
			 System.out.println("\nMensaje recibido"+cadena.trim());
			
			 
			 String mayus = cadena.trim().toUpperCase();
			 enviados = mayus.getBytes();
			 DatagramPacket paqEnviado = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
			 serversocket.send(paqEnviado);
			 if (cadena.trim().equals("salir"))break; 
				
			
		 }
		 serversocket.close();
		 System.out.println("Socket cerrado... ");
	}
	
	public static String respuestaCliente(String cad) {
	Scanner src= new Scanner(System.in);
	 System.out.println("\tMensaje: ");
	 System.out.println("\nMensaje recibido");
		return "a";
	}
}
