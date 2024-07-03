package Ejercicios;

import java.util.Arrays;

public class Ejercicio69 {

	public static int [] arrayPotencias2(int distancia) {
		int [] Arr=  new int [distancia];
		for(int i=0; i<distancia; i++) {
			Arr[i]=(int)Math.pow(2, i+1);
		}
		return Arr;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(arrayPotencias2(10)));
	}
}
