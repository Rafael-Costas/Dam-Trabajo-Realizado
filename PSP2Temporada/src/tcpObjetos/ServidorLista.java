package tcpObjetos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorLista {
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		String Host = "localhost";
		int Puerto = 6000;// puerto remoto
		System.out.println("PROGRAMA CLIENTE INICIADO....");
		Socket cliente = new Socket(Host, Puerto);
		// Flujo de entrada para objetos
		
		ArrayList<Persona> recibe = new ArrayList<Persona>();
		ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());
	
		while(perEnt!=null) {
		Persona dato = (Persona) perEnt.readObject();
		recibe.add(dato);
		}
		
		for(Persona p: recibe) {
			System.out.println(p);
		}
		
		// recibo objeto
		/*System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad());
		// Modifico el objeto
		dato.setNombre("Juan Ramos");
		dato.setEdad(22);
		// FLUJO DE salida para objetos
*/
		ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());
		
		
		
		
		// Se envía el objeto
		/*perSal.writeObject(dato);
		System.out.println("Envio: " + dato.getNombre() + "*" + dato.getEdad());
		*/// CERRAR STREAMS Y SOCKETS
		perEnt.close();
		perSal.close();
		cliente.close();
		
		
		
	}// Fin de main
}// Fin de ServidorObjeto

