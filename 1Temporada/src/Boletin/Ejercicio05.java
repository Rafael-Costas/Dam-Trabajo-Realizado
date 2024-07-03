package Boletin;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * 5. Realizar un juego para adivinar un número. Para ello pedir un número N, y
		 * luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
		 * con respecto a N. El proceso termina cuando el usuario acierta.
		 */
		
		Scanner src= new Scanner(System.in);
		int num= (int) (Math.random()*(100));
		int res=0;
		System.out.println("Adivina el numero");
		while(res!=num) {
			res=src.nextInt();
			if(res<num) {
				System.out.println("Mas alto");
			}
			if(res>num) {
				System.out.println("Mas bajo");
			}
			if(res==num) {
				System.out.println("Felicitaciones");
			}
		}
	}
}
