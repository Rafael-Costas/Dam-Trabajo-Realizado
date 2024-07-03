package Examen;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor2 {
public static void main(String[] args) throws IOException {
	byte[] bufer = new byte[1024];
	DatagramSocket socket = new DatagramSocket(12345);
	
	System.out.println("Esperando al datagrama.... ");
	boolean conf=true;
	String paquete;
	while(conf){
		DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
		socket.receive(recibo);
		
	
		 paquete = new String(recibo.getData(), 0, recibo.getLength());
		
		if(paquete.trim().equals("final")) {
		conf=false;
		}else {
			System.out.println(paquete.trim());
		System.out.println( Amigos(Integer.parseInt(paquete.trim().split(" ")[0]), Integer.parseInt(paquete.trim().split(" ")[1])));
		
		socket.send(recibo);
		}
	}
	
	
	System.out.println("Finalizando...");
	socket.close();
}

public static String Amigos(int num1,int num2) {
	int res1=0;
	int res2=0;
	for(int i=1; i<=num1/2; i++) {
		if(num1%i==0) {
			res1+=i;
		}
	}
	for(int i=1; i<=num2/2; i++) {
		if(num2%i==0) {
			res2+=i;
		}
	}
	if(num1==res2 && num2==res1) {
		return "Son amiguis";
	}else {
		return "No son amiguis";
	}
	
}
}
