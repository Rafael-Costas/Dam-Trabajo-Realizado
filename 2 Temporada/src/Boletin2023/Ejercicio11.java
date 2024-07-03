package Boletin2023;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * 11. Leer 5 elementos numéricos que se introducirán ordenados de forma
		 * creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,
		 * e insertarlo en el lugar adecuado para que la tabla continúe ordenada
		 */
		int [] Arr= {1,2,3,4,5,0,0,0,0};
		Scanner src= new Scanner(System.in);
		System.out.println("introduce un numero");
		int num=src.nextInt();
		int aux=0;
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i]>num){
				aux=Arr[i];
				Arr[i]=num;
				num=aux;
			}
		}
		int cont=0;
		for(int i=0; i<Arr.length; i++) {
			if(i<Arr.length-1) {
			if(Arr[i]<=Arr[i+1]) {
				cont++;
			}
			}
		}
		System.out.println(cont);
		System.out.println(num);
		Arr[cont]=num;
		
		
		System.out.println(Arrays.toString(Arr));
	}
}

