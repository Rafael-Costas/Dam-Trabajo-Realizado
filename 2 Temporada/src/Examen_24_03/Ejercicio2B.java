package Examen_24_03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2B {
	public static void qsort(int item[]) {
		qs(item, 0, item.length - 1);
	}

	private static void qs(int[] items, int left, int right) {
		int i, j;
		int x, y;

		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}
	public static void main(String[] args) {
		/*
		 * Ejercicio 2B 1.5p Genera un array de 60 posiciones enteras que tomarán
		 * valores entre 0 y 100. Recorriendo dicho array separe en dos arrays distintos
		 * los valores (no las posiciones) pares e impares. Ordene ambos arrays por el
		 * método Quicksort. Considere el cero par. Muestre ambos arrays obtenidos por
		 * pantalla
		 */
		Scanner src= new Scanner(System.in);
		Random r= new Random();
		int [] Arr = new int[60];
		int contp=0; 
		int conti=0;
		for(int i=0; i<Arr.length; i++) {
			Arr[i]=r.nextInt(0,101);
			if(Arr[i]%2==0) {
				contp++;
			}else {
				conti++;
			}
			
		}
		int [] Pares= new int[contp];
		int [] Impares= new int[conti];
		
		 contp=0; 
		 conti=0;
		for(int i=0; i<Arr.length; i++) {
			
			if(Arr[i]%2==0) {
				Pares[contp]=Arr[i];
				contp++;
			}else {
				Impares[conti]=Arr[i];
				conti++;
				
			}
			
		}
		qsort(Impares);
		qsort(Pares);
		System.out.println(Arrays.toString(Pares));
		System.out.println(Arrays.toString(Impares));
	}
}
