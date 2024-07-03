package Boletin;

import java.util.Scanner;

public class AritmeticaWhile {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int ult = 0;
		int cont = 0;
		System.out.println("Desde donde quieres empezar ");
		int inicio = src.nextInt();
		System.out.println("De cuanto quieres que sea la progresion");
		int pro = src.nextInt();
		System.out.println("Hasta que numero quieres que llegue");
		int lim = src.nextInt();
		int i=inicio;
		do {
			System.out.print(i + ",");
			ult=i;
			cont++;
			i += pro;
		} while (i <= lim);
		
		System.out.println();
	//	System.out.println("la suma total es de " + inicio);
		System.out.println("has listado " + cont + " numeros");
		double formula= cont/2*((double) inicio+ult);
		System.out.println("la suma total es de " +formula);
	}
}
