package Ejemplos;

import java.util.Scanner;

public class resuelto5 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introoduzca la edad");
		int edad = src.nextInt();
		System.out.println("Introduzca el nivel ce ingrsos");
		int ingresos=src.nextInt();
		System.out.println("Introduzca los estudios");
		int estudios=src.nextInt();
		boolean jasp=false;
		
		jasp=(edad<=28 && estudios>3 && ingresos>28000);
			
		
		System.out.println(jasp);
	}
}
