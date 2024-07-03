package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Algo5 {

	public static void main(String[] args) {
		/*
		 * 5. Programa que lee por teclado el valor del radio de una circunferencia y
		 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
		 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
		 * PI*Radio^2
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("introduzca el valor del radio");
		double radio= src.nextDouble();
		System.out.println("La longitd de la circunferencia es "+2*3.14*radio);
		System.out.println("La area de la circunferencia "+3.14*Math.pow(radio, 2));
		
	}
}
