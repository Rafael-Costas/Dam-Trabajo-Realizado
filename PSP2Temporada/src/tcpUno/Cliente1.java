package tcpUno;

import java.io.*;

import java.net.*;


public class Cliente1 {

	public static void main(String[] args) throws Exception {
		String Host = "localhost";
		int Puerto = 6000;// puerto remoto
	//	InetAddress i = InetAddress.getByName("10.101.19.19");
		System.out.println("PROGRAMA CLIENTE INICIADO....");
		Socket Cliente = new Socket(Host, Puerto);
		// CREO FLUJO DE SALIDA AL SERVIDOR
		DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
		// ENVIO UN SALUDO AL SERVIDOR
		flujoSalida.writeUTF("SaludOS al SERVIDOR DESDE EL Lord Paco");
		// CREO FLUJO DE ENTRADA AL SERVIDOR
		DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
		// EL SERVIDOR ME ENVIA UN MENSAJE
		System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());
		// CERRAR STREAMS Y SOCKETS
		flujoEntrada.close();
		flujoSalida.close();
		Cliente.close();
	}// fin de main
}// Fin de Ejemplo1Cliente