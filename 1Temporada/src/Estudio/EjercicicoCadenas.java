package Estudio;

import java.util.Scanner;

public class EjercicicoCadenas {

	public static void main(String[] args) {
		
		System.out.println("Introduce tu nomrbe");
		Scanner src= new Scanner(System.in);
		String nombre= src.nextLine();
		System.out.println("intrduce tu apellido");
		String apellido=src.next();
		System.out.println("Tu nombre es "+nombre);
		System.out.println("Tu apellido es "+apellido);
		nombre+=apellido;
		System.out.println("Tu nombre completo es "+nombre);
	}
}
