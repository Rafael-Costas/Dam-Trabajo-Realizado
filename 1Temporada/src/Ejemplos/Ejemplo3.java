package Ejemplos;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		System.out.println("Dime tu nombre y tu edad");
		Scanner src = new Scanner(System.in);
		String nombre;
		nombre = src.nextLine();
		int edad;
		edad = src.nextInt();
		System.out.println("Bienvenido " + nombre);

		System.out.println("Así que tienes " + edad + " años");

		src.close();
	}
}
