package AlgoDeEstudio;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Rutina que indica si todos los caracteres contenidos en un String dado como
		 * parámetro corresponden a vocales (mayúsculas o minúsculas) o no.
		 */
Scanner src= new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase= src.next();
		char [] letra =  {'A','I','E','U','O','o','u','i','e','a'};
		
		
		for(int i=0; i<frase.length(); i++) {
			for(int b=0; b<letra.length; b++) {
			if(frase.charAt(i)== letra[b]) {
				System.out.println("Hay mayusculas");
			}
			}
		}
		}
}
