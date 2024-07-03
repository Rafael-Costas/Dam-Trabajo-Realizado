package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Algo7 {

	public static void main(String[] args) {
		/*
		 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo y
		 * calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		 * 
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduzca el cateto 1");
		int cateto1=src.nextInt();
		System.out.println("Introduzca el cateto 2");
		int cateto2=src.nextInt();
		int res= (int) Math.pow(cateto1, 2 + Math.pow(cateto2, 2));
		res= (int) Math.pow(res, 2);
		System.out.println("La hipotenusa es "+res);
	}
}
