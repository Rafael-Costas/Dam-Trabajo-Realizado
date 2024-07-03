package Boletin;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		int sum=0;
		int cont=0;
		System.out.println("Desde conde quieres empezar ");
		int inicio=src.nextInt();
		System.out.println("De cuanto queires que sea la pregresion");
		int pro=src.nextInt();
		System.out.println("Hasta que numero quieres que llegue");
		int lim=src.nextInt();
		for(int i=inicio; i<=lim; i=i+pro) {
			System.out.print(i+",");
			sum+=i;
			cont++;
		}
		System.out.println();
		System.out.println("la suma total es de "+sum);
		System.out.println("has listado "+cont+" numeros");
	}
}
