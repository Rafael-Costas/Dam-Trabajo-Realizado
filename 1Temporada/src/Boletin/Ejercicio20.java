package Boletin;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		/*
		 * 20. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
		 */
		System.out.println("Cuantos sueldos hay?");
		int cont=src.nextInt();
		int sueldo=0;
		int max=0;
		for(int i=0; i<cont; i++) {
			System.out.println("Introduce los sueldos");
			sueldo=src.nextInt();
			if(sueldo>max)
			max=sueldo;
		}
		System.out.println("El sueldo maximo es "+max);
	}
}
