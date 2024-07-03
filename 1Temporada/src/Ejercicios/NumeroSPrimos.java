package Ejercicios;

import java.util.Scanner;

public class NumeroSPrimos {
	/*
	 * 9. (Ejercicio de dificultad alta) Realiza una clase minumero con un método
	 * esOmirp que diga si un número es Omirp o no. Un número es Omirp si es un
	 * número primo y, además, al invertir sus dígitos da otro número primo. Por
	 * ejemplo: 7951 y 1597.
	 */
	public static int Cosa(int num) {

		String n = String.valueOf(num);
		StringBuilder dev = new StringBuilder(n);
		String reves = dev.reverse().toString();
		return Integer.parseInt(reves);
	}

	public static int Vuelta(int i) {
		int a = 0;
		int aux = i;
		int res=0;
		int cont = contar(i);
		
		do {

			a = aux % 10;
			aux = aux / 10;
			
			res += a * Math.pow(10, cont);
			cont--;
		} while (cont >= 0);

		return res;
	}

	public static int contar(int i) {
		int div = i;
		int cont = 0;
		do {
			cont++;
			
			div/=10;
		}while (div!=0);
		return cont-1;
	}

	public static boolean esPrimo(int num) {
		int cont = 2;
		boolean sigue = true;

		while (sigue && cont < num) {
			if (num % cont == 0) {
				sigue = false;

			}
			cont++;
		}

		return sigue;
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Dame un numero");
		int n = src.nextInt();
		int p = Cosa(n);

		/*System.out.println("El numero " + n + " es primo? " + esPrimo(n));
		System.out.println("El numero al reves es " + p);
		if (esPrimo(n) && esPrimo(p)) {
			System.out.println("Son SUPER PRIMOS");
		}*/
System.out.println(contar(n));
		System.out.println("El numero girado es "+Vuelta(n));
	
	}
}
