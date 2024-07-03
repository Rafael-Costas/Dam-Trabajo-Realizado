package UdpUno;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUno {

	public static void main(String[] args) throws Exception{
		byte[] bufer = new byte[1024];
		DatagramSocket socket = new DatagramSocket(12345);
		System.out.println("Esperando al datagrama.... ");
		DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
		socket.receive(recibo);
		int byteRec = recibo.getLength();
		String paquete= new String(recibo.getData());
		
		System.out.println("Número de bytes recibidos: "+ byteRec);
		System.out.println("Contenido de pauete: "+paquete.trim());
		System.out.println("Puerto origen del mensaje: "+recibo.getPort());
		System.out.println("IP de origen: "+recibo.getAddress().getHostAddress());
		System.out.println("Puesto destino del mensaje "+ socket.getLocalPort());
		socket.close();
	}
}
