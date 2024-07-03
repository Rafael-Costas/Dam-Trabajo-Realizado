package Datagrama;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Cliente {

	public static void main(String[] args) throws IOException{
		
	
	int port =12345;
	InetAddress destino= InetAddress.getLocalHost();
	byte[] mensaje = new byte[1024];
	String saludo = "Enviando saludos !!";
	mensaje = saludo.getBytes();
	
	DatagramPacket envio = new  DatagramPacket(mensaje, mensaje.length, destino, port );
	try {
		DatagramSocket socket = new DatagramSocket(34567);
		socket.send(envio);
		System.out.println("Datagram enviado... ");
	} catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}