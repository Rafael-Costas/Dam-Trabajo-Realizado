package Boletin;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		/*
		 * 13. Pedir 10 números. Mostrar la media de los números positivos, la media de
		 * los números negativos y la cantidad de ceros.
		 */
		System.out.println("Introduce quince numeros ");
		int contp=0;
		int contn=0;
		int pos=0;
		int neg=0;
		int num=0;
		int ceros=0;
		for(int i=0; i<15; i++) {
			num=src.nextInt();
			if(num>0) {
				pos+=num;
				contp++;
			}
			if(num<0) {
				neg+=num;
				contn++;
			}
			if(ceros==0) {
				ceros++;
			}
		}
		System.out.println("La media de los numeros positivos es "+pos/contp);
		System.out.println("La media de los numeros negativos es "+neg/contn);
		System.out.println("La cantidad de ceros es "+ceros);
	}
}
