package ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo10 {
	
	static ArrayList<Gato> lista = new ArrayList<Gato>();

	public static ArrayList<Gato> GeneradorGatos(int num) {
		Scanner src = new Scanner(System.in);
		ArrayList<Gato> lista = new ArrayList<Gato>();
		for(int i=0; i<num; i++) {
			Gato g = new Gato();
			
			System.out.println("Nombre");
			g.setNombre(src.next());
			System.out.println("Color");
			g.setColor(src.next());
			System.out.println("Raza");
			g.setRaza(src.next());
			lista.add(g);
			
		}
		return lista;
	}
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Dime cuantos gatos: ");
		
		
		lista=GeneradorGatos(src.nextInt());
		
		System.out.println(lista);
		
		lista.sort(null);
		System.out.println(lista);
	
	}
}
