package Boletin;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		/*
		 * 19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados
		 * (=4) y suspensos.
		 */
		System.out.println("Introduce la nota de los alumnos");
		int notas=0; 				
		for(int i=0; i<6; i++) {
			notas=src.nextInt();
			if(notas>4) {
				System.out.println("Aprobado");
			}
			if(notas==4) {
				System.out.println("Esta condicionado");
			}
			if(notas <4) {
				System.out.println("Suspenso");
			}
		}
		}
}
