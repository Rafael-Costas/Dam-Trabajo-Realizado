package Boletin2023;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * 13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera,
		 * y a continuación los elementos impares. Realizar dos versiones: una
		 * trabajando con los valores y otra trabajando con los índices.
		 */
		int [] Arr= {1,2,3,4,5,6,7,8,9,10};
		
		int contP=0;
		int contI=0;
		for (int i : Arr) {
			if(i%2==0) {
				contP++;
			}else {
				contI++;
			}
		}
		
		//trabajando con los indices
		int [] Impares = new int [contI];
		int [] Pares = new int [contP];
	for(int i=0, j=0, z=0; i<Arr.length; i++) {
		if(i%2==0) {
			Pares[j]=Arr[i];
			j++;
		}else {
			Impares[z]=Arr[i];
			z++;
			
		}
	}
	
	
	/*
	 * Trabajando con los numeros
	 */
	int j=0;
	int z=0;
	for(int i : Arr) {
		if(i%2==0) {
			Pares[j]=i;
			j++;
		}else {
			Impares[z]=i;
			z++;
			
		}
	}
	System.out.println(Arrays.toString(Impares));
	System.out.println(Arrays.toString(Pares));
	
	}
}
