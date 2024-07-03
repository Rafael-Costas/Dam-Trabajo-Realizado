package ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo9 {

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
		
		
		ArrayList<Gato>miLista= GeneradorGatos(src.nextInt());
		
		System.out.println(miLista.toString());
		
	
	}
}
