package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
		 * debe ordenar palabras en lugar de números.
		 */
		ArrayList<String> List = new ArrayList<>();
		
		Scanner src= new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.println("Introduce un numero");
			List.add(src.next());
		}
		System.out.println(List);
		Collections.sort(List);
		System.out.println(List);
	}
}
