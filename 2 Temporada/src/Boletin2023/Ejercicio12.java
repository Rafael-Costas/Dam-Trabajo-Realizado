package Boletin2023;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Leer por teclado una tabla de 10 elementos numéricos enteros y una
		 * posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin
		 * dejar huecos.
		 */
		int [] Arr = {1,2,3,4,5,6,7,8,9,10};
		Scanner src= new Scanner(System.in);
		System.out.println(Arrays.toString(Arr));
		System.out.println("Que posicion quieres eliminar");
		int pos=src.nextInt();
		int num=0;
		int aux=0;
		for(int i=pos; i<Arr.length; i++) {
			if(i+1<Arr.length) {
			Arr[i]=Arr[i+1];
			}else {
				Arr[i]=0;
			}
		}
		int [] Res= new int [Arr.length-1];
		for(int i=0; i<Arr.length-1;i++) {
			Res[i]=Arr[i];
		}
		System.out.println(Arrays.toString(Res));
	}
}
