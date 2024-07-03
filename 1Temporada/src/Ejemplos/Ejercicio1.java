package Ejemplos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Construir un programa que, dado el radio
		 *  de una esfera y devuelva por
		 * pantalla el valor de la superficie y 
		 * el volument de la esfera correspondinete
		 * 
		 */
		Scanner src= new Scanner(System.in);
		double pi=3.14159265359 ;
		double div= 4/3;
		
		System.out.println("Introduce el radio");
		double radio= src.nextDouble();
		double volumen= div*(pi*Math.pow(radio, 3)) ;
		System.out.println("El area es de "+ 4*pi*Math.pow(radio, 2));
		System.out.println("El volumen es de "+volumen);
	}
}
