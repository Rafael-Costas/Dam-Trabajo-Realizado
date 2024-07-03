package Boletin2023;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. Ídem, desplazar N posiciones (N es introducido por el usuario).
		 */
		int [] Arr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(Arr));
		System.out.println("Cuanto quieres desplazar");
		Scanner src= new Scanner(System.in);
		int aux=0;
		int desp=src.nextInt();
		for(int i=0; i<desp; i++) {
			int num=Arr[Arr.length-1];
			for(int j=0; j<Arr.length; j++) {
				aux=Arr[j];
				Arr[j]=num;
				num=aux;
			
			}
		}
		System.out.println(Arrays.toString(Arr));
	}
}
