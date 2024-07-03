package EstudioExamen;

import java.util.Random;

public class Ejercicio1B {

	public static int [] generar() {
		Random r= new Random();
		int [] arr = new int [15];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(300,501);
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		/*
		 * Generar 15 números enteros entre 300 y 500 y almacenarlos en un ARRAY. Listar
		 * por pantalla en qué posiciones se encuentran los números terminados en 7.
		 */
		
		int [] arr =generar();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%10==7) {
					System.out.println("En la posicion "+i+" está el numero "+arr[i] );
				}
			}
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		
		
	}
}
