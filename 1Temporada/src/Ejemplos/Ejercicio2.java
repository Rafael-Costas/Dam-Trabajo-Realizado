package Ejemplos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Construir un progrma que dado el peso el kg y la altura
		 * de una persona calcule y muestre por pantalla su indice 
		 * de masa Corporal o indice de quetelet
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce el peso");
		double peso= src.nextDouble();
		System.out.println("introduce ela altura");
		double altura= src.nextDouble();
		double IMS= peso/Math.pow(altura, 2);
		if(IMS<18) {
			System.out.println("Estas demasiado delgado");
		}
		if(IMS>=18 && IMS<25) {
		System.out.println("Esta fino");
			if(IMS>=25) {
				System.out.println("Deja la pizza");
			}
		}
		System.out.println(IMS);
		
	}
}
