package Boletin;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		/*
		 * 16. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de
		 * multiplicar de dicho número.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero entre 0 y 10");
		int num=src.nextInt();
		while(num<0 || num>10) {
			System.out.println("Entre 0 y 10");
			num=src.nextInt();
		}
		for(int i=0; i<=10; i++) {
			System.out.println(num+"*"+i+" = "+num*i);
		}
	
	}
}
