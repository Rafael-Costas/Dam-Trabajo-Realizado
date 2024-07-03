package Estudio;

import java.util.Scanner;

public class Ejercicio4B {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4B Ingresar una cadena de caracteres formadas por números y letras,
		 * en ese orden y obtenga otra cadena donde aparezca cada letra tantas veces
		 * como lo indique el número que lo precede. Ejemplo: Si la cadena es 2w4r5f
		 * debemos obtener la siguiente cadena: wwrrrrfffff.
		 */
		Scanner src = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = src.next();
		int num = 0;
		String res = "";
		for (int i = 0, j = 1; j < frase.length(); i += 2, j += 2) {
			num=Character.getNumericValue(frase.charAt(i));
			
			for(int z=0; z<num; z++) {
				res+=frase.charAt(j);
			}
		}
		System.out.println(frase);
		System.out.println(res);
	}
}
