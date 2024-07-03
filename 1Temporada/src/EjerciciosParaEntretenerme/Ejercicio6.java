package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 6: Programa que pida por teclado la fecha de nacimiento de una
		 * persona (dia, mes, año) y calcule su número de la suerte. El número de la
		 * suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a
		 * continuación sumando las cifras obtenidas en la suma.
		 * 
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introzca dia");
		int dia = src.nextInt();
		System.out.println("Introzca mes");
		int mes = src.nextInt();
		System.out.println("Introzca año");
		int año = src.nextInt();
		
		int res = dia+año+mes;
		
		int suerte=0;
		suerte+= res/1000;
		int temp=res%1000;
		
		suerte+= temp/100;
		temp=res%100;
		
		suerte+=temp/10;
		
		
		suerte+=temp%10;
		
		System.out.println("Tu numero de la suerte es "+suerte);
	}
}
