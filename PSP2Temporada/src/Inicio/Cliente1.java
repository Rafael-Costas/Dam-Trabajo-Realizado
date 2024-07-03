package Inicio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente1 {

	public static void main(String[] args) throws IOException {

		String Host = "localhost";
		int Puerto = 6000;// puerto remoto
		// ABRIR SOCKET
		InetAddress i = InetAddress.getByName("10.101.19.234");
		Socket Cliente = new Socket(i,Puerto);
		//Socket Cliente = new Socket(Host, Puerto);// conecta
		//InetAddress i = Cliente.getInetAddress();
		System.out.println("Puerto local: " + Cliente.getLocalPort());
		System.out.println("Puerto Remoto: " + Cliente.getPort());
		System.out.println("Host Remoto: " + i.getHostName().toString());
		System.out.println("IP Host Remoto: " + i.getHostAddress().toString());
		Cliente.close();// Cierra el socket
	}// fin de main
}// fin de SocketCliente
