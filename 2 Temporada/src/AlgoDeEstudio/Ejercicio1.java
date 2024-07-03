package AlgoDeEstudio;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Rutina que indica si un carácter determinado está incluido o no dentro de un
		 * String dado como parámetro.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase= src.next();
		System.out.println("Que queieres encontrar?");
		char letra= src.next().charAt(0);
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)== letra) {
				System.out.println("Está la letra");
			}
		}
		
		
	}
}
