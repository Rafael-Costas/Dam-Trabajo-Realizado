package Boletin2023;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * 9. Crear un programa que lea por teclado una tabla de 10 números enteros y la
		 * desplace una posición hacia abajo: el primero pasa a ser el segundo, el
		 * segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el
		 * primero.
		 */
	
		int [] Arr= {1,2,3,4,5,6,7,8,9,10};
		int cont=0;
		System.out.println(Arrays.toString(Arr));
		int num=Arr.length;
		for (int i : Arr) {
			Arr[cont]=num;
			num=i;
			cont++;
		}
		System.out.println(Arrays.toString(Arr));
		
		
		
	}
}
