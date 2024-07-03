package Boletin2023;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int[] Arr = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 0 };

		/*
		 * 8. Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer
		 * mediante el teclado 8 números. Después se debe pedir un número y una
		 * posición, insertarlo en la posición indicada, desplazando los que estén
		 * detrás.
		 */
		Scanner src = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		int num = src.nextInt();
		System.out.println("En que posicion");
		int pos = src.nextInt();
		int aux = 0;
		
		System.out.println(Arrays.toString(Arr));
		do {
			aux = Arr[pos];
			Arr[pos] = num;
			num=aux;
			if(pos+1<Arr.length) {
			aux=Arr[pos+1];
			}
			pos++;
		}while(pos != Arr.length);
		System.out.println(Arrays.toString(Arr));
	}
}
