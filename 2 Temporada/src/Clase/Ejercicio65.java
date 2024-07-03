package Clase;

import java.util.Iterator;

public class Ejercicio65 {

	public static int []CompleatarArray1 (int [] Arr) {
		 for(int i=0; i<Arr.length; i++) {
			 Arr[i]=i;
		 }
		
		return Arr; 
	}
	
	public static int [ ] rellenarArray(int [] ARR, int valor) {
		for(int k=0;k< ARR.length; k++) {
			ARR[k]=valor;
			
		}
		return ARR;
	}
	
	public static void main(String[] args) {
		int [] Arr= {1,432,21,554,1,221,54,1};
		for (int i : Arr) {
			System.out.println(i);
		}
		CompleatarArray1(Arr);
		for (int i : Arr) {
			System.out.println(i);
		}
		rellenarArray(Arr, 7);
		System.out.println(Arr.toString());
	}
}
