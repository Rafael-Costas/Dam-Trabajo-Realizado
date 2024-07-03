package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		 System.out.println("introduce 3 valores");
		 int a=src.nextInt();
		 int b=src.nextInt();
		 int c=src.nextInt();
	
		 
		 
		if(a>b) {
			if(a>c) {
				if(b>c) {
					System.out.println("El mayor es "+a);
					System.out.println("El menos es "+c);
				}else {
					System.out.println("El mayor es "+a);
					System.out.println("El menos es "+b);
				}
			}else {
				System.out.println("El mayor es "+c);
				System.out.println("El menos es "+b);
			}
		}else {
			if(b>c) {
				if(a>c) {
					System.out.println("El mayor es "+b);
					System.out.println("El menor es "+c);
				}else {
					System.out.println("El mayor es "+b);
					System.out.println("El menor es "+a);
				}
			}else {
			System.out.println("El mayor es "+c);
			System.out.println("el menos es "+a);
			}
		}
		/*
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("El mayor es "+a);
				System.out.println("El menos es "+c);
			}else {
				System.out.println("El mayor es "+a);
				System.out.println("El menos es "+b);
			}
		}
		if(b>c && b>a) {
			if(a>c) {
				System.out.println("El mayor es "+b);
				System.out.println("El menos es "+c);
			}else {
				System.out.println("El mayor es "+b);
				System.out.println("El menos es "+a);
			}
		}
		if(c>a && c>b) {
			if(a>b) {
				System.out.println("El mayor es "+c);
				System.out.println("El menos es "+b);
			}else {
				System.out.println("El mayor es "+c);
				System.out.println("El menos es "+a);
			}
		}*/
	}
}
