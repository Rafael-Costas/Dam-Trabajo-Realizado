package EstudioExamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2B {
	/*
	 * Ejercicio 2B Pedir por teclado dos series de 7 enteros. Posteriormente se
	 * ordenarán crecientemente por el método quicksort. Por último se fusionaran
	 * las dos tablas en una tercera, de forma que sigan ordenados de forma
	 * creciente.
	 */
	
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

		Scanner src= new Scanner(System.in);
		Random r= new Random();
		int [] arr = new int [7];
		for(int i=0; i<arr.length; i++) {
			arr[i]= r.nextInt(0,100);
		}
		
		int [] arr2 = new int [7];
		for(int i=0; i<arr.length; i++) {
			arr2[i]= r.nextInt(0,100);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		qsort(arr2);
		qsort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		int cont =0;
		int cont2 =0;
		int [] res = new int [arr.length*2];
		for(int i=0; i<res.length; i++) {
			
			if(cont<arr.length && cont2<arr2.length) {
			if(arr[cont]>arr2[cont2]) {
				res[i]=arr2[cont2];
				cont2++;
				if(cont2==arr2.length) {
					i++;
				}
			
			}else {
			
			
				res[i]=arr[cont];
				cont++;
				if(cont==arr.length) {
					i++;
				}
			
			}
			}
			if(cont<arr.length && cont2>=arr2.length) {
				res[i]=arr[cont];
				cont++;
			}
			if(cont>=arr.length && cont2<arr2.length) {
				res[i]=arr2[cont2];
				cont2++;
			}
			
		}
		System.out.println(Arrays.toString(res));
		
	}
}
