package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Algo3 {
	public static void main(String[] args) {
		/*
		 * 3. Escribe un programa Java que lee un número entero por teclado y obtiene y
		 * muestra por pantalla el doble y el triple de ese número.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero ");
		int num= src.nextInt();
		System.out.println("El doble es "+num*2);
		System.out.println("El triple es "+num*3 );
	}
}
