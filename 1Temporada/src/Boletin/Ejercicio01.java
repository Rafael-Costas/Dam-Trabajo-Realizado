package Boletin;

import java.util.Scanner;

public class Ejercicio01 {
	/*
	 * 1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
	 * introduzca un número negativo.
	 */
	public static void main(String[] args) {
		
	
	Scanner src= new Scanner(System.in);
	int num=0;
	do {
		System.out.println("introduce un numero, si es negativo sales del programa");
		num=src.nextInt();
		if(num>=0) 
		System.out.println("El numero "+num+" si se elevase por dos seria "+Math.pow(num, 2));
		
	
		}while(num>=0);
	
}
	}
