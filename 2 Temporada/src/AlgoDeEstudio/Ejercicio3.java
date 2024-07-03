package AlgoDeEstudio;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * Rutina que indica si todos los caracteres contenidos en un String dado como
		 * parámetro corresponden a letras (mayúsculas o minúsculas) o no.
		 * 
		 */
		Scanner src= new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase= src.next();
		 char [] letra = new char [25];
		char j='A';
		for(int i=0; i<=25-1; i++, j++) {
			letra[i]=j;
		}
		for(int i=0; i<frase.length(); i++) {
			for(int b=0; b<letra.length-1; b++) {
			if(frase.charAt(i)== letra[b]) {
				System.out.println("Hay mayusculas");
			}
			}
		}
		
	}
}
