package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void qsort(int item[]) {
		qs(item, 0 ,item.length-1);
	}
	
	
	
	
	private static void qs(int [] items, int left, int right) {
		int i, j;
		int x, y;
		
		i= left; j =right;
		x=items[(left+right)/2];
		do {
			while((items[i]<x)&& (i<right))i++;
			while((x<items[j])&& (j>left))j--;
			if(i<=j) {
				y=items[i];
				items[i]=items[j];
				items[j]=y;
				i++; j--;
			}
		}while(i<=j);
		if(left <j) qs(items, left, j);
		if(i<right) qs(items, i, right);
	}
	public static void main(String[] args) {
		/*
		 * Ejercicio 2B Pedir por teclado dos series de 7 enteros. Posteriormente se
		 * ordenarán crecientemente por el método quicksort. Por último se fusionaran
		 * las dos tablas en una tercera, de forma que sigan ordenados de forma
		 * creciente
		 */
		Scanner src= new Scanner(System.in);
		int [] Arr = new int [7];
		int [] Arr2 = new int [7];
		for(int i=0; i<Arr.length; i++) {
			System.out.println("Introduce numeros");
			Arr[i]=src.nextInt();
		}
		System.out.println("Ahora pasamos al segundo Array");
		for(int i=0; i<Arr2.length; i++) {
			System.out.println("Introduce numeros");
			Arr2[i]=src.nextInt();
		}
		qsort(Arr);
		qsort(Arr2);
		System.out.println(Arrays.toString(Arr));
		System.out.println(Arrays.toString(Arr2));
		
		int [] res = new int [Arr.length*2];
		int cont1=0;
		int cont2=0;
		for(int i=0; i<res.length; i++){
			if(cont1<Arr.length && cont2<Arr2.length) {
				if(Arr[cont1]<=Arr2[cont2]) {
					res[i]=Arr[cont1];
					cont1++;
					if(cont1==Arr.length) {
						i++;
					}
				}else {
					res[i]=Arr2[cont2];
					cont2++;
					if(cont2==Arr2.length) {
						i++;
					}
				}
			}
			
			if(cont1<Arr.length && cont2>=Arr2.length) {
				res[i]=Arr[cont1];
				cont1++;
			}
			if(cont2<Arr2.length && cont1>=Arr.length) {
				res[i]=Arr2[cont2];
				cont2++;
			}
			}
		System.out.println(Arrays.toString(res));
		}
}
