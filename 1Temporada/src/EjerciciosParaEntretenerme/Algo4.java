package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Algo4 {

	public static void main(String[] args) {
		/*
		 * 4. Programa que lea una cantidad de grados centígrados y la pase a grados
		 * Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce los grados");
		int grados=src.nextInt();
		System.out.println("Los Farenhai son "+ 32+(9*grados/5));
	}
}
