package Estudio;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Ejercicio 1A Calcula la letra de un DNI, pediremos el DNI por teclado y nos
		 * devolverá el DNI completo.
		 * 
		 * Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23,
		 * el resultado debe estar entre 0 y 22. Haz un método donde según el resultado
		 * de la anterior fórmula busque en un array de caracteres la posición que
		 * corresponda a la letra. Esta es la tabla de caracteres:
		 */
		char [] Arr = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z',
				'S','Q','V','H','L','C','K','E',};
		
		Scanner src = new Scanner(System.in);
		System.out.println("Introduce tu numero");
		int num = src.nextInt();
		System.out.println("Tu letra es "+Arr[num%23]);
	}
	}