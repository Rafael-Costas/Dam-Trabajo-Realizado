package AlgoRaro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestLista {
	@SuppressWarnings({"enchecked"})
	public static void main(String[] args) {
		ArrayList<Asignatura> arrayEscribir = new ArrayList<Asignatura>();
		ArrayList<Asignatura> arrayLeer;
		System.out.println("Asignatura que vamos a escribir en el fichero");
		for(int i=0; i<5; i++) {
			Asignatura nuevoObjeto = new Asignatura(i, "Cadena"+ i,5*i);
			arrayEscribir.add(nuevoObjeto);
			System.out.println("arrayEscribir[" + i+ "] = "+arrayEscribir.get(i).toString());
		}
	try {
		System.out.println("Escribiendo ArrayList em el fichero objetos.dat..");
		ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
				new FileOutputStream("objetos.dat"));
		escribiendoFichero.writeObject(arrayEscribir);;
		escribiendoFichero.close();
		System.out.println("ok");
		
		ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("objetos.dat"));

		arrayLeer = (ArrayList<Asignatura>) leyendoFichero.readObject();
		leyendoFichero.close();
		System.out.println("Leido ok");
		System.out.println("Datos leidos del fichero");
		
		for(int i=0; i<arrayLeer.size(); i++) {
			System.out.println("Arrayleer["+i+"] = "+arrayLeer.get(i).toString());
		}
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
}
