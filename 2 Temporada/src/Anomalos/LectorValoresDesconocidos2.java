package Anomalos;

import java.util.Arrays;
import java.util.Scanner;

public class LectorValoresDesconocidos2 {

	public static final int MARCA = -1;
	public static final int NUM_VALORES = 10;
	
	public static void main(String[] args) {
		
		/*SI LOS ALMACENAMOS EN UN ARRAY DEBEMOS CONTROLAR SU TAMAÑO*/
		float[] arr= new float[NUM_VALORES];
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe hasta " + NUM_VALORES + " Float.");
		System.out.println("Después del último valor escribe un" + MARCA);
		
		int numValoresLeidos = 0;
		boolean marca = false;
		
		while (!marca && numValoresLeidos < NUM_VALORES) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextFloat()) {
				
				float valor = lector.nextFloat();
				
				
				if (valor == MARCA) {
					// Sí lo es.
					marca = true;
				} else {
					if(valor >=0 && valor<=10) {
					arr[numValoresLeidos]=valor;
					numValoresLeidos++;
					System.out.println("Valor leído: " + valor);
					}else {
						System.out.println("Equivocado");
						System.out.println("Entrega otro numero");
					}
				}
				
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				System.out.println("Te has equivocado");
				System.out.println("Entrega otro numero");
				lector.next();
			}
		}
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído todos los valores.");
		System.out.println(Arrays.toString(arr));
	}
}
