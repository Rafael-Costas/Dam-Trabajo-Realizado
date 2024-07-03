package Algo;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num=src.nextInt();
		
		int aux=num;
		int reves=0;
		int cont=1;
		do {
			aux=aux/10;
			
			cont*=10;
		}while(aux>9);
		aux=num;
		
		do {
			reves+=(aux%10)*cont;
			aux=aux/10;
			cont=cont/10;
		}while(cont>=1);
		

		if(num==reves) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
	}
}
