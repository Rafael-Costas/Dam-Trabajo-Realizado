package Boletin2023;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		/*
		 * 15. Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
		 * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un
		 * mensaje.
		 */
		int [] Arr={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Que numero quieres encontrar");
		Scanner src= new Scanner(System.in);
		int res=0;
		int num=src.nextInt();
		boolean encontrado=false;
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i]==num) {
				encontrado=true;
				res=Arr[i];
			}
		}
		if(encontrado) {
			System.out.println("El numero esta en la posicion "+res);
		}else {
			System.out.println("No está");
		}
	}
}