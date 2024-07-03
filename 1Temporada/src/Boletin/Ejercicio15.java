package Boletin;

import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * 15. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
	 * media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos
	 * que miden más de 1.75.
	 */
	public static void main(String[] args) {
		double num;
		int edadt=0;
		int estaturat=0;
		
		
		int mayores =0;
		int altos=0;
		Scanner src= new Scanner(System.in);

		for(int i=0; i<5; i++) {
			System.out.println("Introduce la edad ");
			num=src.nextInt();
			if(num>18) {
				mayores++;
			}
			edadt+=(int)num;
			System.out.println("Introduce la altura ");
			num=src.nextDouble();
			if(num>1.75) {
				altos++;
			}
			estaturat+=num;
		}
		System.out.println("La edad media es de "+edadt/5);
		System.out.println("La altura media es de "+estaturat/5);
		System.out.println("Hay "+mayores+ " mayores de 18");
		System.out.println("Hay "+altos+" mas altos de 1.75");
	}
}
