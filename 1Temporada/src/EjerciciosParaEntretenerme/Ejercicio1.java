package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Programa que tome como dato de entrada un número que corresponde a la
		 * longitud del radio una esfera y nos calcula y escribe el volumen de la esfera
		 * que se corresponden con dicho radio. La fórmula para calcular el volumen de
		 * la esfera es v = (4/3)*PI*r^3
		 * 
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introducir el radio");
		int radio= src.nextInt();
		double volumen = (4/3)*3.14*radio*radio*radio;
		System.out.println("El radio introducido es "+radio);
		System.out.println("El volumen introducido "+volumen);
	}
}
