package Anomalos;

import java.util.Arrays;
import java.util.Scanner;

public class LectorValoresConocidos2 {
	// Se leerán 10 valores.
		public static final int NUM_VALORES = 10;
		
		public static void main(String[] args) {
		
			Scanner lector = new Scanner(System.in);
			Float[] arr= new Float[NUM_VALORES];
			System.out.println("Escribe " + NUM_VALORES + " flotantes. Se puede hacer en diferentes líneas.");
			
			
			int numValoresLeidos = 0;
			while (numValoresLeidos < NUM_VALORES) {
				// Antes de leer, comprobamos si realmente hay un entero.
				if (lector.hasNextFloat()) {
					float valor = lector.nextFloat();
					if(valor>=0 && valor<=10) {
						
					
					arr[numValoresLeidos]=valor;
					System.out.println("Valor " + numValoresLeidos + " leído: " + valor);
					numValoresLeidos++;
					}else {
						System.out.println("Valor no valido");
						System.out.println("Escribe otro numero");
					}
				} else {
					lector.next();
				}
			}
			// Los valores que sobren en la última línea escrita se descartan.
			lector.nextLine();
			System.out.println("Ya se han leído " + NUM_VALORES + " valores.");
			System.out.println(Arrays.toString(arr));
			
		}
	}