package Boletin;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * 3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par
		 * o impar.
		 */
		Scanner src= new Scanner(System.in);
		int num=0;
		System.out.println("introduce un numero, si escribe cero se termina");
		do {
			
			num=src.nextInt();
			if(num%2==0) {
				System.out.println("Es Par");
			}else {
				System.out.println("Es Impar");
			}
		}while(num!=0);
	}
}
