package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Reto6 {

	public static void main(String[] args) {
		/*
		 * Reto 5: haga un programa que muestre por pantalla cada una de las palabras
		 * individuales de una frase en líneas diferentes. Para ello, antes deberá ir
		 * averiguando las posiciones donde hay espacios en blanco para poder delimitar
		 * dónde empieza y termina cada palabra.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una frase ");
		String frase = src.nextLine();
		String [] arr = frase.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
