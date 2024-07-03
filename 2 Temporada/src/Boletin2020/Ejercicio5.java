package Boletin2020;

public class Ejercicio5 {
	/*
	 * 5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una
	 * tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
	 */
	public static void main(String[] args) {
		
		int [] tabla1={1,3,5,7,9,11,13,15,17,19};
		int [] tabla2={2,4,6,8,10,12,14,16,18,20};
		int [] tabla3= new int [tabla1.length+tabla2.length];
		
		int cont=0;
		for(int i=0, j=1; i<tabla3.length-1; i+=2, j+=2) {
			tabla3[i]=tabla1[cont];
			tabla3[j]=tabla2[cont];
			cont++;
		}
		for(int i=0; i < tabla3.length; i++) {
			System.out.println(tabla3[i]);
		}
	}
}
