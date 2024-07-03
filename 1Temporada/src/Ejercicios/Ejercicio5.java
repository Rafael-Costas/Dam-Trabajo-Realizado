package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static int Divisor(int a) {
		int res = 0;
		int aux = a;

		do {

			res += aux % 10;
			aux = aux / 10;
		} while (aux > 10);
		res += aux;

		return res;
	}

	public static void main(String[] args) {
		/*
		 * 5. (Ejercicio de dificultad alta) Se desea conocer el lucky number (número de
		 * la suerte) de cualquier persona. El número de la suerte se consigue
		 * reduciendo la fecha de nacimiento a un número de un solo dígito. Por ejemplo,
		 * la fecha de nacimiento de Emma es la siguiente: 16-08-1973 —► 16+8+1973 =
		 * 1997 —► 1+9+9+7=26 —► 2+6 =8. El número de la suerte de Emma será el 8.
		 */

		System.out.println("Introduce al años en el que naciste ");
		Scanner src = new Scanner(System.in);
		int años = src.nextInt();
		System.out.println("Introduce el mes ");
		int mes = src.nextInt();
		System.out.println("Introduce el dia");
		int dia;
		dia = src.nextInt();
		int res = años + mes + dia;

		do {
			res = Divisor(res);
		} while (res >= 10);
		System.out.println("Tu numero de la suerte es " + res);
		src.close();
	}
}
