package Estudio;

import java.util.Arrays;
import java.util.Random;

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
		 * Ejercicio 2A Genera un array de 50 posiciones enteras que tomarán valores
		 * entre - 100 y 100. Separe en dos matrices los valores positivos (incluido el
		 * cero) y los negativos en otra. Ordene ambos arrays por el método Quicksort.
		 */
		Random r = new Random();
		int [] Arr = new int [50];
		int contP=0;
		int contN=0;
		for(int i=0; i<Arr.length; i++) {
			Arr[i]=r.nextInt(201)-100;
			if(Arr[i]>=0) {
				contP++;
			}else {
				contN++;
			}
			
		}
		
		int [] Pos = new int [contP];
		int [] Neg = new int [contN];
		contP=0;
		contN=0;
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i]>=0) {
				Pos[contP]=Arr[i];
				contP++;
			}else {
				Neg[contN]=Arr[i];
				contN++;
			}
		}
		
		System.out.println(Arrays.toString(Pos));
		System.out.println(Arrays.toString(Neg));
		qsort(Pos);
		qsort(Neg);
		System.out.println(Arrays.toString(Pos));
		System.out.println(Arrays.toString(Neg));
	}
}
