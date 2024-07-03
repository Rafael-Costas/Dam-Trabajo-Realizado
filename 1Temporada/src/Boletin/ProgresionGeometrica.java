package Boletin;

import java.util.Scanner;

public class ProgresionGeometrica {
	public static void main(String[] args) {
		
	
	Scanner src = new Scanner(System.in);
	
	int num1=0;
	int razon=0;
	int lim=0;
	int cont=0;
	int suma=0;
	System.out.println("Introduce el primer numero");
	num1=src.nextInt();
	System.out.println("la razon es de ");
	razon=src.nextInt();
	System.out.println("Cual es el limite ");
	lim=src.nextInt();
	int i=num1;

	
	while(i<=lim) {
		System.out.print(i+", ");
		cont++;
		suma+=i;
		i*=razon;
	}
		double form=num1*(Math.pow(razon, cont)-1)/(razon-1);
	System.out.println();
//	System.out.println("la suma total es de " + inicio);
	System.out.println("has listado " + cont + " numeros");
	System.out.println(i);
	
	
}
}