package tcpObjetos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClienteObjetos {
static Scanner src;
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
	
		int puerto = 6000;// Puerto
		ServerSocket servidor = new ServerSocket(puerto);
		System.out.println("Esperando al cliente.....");
		Socket cliente = servidor.accept();

		// Se prepara un flujo de salida para objetos
		ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
		// Se prepara un objeto y se envía
		Persona per = Persona.modificarPersona();
		outObjeto.writeObject(per);
		// enviando objeto
		System.out.println("Envio: " + per.getNombre() + "*" + per.getEdad());
		// Se obtiene un stream para leer objetos
		ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
		Persona dato = (Persona) inObjeto.readObject();
		
		System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad());
		// CERRAR STREAMS Y SOCKETS
		outObjeto.close();
		inObjeto.close();
		cliente.close();
		servidor.close();
	}// Fin de main
	
	public static void modificarPersona(Persona p) {
		System.out.println("Datos de la persona recibida");
		System.out.println(p.toString());
		System.out.println("Modificar nombre: ");
		String s  = src.nextLine();
		System.out.println("Modificar edad: ");
		int e = src.nextInt();
		p.setNombre(s);
		p.setEdad(e);
	}
	
}// Fin de ClienteObjeto
