package AlgoDeEstudio;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Rutina que devuelve invertida la cadena indicada como parámetro
		 */
		Scanner src= new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase= src.next();
		int num= frase.length();
		char [] letra =  new char [num];
		
		
		for(int i=0, b=frase.length()-1; i<frase.length(); i++, b--) {
			letra[b]=frase.charAt(i);
			
		}
		for(int i=0; i<letra.length; i++) {
			System.out.print(letra[i]);		}
	}
}
