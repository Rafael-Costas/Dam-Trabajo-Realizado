package Boletin2023;

public class Ejercicio6 {

	/*
	 * 6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y
	 * mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de
	 * A, otros 3 de la B, etc
	 */
	public static void main(String[] args) {

		int [] Arr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int [] Arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int [] Res = new int [Arr1.length*2];
	
		for(int i=0, j=0, z=0; i<Res.length; ) {
		for(int cont=0; cont<3; cont++, i++, j++) {
		Res[j+z]=Arr1[j];
		
		}
		for(int cont=0; cont<3; cont++, i++, z++) {
		Res[j+z]=Arr2[z];
	
		}
		}
		for(int i=0; i<Res.length; i++) {
			System.out.print(Res[i]+", ");
		}
	}
}
