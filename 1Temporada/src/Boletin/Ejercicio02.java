package Boletin;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * 2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá
		 * hasta que se introduzca un 0.
		 */
		Scanner src= new Scanner(System.in);
		int num=0;
		System.out.println("introduce un numero, si escribe cero se termina");
		do {
			
			num=src.nextInt();
			if(num>0) {
				System.out.println("Es positivo");
			}if(num<0) {
				System.out.println("Es negativo");
			}
		}while(num!=0);
	}
}
