package Algo;

public class Propuesto3 {

	/*
	 * Ejercicio 3B Programar un algoritmo recursivo que permita hacer la división
	 * de dos números enteros por restas sucesivas
	 */
	
	public static int division(int num, int divisor) {
		int cont=0;
		
		if(num<divisor) {
			return cont;
		}
		cont++;
		return cont + division(num-divisor, divisor);
	}
	public static void main(String[] args) {
		System.out.println(division(412, 4));
	}
}
