package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {

	
	public static void main(String[] args) {
		List listOfString = new ArrayList();
		listOfString.add("Hola");
		listOfString.add(3);
		listOfString.add(false);
		Alumno nuevo = new Alumno("Manolo",24); 
		Alumno nuevo1 = new Alumno("Jose",21); 
		Alumno nuevo2= new Alumno("Ricardo",22); 
		Alumno nuevo3 = new Alumno("Ana",20); 
		Alumno nuevo4 = new Alumno("Josefa",26); 
		listOfString.add(nuevo);
		System.out.println(listOfString);
		
		
		List otraLista = new ArrayList();
		otraLista.add(nuevo.getEdad());
		System.out.println(otraLista);
		otraLista.add(nuevo);
		otraLista.add(nuevo1);
		otraLista.add(nuevo2);
		otraLista.add(nuevo3);
		otraLista.add(nuevo4);
	
		
		System.out.println(otraLista);
		for(int i=0; i<otraLista.size(); i++) {
			System.out.println(((Alumno) otraLista.get(i)).getNombre());
			System.out.println(((Alumno) otraLista.get(i)).getEdad());
		}
		
	}
	
	//clase interna --> inner class
	
	
}
