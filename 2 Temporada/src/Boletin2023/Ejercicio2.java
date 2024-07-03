package Boletin2023;

public class Ejercicio2 {

	/*
	 * 2. Leer 5 números y mostrarlos en orden inverso al introducido.
	 */
	public static void Mostrar(int[] Arr) {
		for(int i=Arr.length-1; i>=0; i--) {
			System.out.print(Arr[i]+", ");
		}
	}

	public static void main(String[] args) {

		int [] Arr = {1,2,3,4,5};
		Mostrar(Arr);
	}
}
