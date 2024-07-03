package Boletin;

import java.util.Scanner;

public class ContarDigitos {

	public static int contar(int num) {
		
		if(num<10) {
			return 1;
		}else {
			return 1+ contar(num/10);
		}
	}
	
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		
		System.out.println("introduce un numero");
		int num=src.nextInt();
		int cont=1;
		System.out.println("El numero "+num+" tiene "+contar(num)+" digitos");
		while(num/10!=0) {
			num=num/10;
			cont++;
		}
		System.out.println("El numero tiene "+cont+" cifras");
	}
}
