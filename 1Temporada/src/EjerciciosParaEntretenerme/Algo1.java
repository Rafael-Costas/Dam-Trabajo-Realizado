package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Algo1 {

	public static void main(String[] args) {
		/*
		 * 1. Programa Java que lea dos números enteros por teclado y los muestre por
		 * pantalla.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("introoduce un numero");
		int num1=src.nextInt();
		System.out.println("Introduce otro numero");
		int num2=src.nextInt();
		System.out.println("El primer numero es "+num1+ " el segundo numero es "+num2);
	}
}
