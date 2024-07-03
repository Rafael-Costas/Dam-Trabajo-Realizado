package EjercicioExamen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCarro {

	static Scanner src =  new Scanner(System.in);

	public static void main(String[] arg) throws IOException, ClassNotFoundException {

		int puerto = 6000;// Puerto
		ServerSocket servidor = new ServerSocket(puerto);
		System.out.println("Esperando al cliente.....");
		Socket cliente = servidor.accept();

		
		// Se prepara un flujo de salida para objetos
		ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
		ArrayList<Elemento> gente = new  ArrayList<Elemento>();
		System.out.println("Cuantas personas añadimos para enviar al servidor: ");
		int num = src.nextInt();
		
		for(int i=0; i<num; i++) {
Elemento per = addElemento();
enviados.add();
			
		}
	
		
		outObjeto.writeObject(gente);
		
		
	//	System.out.println("Envio: " + per.getNombre() + "*" + per.getEdad());
		// Se obtiene un stream para leer objetos
		//ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
	//	Persona dato = (Persona) inObjeto.readObject();

		//System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad());
		// CERRAR STREAMS Y SOCKETS
		System.out.println("Recibido");
		
		outObjeto.close();
		inObjeto.close();
		cliente.close();
		servidor.close();
	}// Fin de main

	public static double  calculaCuenta(ArrayList<Elemento> prod) {
		System.out.println("Datos de la persona recibida");
		double base=0d;
		for(Elemento p : prod) {
		System.out.println(p.getCantidad()+", "+ p.getCantidad());
			base+=p.getPrecio()*p.getCantidad();
			
		}
		
		double iva = base*0.21;
		double total= base+iva;
		return total;
	}
PrintWriter a = new PrintWriter("a", "a");
}// Fin de ClienteObjeto
