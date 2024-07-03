package Ejercicios;

import java.util.Arrays;

public class Ejercicio57 {

	public static int  SumaValores(int [] Arr) {
		int cont=0;
		for (int i : Arr) {
			cont+=i;
		}
		return cont;
	}
	
	public static int [] RellenarPares(int []  Arr) {
		
		for(int i =0; i<Arr.length; i++) {
			Arr[i]=2*i;
			
		}
		return Arr;
	}
public static int [] RellenarImpares(int []  Arr) {
		
		for(int i =0; i<Arr.length; i++) {
			Arr[i]=2*i+1;
			
		}
		return Arr;
	}
	
	public static void main(String[] args) {
		
		int []Arr = {1,2,3,4,5,6,7};
		for (int i : Arr) {
			System.out.print(i+", ");
		}
		System.out.println();
		RellenarPares(Arr);
		for (int i : Arr) {
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(RellenarImpares(Arr)));
		
		System.out.println(SumaValores(Arr));
	}
}
