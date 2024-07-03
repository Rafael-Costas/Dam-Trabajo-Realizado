package Examen;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Generar 15 números enteros entre 300 y 500 y almacenarlos en un ARRAY. Listar
		 * por pantalla en qué posiciones se encuentran los números terminados en 7.
		 */
		Random r = new Random();
		int [] Arr = new int [15];
		for(int i=0; i<Arr.length; i++){
			Arr[i]= r.nextInt(300, 501);
		}
		String num;
		for(int i=0; i<Arr.length;i++) {
			num=Arr[i]+"";
			num=num.strip();
			
			if(num.lastIndexOf('7')==2) {
				System.out.println("El numero "+Arr[i]+" está en la posicion "+i);
			}
		}
		
		System.out.println(Arrays.toString(Arr));
	}
}
