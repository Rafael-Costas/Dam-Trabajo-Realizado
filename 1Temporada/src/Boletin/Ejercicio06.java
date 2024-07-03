package Boletin;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los
		 * números introducidos.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("introduce numeros, para con un 0");
		int num;
		int cont=0;
		do {
			num=src.nextInt();
			cont+=num;
		}while(num!=0);
	System.out.println("En total es "+cont);	
	}

}
