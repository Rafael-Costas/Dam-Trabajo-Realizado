package Boletin;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		/*
		 * 23. Pedir 5 números e indicar si alguno es múltiplo de 3.
		 */
		Scanner src= new Scanner(System.in);
		int num=0;
		boolean sepe = true;
		System.out.println("Introduce las notas ");
		for(int i=0; i<5; i++) {
			num=src.nextInt();
			if(num%3==0) {
				System.out.println(num+" es multiplo de 3");
			}else {
				System.out.println(num+" no es multiplo de 3");
			}
		}
		
	}
}
