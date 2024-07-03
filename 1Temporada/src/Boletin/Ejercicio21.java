package Boletin;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		/*
		 * 21. Pedir 10 números, y mostrar al final si se ha introducido alguno
		 * negativo.
		 */
		Scanner src= new Scanner(System.in);
		int num=0;
		boolean sepe = true;
		System.out.println("Introduce numeros");
		for(int i=0; i<10; i++) {
			num=src.nextInt();
			if(num<0) {
			sepe=false;
			}
		}
		if(sepe) {
			System.out.println("No Introduciste ningun numero negativo");
		}else {
			System.out.println("introduciste un numero negativo");
		}
	}
}
