package Boletin;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Hasta que numero quieres mostrar?");
		int num=src.nextInt();
		for(int i=0; i<=num; i++) {
			System.out.print(i+", ");
		}
	}
}
