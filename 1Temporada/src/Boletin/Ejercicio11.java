package Boletin;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * 11. Diseñar un programa que muestre el producto de los 10 primeros números
		 * impares.
		 */
		Scanner src= new Scanner(System.in);
		int cont=1;
		int impar=1;
		for(int i=0; i<10; i++) {
			
			cont*=impar;
			impar+=2;
			
		}
		System.out.println("El producto de los 10 primeros numeros pares es " +cont);
	}
}
