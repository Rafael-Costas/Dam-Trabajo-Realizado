package Examen_24_03;

import java.util.Scanner;

public class Ejercicio1B {

	public static void avanza(int [] a,int  num) {
		for( int z=0; z<num; z++) {
			int aux=a[a.length-1];
		for(int i=a.length-1; i>0; i--) {
			
		a[i]=a[i-1];
		}
		a[0]=aux;
		}
	}
	public static void main(String[] args) {
		/*
		 * Ejercicio 1B 1.5p Pedir por teclado la introducción de una tabla de 10
		 * elementos numéricos enteros. Pedir por teclado un valor entero al usuario y
		 * desplace dicho número de veces las posiciones del array. Los números que
		 * salgan por el final del ARRAY deberán entrar de nuevo por el principio del
		 * mismo.
		 */
		
		Scanner src= new Scanner(System.in);
		int [] Arr = new int [10];
		System.out.println("introduce 10 numeros");
		int num=0;
		for(int i=0; i<Arr.length; i++) {
			num=src.nextInt();
			Arr[i]=num;
			System.out.println("En la posicion "+i+" está el numero "+num);
		}
		
		System.out.println("Cuanto quieres desplazar el array");
		int desp=src.nextInt();
		avanza(Arr, desp);
		
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println("En la posicion "+i+" está el numero "+Arr[i]);
		}
	}
}
