package Ejercicios;

import java.util.Arrays;

public class Ejercicio610 {

	public static int [] factorM(int [] arr, int fact) {
		for(int i=0; i<arr.length; i++) {
			arr[i]*=fact;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		int [] Factores= {1,2,3,4,5,6,7,8,9};
		
		Factores=factorM(Factores, 5);
		System.out.println(Arrays.toString(Factores));
	}
}
