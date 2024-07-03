package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual
		 * que en el ejemplo.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero de 5 cifras muaio");
		int num= src.nextInt();
		int primero= num/10000;
		int temp= num%10000;
		int segundo = temp/1000;
		 temp= temp%1000;
		 int tercero= temp/100;
		 	temp=temp%100;
		 	int cuarto=temp/10;
		 		int quinto= temp%10;
		System.out.println(num);
		System.out.println(primero);
		System.out.println(segundo);
		System.out.println(tercero);
		System.out.println(cuarto);
		System.out.println(quinto);
	}
}
