package Estudio;

import java.util.Scanner;

public class Ejercicio1B {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1B Ingrese un texto e indique qué letras minúsculas y cuantas veces
		 * han aparecido en el texto. La búsqueda se realizará en un array de caracteres
		 * formado desde la a a la z.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String Frase = src.nextLine();
		System.out.println(Frase);
		char [] Arr = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k',
				'l','z','x','c','v','b','n','m'};
		
		for(int i=0; i<Frase.length(); i++) {
		Frase.charAt(i);
		}
		
	}
}
