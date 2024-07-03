package Ejemplos;

import java.util.Scanner;

public class Raizcuadrada {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce el valor a ");
		double a= src.nextDouble();
		System.out.println("Introduce le valor b");
		double b= src.nextDouble();
		System.out.println("Introduceel valor c");
		double c= src.nextDouble();
		
		double raizpos= -b+Math.sqrt(Math.pow(b, 2)-4*a*c);
		
		raizpos= (raizpos)/(2*a);
		
		double raizneg= -b-(Math.sqrt(Math.pow(b, 2)-4*a*c));
		
		raizneg= (raizneg)/(2*a);
		if(raizpos>=0 || raizpos<0) {
		System.out.println("Raiz positvia "+raizpos);
		}else {
			System.out.println("Sin solucion");
		}
		
		if(raizneg>=0 || raizneg<0) {
		System.out.println("Raiz negativa "+raizneg);
		}else {
			System.out.println("Nope solucion");
		}
		
		
	}
}
