package Boletin2023;

public class Ejercicio7 {

	/*
	 * 7. Leer por teclado una serie de 10 números enteros. La aplicación debe
	 * indicarnos si los números están ordenados de forma creciente, decreciente, o
	 * si están desordenados.
	 */

	public static void main(String[] args) {

		int [ ] Arr= {10,9,8,7,6,7,4,3,2,1};
		boolean Mayor=true;
		boolean Enano=true;
		int num=0;
		for(int i =0; i<Arr.length-1; i++) {
		if(Arr[i]<Arr[i+1]) {
			Enano=false;
			}
		if(Arr[i]>Arr[i+1]) {
			Mayor=false;
			}
		
		}
		if(Mayor) {
			System.out.println("Es orden Ascendente");
		}
		if(Enano) {
			System.out.println("Es orden descendente");
		}
		if(Enano==false && Mayor==false) {
			System.out.println("Es un caos");
		}
		
	}
}
