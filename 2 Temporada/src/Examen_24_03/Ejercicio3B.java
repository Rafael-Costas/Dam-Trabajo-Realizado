package Examen_24_03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3B 1.5p Crea un programa que reciba una cadena de caracteres y la
		 * devuelva invertida con efecto espejo, esto es, se concatena a la palabra
		 * original su inversa, compartiendo la última letra, que hará de espejo, por lo
		 * que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por
		 * ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir
		 * “goma” devolverá “gomamog”.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra= src.next();
		System.out.println("La palabra que introduciste fue "+ palabra);
		char[] Arr=palabra.toCharArray();
		char[] invertido=new char[Arr.length];
		int cont=Arr.length-1;
		for(int i=0; i<invertido.length; i++) {
			invertido[i]=Arr[cont];
			cont--;
		}
		for(int i=1; i<invertido.length; i++) {
			palabra+=invertido[i];
		}
		System.out.println("Combinada junto a su invertida será "+palabra);
		
	}
}
