package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3A Crea un programa que reciba una cadena de caracteres y la
		 * devuelva invertida con efecto espejo, esto es, se concatena a la palabra
		 * original su inversa, compartiendo la última letra, que hará de espejo, por lo
		 * que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por
		 * ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir
		 * “goma” devolverá “gomamog”.
		 */
		System.out.println("Introduce una frase");
		Scanner src= new Scanner(System.in);
		String Palabra = src.next();
		
		char [] Arr = new char [Palabra.length()];
		for(int i=0; i<Arr.length; i++) {
			Arr[i]=Palabra.charAt(i);
		}
		
		
		

		for(int i=Arr.length-2; i>=0; i--) {
			Palabra +=Arr[i];
		}
		System.out.println(Palabra);
		
	}
}
