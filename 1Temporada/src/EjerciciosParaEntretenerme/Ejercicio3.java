package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*
		 * Programa Java que lea un número entero de 3 cifras y muestre por separado las
		 * cifras del número.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero de tres cifras muaio");
		int num= src.nextInt();
		int primero= num/100;
		int temp= num%100;
		int segundo = temp/10;
		int tercero= temp%10;
		System.out.println(num);
		System.out.println(primero);
		System.out.println(segundo);
		System.out.println(tercero);
	}
}
