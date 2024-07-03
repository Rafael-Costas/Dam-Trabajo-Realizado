package Testing;

import java.util.Scanner;

public class Principal {

	public static float Plus(float a, float i) {
		return a * i;
	}

	public static float div(float a, float i) {
		return a / i;
	}

	public static char Upper(String a) {
	
		return a.toUpperCase().charAt(0);
	}

	public static void main(String[] args) {

		System.out.println("Introduce un numero");
		Scanner src = new Scanner(System.in);
		int num =src.nextInt();
		System.out.println("Introduce un numero");
		int num2 =src.nextInt();
		System.out.println("Introduce una palabra");
		String palarab=src.next();
		
		System.out.println("la multiplicacion da "+Plus(num, num2));
		System.out.println("la multiplicacion da "+div(num, num2));
		System.out.println("La primera larea mayuscula es "+Upper(palarab));
	}
}
