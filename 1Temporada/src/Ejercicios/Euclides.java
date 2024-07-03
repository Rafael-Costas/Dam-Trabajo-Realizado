package Ejercicios;

import java.util.Scanner;

public class Euclides {

	public static int Euclides(int dividendo, int divisor) {
		int res=0;
		do {
			res=dividendo%divisor;
			if(res!=0) {
				dividendo=divisor;
				divisor=res;
			}
		}while(res!=0);
		return divisor;
	}
	
	public static int Min(int dividendo, int divisor) {
		return dividendo*divisor/Euclides(dividendo, divisor);
	}
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("introduce el dividendo");
		int dividendo=src.nextInt();
		System.out.println("Introduce el divisor");
		int divisor=src.nextInt();
		int aux=0;
		int rest=0;
		/*do {
			if(dividendo%divisor!=0) {
			aux=divisor;
			
			divisor=dividendo%divisor;
			dividendo=aux;
			}else {
				System.out.println("El minimo comun multiplo es "+divisor);
				divisor=dividendo%divisor;
			}
		}while(divisor!=0);
	*/	System.out.println(" El maximo comun divisor es "+Euclides(dividendo, divisor));
		System.out.println("El minimo comun multiplo es"+Min(dividendo, divisor));
	}
}
