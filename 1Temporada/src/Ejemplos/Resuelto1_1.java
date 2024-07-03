package Ejemplos;

import java.util.Scanner;

public class Resuelto1_1 {

	public static double celsiusToFarenheit(double temp) {
		return (1.8) * temp + 32;
	}

	public static double farenheitToCelsius(double temp) {
		return (temp - 32) / 1.8;
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		boolean fin=true;
		int sec;
		double temp;
		
		do {
			System.out.println("Selecciona una opcion \n" + "1 c a f\n2 f a c\n3 salir");
			sec = src.nextInt();
			switch (sec) {

			case 1:
				System.out.println("introduzca la temperatura");
				temp = src.nextDouble();
				System.out.println(temp + " esos celsisus son " + celsiusToFarenheit(temp) + " faranheit");
				break;
			case 2:
				System.out.println("introduzca la temperatura");
				temp = src.nextDouble();
				System.out.println(temp + " esos farenhei son " + farenheitToCelsius(temp) + " celsius");
				break;
			case 3:
				System.out.println("Hasta la proxima");
				fin=false;
				break;
			default:
				System.out.println("Te has equivocado muaio");
				System.out.println("Repitelo");
				break;
			}
			}while(fin);
		

	}
}


