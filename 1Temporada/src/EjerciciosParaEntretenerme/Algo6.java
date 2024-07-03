package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Algo6 {

	public static void main(String[] args) {

		/*
		 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
		 * teclado.
		 * 
		 */
		System.out.println("Introduce la velocidad");
		Scanner src= new Scanner(System.in);
		double km= src.nextDouble();
		
		double metros= (km*3600)/1000;
		System.out.println("La cantidad de metros es "+metros);
	}
}
