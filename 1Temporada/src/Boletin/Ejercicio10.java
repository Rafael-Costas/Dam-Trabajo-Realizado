package Boletin;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. Pedir 15 números y escribir la suma total.
		 */
		System.out.println("introduce quince numeros");
		Scanner src= new Scanner(System.in);
		int cont=0;
		int num=0;
		for(int i=0; i<15; i++) {
			num=src.nextInt();
			cont+=num;
		}
		System.out.println("El total de la suma es "+cont);
	}
}
