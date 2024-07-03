package Boletin;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Pedir un número y calcular su factorial.
		 */
		System.out.println("De que numero quieres calcular la factorial");
		Scanner src= new Scanner(System.in);
		int cont=1;
		int num=src.nextInt();
		for(int i=num; i>=1; i--) {
			cont*=i;
		}
		System.out.println("El factorial de "+num+" es "+cont);
	}
}
