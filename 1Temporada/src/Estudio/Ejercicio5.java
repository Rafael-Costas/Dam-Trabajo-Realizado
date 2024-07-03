package Estudio;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Introducir dos números por teclado y comprobar si son novios Con un ejemplo
		 * es más fácil de entender. 48 y 75 son números novios porque: La suma de los
		 * divisores de cada número por separado es igual a la suma de esos dos números
		 * más uno. Divisores de (m) = Divisores de (n) = m + n + 1. D (48) = 1 + 2 + 3
		 * + 4 + 6 + 8 + 12 + 16 + 24 + 48 = 124, D (75) = 1 + 3 + 5 + 15 + 25 + 75 =
		 * 124, Si hacemos => 48 + 75 + 1 = 124
		 * 
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int num1=src.nextInt();
		int num2=src.nextInt();
		int div=1;
		int res=0;
		int res2=0;
		do {
		if(num1%div==0) {
			res+=div;
		}
		div++;
		
		}while(num1!=div);
		res+=num1;
		
		div=1;
		do {
			if(num2%div==0) {
				res2+=div;
			}
			div++;
			
			}while(num2!=div);
			res2+=num2;
			
	if(res==res2) {
		System.out.println("Son novios");
	}else {
		System.out.println("Nope");
	}
	}
}
