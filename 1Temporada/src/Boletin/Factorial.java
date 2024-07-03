package Boletin;

import java.util.Scanner;

public class Factorial {

	public static int Coso(int num, int total) {
		if(num!=0) {
			total*=num;
			num--;
			return  Coso(num, total);
		}
		return total;
	}
	public static int FactorailRecursivo(int num) {
		if(num==1) {
			return 1;
		}else {
		System.out.println(num);
			return num*FactorailRecursivo(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		int num=0;
		System.out.println("Introduce un numero");
		num=src.nextInt();
		int factorial=1;
		for(int i=1; i<=num; i++) {
			factorial*=i;
		}
		int total=1;
		System.out.println("El factorial de "+num+" es "+factorial);
		System.out.println("El factorial de "+num+" es "+Coso(num, total));
		System.out.println("El factorial de "+num+" es "+FactorailRecursivo(num));
	}
}
