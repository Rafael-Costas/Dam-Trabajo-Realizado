package Boletin2023;

public class Ejercicio5 {

	/*
	 * 5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una
	 * tercera de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
	 */
	public static void main(String[] args) {

		int [] Arr1= {1,2,3,4,5,6,7,8,9,10,34,54,231,21,31,21,21};
		int [] Arr2= {11,12,13,14,15,16,17,18,19,20,21,22,23,1,1,1,1,1,1,1};
		int [] Arr3= new int [Arr1.length+Arr2.length];
		
		
			for(int i=0, j=0; i<Arr3.length; i++, j++) {
				if(j<Arr1.length) {
				Arr3[i]=Arr1[j];
				
				}
				if(j<Arr2.length && j<Arr1.length) {
					i++;
				}
				if(j<Arr2.length) {
				Arr3[i]=Arr2[j];
				}
			}
for(int i=0; i<Arr3.length;i++) {
	System.out.print(Arr3[i]+", ");
}
		
		
	}
	
}
