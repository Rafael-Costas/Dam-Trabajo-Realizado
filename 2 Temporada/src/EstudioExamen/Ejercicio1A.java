package EstudioExamen;

import java.util.Random;

public class Ejercicio1A {
	
	public static int[] Generar() {
		Random r = new Random();
		int arr[] = new int [20];
		for(int i=0; i<20; i++) {
		arr[i]=r.nextInt(100, 201);
		
		}
		return arr;
	}

	public static void main(String[] args) {
		/*
		 * Generar 20 números enteros entre 100 y 200 almacenarlos en un ARRAY Listar
		 * por pantalla en qué posiciones se encuentran los números terminados en 2.
		 */
		Random r = new Random();
		int [] arr;
		arr= Generar();
		for(int i=0; i<arr.length; i++)
			if(arr[i]%10==2)
			System.out.println("En la posicion "+i+" se encuentra el numero "+arr[i]);
	}
	
}
