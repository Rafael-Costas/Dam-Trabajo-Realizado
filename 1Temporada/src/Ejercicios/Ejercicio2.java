package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("De cuantas lineas quieres hacerlo");
		Scanner src= new Scanner(System.in);
		int a=src.nextInt();
		for(int i=a; i>=0; i--) {
			for(int j=0; j<=a-i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}
