package Ejemplos;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		System.out.println("Dime tu nombre");
		Scanner src = new Scanner(System.in);
		String nombre;
		nombre = src.nextLine();
		System.out.println("Bienvenido a Chandebrito " + nombre);
		src.close();

	}
}
