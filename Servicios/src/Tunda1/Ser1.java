package Tunda1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ser1 {

	public static void main(String[] args) throws IOException {
		int port = 6000;// Puerto
		ServerSocket Servidor = null;
		Servidor = new ServerSocket(port);
		
		System.out.println("Escuchando en " + Servidor.getLocalPort());
		
		Socket clientel = Servidor.accept();// esperando a un

//realizar acciones con clientel
		Socket cliente2 = Servidor.accept();// esperando a otrocliente
//realizar acciones con cliente2
		Servidor.close(); // cierro socket servidor
	}// fin de main
}// fin de SocketServidor

