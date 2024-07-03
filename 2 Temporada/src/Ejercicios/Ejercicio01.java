package Ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

	
	
	public static void main(String[] args) {
		
		int [] Arr = new int [20];

		System.out.println(Arrays.toString(Arr));
		
		Arrays.fill(Arr, 23);
		System.out.println(Arrays.toString(Arr));
		
		Arrays.fill(Arr, 3, 12, -5);
		System.out.println(Arrays.toString(Arr));
		
		
		Arrays.sort(Arr, 2, 7);
		System.out.println(Arrays.toString(Arr));
		
		Arrays.sort(Arr);
		int pos = Arrays.binarySearch(Arr, 23);
		System.out.println(pos);
	}
}
