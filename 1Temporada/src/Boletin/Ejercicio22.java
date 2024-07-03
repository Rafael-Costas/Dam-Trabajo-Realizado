package Boletin;

import java.util.Scanner;

public class Ejercicio22 {
	/*
	 * 22. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
	 */
	public static void main(String[] args) {
	Scanner src= new Scanner(System.in);
		int num=0;
		boolean sepe = true;
		System.out.println("Introduce las notas ");
		for(int i=0; i<5; i++) {
			num=src.nextInt();
			if(num<=4) {
			sepe=false;
			}
		}
		if(sepe) {
			System.out.println("No suspendio nadie");
		}else {
			System.out.println("Alguno suspendio");
		}
	}
}

