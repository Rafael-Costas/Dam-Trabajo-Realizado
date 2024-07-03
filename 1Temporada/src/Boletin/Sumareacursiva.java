package Boletin;

import java.util.Scanner;

public class Sumareacursiva {
	
	public static int sumaRe(int num, int mult) {
		if(mult==1) {
			return num;
		}else {
			
			return num+sumaRe(num, mult-1);
		}
	}
	
	public static int SumaFor(int num, int mult ) {
		int res=0;
		for(int i=0; i<mult; i++) {
			res+=num;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("introduce un numero");
		Scanner src= new Scanner(System.in);
		int num=src.nextInt();
		System.out.println("Introduce el multiplo");
		int mult=src.nextInt();
		int res=sumaRe(num, mult);
		int res2=SumaFor(num, mult);
		System.out.println("El numero "+num+" multplicado por "+mult+ " es "+res);
		System.out.println("El numero "+num+" multplicado por "+mult+ " es "+SumaFor(num, mult));
	}
}
