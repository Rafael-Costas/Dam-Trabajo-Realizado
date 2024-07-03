package Boletin2023;

import java.util.Scanner;

public class Ejercicio1 {
public static void Mostrat(int[] Arr) {
	for(int i=0; i<Arr.length; i++) {
		System.out.print(Arr[i]+", ");
	}
}
	
	public static void main(String[] args) {
		int [] Arr = {1,2,3,4,5};
		Mostrat(Arr);
		
		Scanner src  =new Scanner(System.in);
		
	/*Con este for introducimos numeros por el teclado, 
	pero partiendo que para hacer pruebas y cosas en diferentes
		ejercicios seria cansino le di valores al array*/
		
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println("Entrega un numero");
			int num=src.nextInt();
			Arr[i]=num;
		}
		
	}
}
