package Boletin2023;

import java.util.Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * 14. Leer dos series de 10 enteros, que estarán ordenados crecientemente.
		 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan
		 * ordenados.
		 */
		int [] Arr1= {1,2,9,7,9,13,41,54,85,99};
		int [] Arr2= {2,4,6,8,10,12,14,16,18,20};
		int [] res= new int [Arr1.length*2];
		for(int i=0, j=0, z=0; i<res.length; i++) {
			if(j<Arr1.length && z<Arr2.length) {
			if(Arr1[j]<Arr2[z]) {
				res[i]=Arr1[j];
				j++;
			}else {
				res[i]=Arr2[z];
				z++;
			}
			}else {
				if(j<Arr1.length) {
					res[i]=Arr1[j];
				}
				if(z<Arr2.length) {
					res[i]=Arr2[z];
				}
			}
		}
		System.out.println(Arrays.toString(res));
	}
}