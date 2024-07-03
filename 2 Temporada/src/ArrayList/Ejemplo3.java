package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Ejemplo3 {

	public static void main(String[] args) {
		ArrayList<String> Arr = new ArrayList<String>();
		Arr.add("hola");
		Arr.add("Adios");
		Arr.add("hi");
		Iterator itr = Arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Alumno> clase = new ArrayList<Alumno>();
		
		Alumno nuevo = new Alumno("Manolo",24); 
		Alumno nuevo1 = new Alumno("Jose",21); 
		Alumno nuevo2= new Alumno("Ricardo",22); 
		Alumno nuevo3 = new Alumno("Ana",20); 
		Alumno nuevo4 = new Alumno("Josefa",26); 
		clase.add(nuevo);
		clase.add(nuevo1);
		clase.add(nuevo2);
		clase.add(nuevo3);
		clase.add(nuevo4);
		
		Iterator it = clase.iterator();
	
		while (it.hasNext()) {
		System.out.println(it.next());
			
		}
	}
}
