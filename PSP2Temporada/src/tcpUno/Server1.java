package tcpUno;

import java.io.*;

import java.net.*;


public class Server1 {


		public static void main(String[] arg) throws IOException {
			int numeroPuerto = 6000;// Puerto
			ServerSocket servidor = new ServerSocket(numeroPuerto);
			Socket cliente = null;
			System.out.println("Esperando al cliente.....");
			cliente = servidor.accept();
			// CREO FLUJO DE ENTRADA DEL CLIENTE
			InputStream entrada = null;
			entrada = cliente.getInputStream();
			DataInputStream flujoEntrada = new DataInputStream(entrada);
			// EL CLIENTE ME ENVIA UN MENSAJE
			System.out.println("Recibiendo del CLIENTE: \n\t" + flujoEntrada.readUTF());
			// CREO FLUJO DE SALIDA AL CLIENTE
			OutputStream salida = null;
			salida = cliente.getOutputStream();
			DataOutputStream flujoSalida = new DataOutputStream(salida);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// ENVIO UN SALUDO AL CLIENTE
			flujoSalida.writeUTF("Saludos al cliente del servidor");
			// CERRAR STREAMS Y SOCKETS
			entrada.close();
			flujoEntrada.close();
			salida.close();
			flujoSalida.close();
			cliente.close();
			servidor.close();
		}// main

	

}
// fin de Ejemplo1Servidor
