package Ejemplos;


import java.util.Scanner;

public class Ejemplo6 {
	final static double pi= 3.14159265359;
	
	public static void main(String[] args) {
		
		Scanner src= new Scanner(System.in);
		System.out.println("introduzaca el radio");
		double radio= src.nextDouble();
		double longitud;
		
		longitud=(2*pi)*radio;
		System.out.println("La longitd es de "+longitud);
	
		
		double area= pi * (Math.pow(radio, 2));
		System.out.println("El area es de "+ area);
		System.out.println(Math.floor(area));
	}
}
