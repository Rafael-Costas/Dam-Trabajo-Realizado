package Estudio;

import java.util.Scanner;

public class Ejercicio2 {
	
	
	public static void main(String[] args) {
		/*
		 * Escribe un programa que solicite al usuario un número positivo. El programa
		 * debe presentar en pantalla la descomposición en factores primos de dicho
		 * número. Por ejemplo, si el número es 36, debe escribir: 36 = 2*2*3*3
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero positivo porfi pls");
		int num= src.nextInt();
		int div=2;
		int res=num;
		do {
		if(res%div!=0) {
			div++;
		}else {
			if(res%div==0) {
				System.out.print(div+"*");}
			res=res/div;
		}
			
			
		}while(res!=1);
	}
}
