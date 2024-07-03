package Boletin;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * 14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce 10 sueldos");
		int cont=0;
		int superior=0;
		int num=0;
		for(int i=0; i<10; i++) {
			num=src.nextInt();
			cont+=num;
			if(num>1000) {
				superior++;
			}
		}
		System.out.println("En total los sueldos equivalen a "+cont);
		System.out.println("La cantidad de gente que cobra mas de 1000 es "+superior);
	}
}
