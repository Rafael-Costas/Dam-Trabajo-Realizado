package Boletin;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * 4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números
		 * se han introducido.
		 */
		Scanner src= new Scanner(System.in);
		int num=0;
		int cont=0;
		System.out.println("introduce un numero, si escribes un numero negativo termina");
		do {
			
			num=src.nextInt();
			if(num>=0) {
				cont++;
			}
		}while(num>=0);
		System.out.println("Has introducido "+cont+" numeros");
	}
}
