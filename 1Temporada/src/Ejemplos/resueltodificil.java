package Ejemplos;

import java.util.Scanner;

public class resueltodificil {

	public static void main(String[] args) {
		System.out.println("Introduzca dinero en euros");
		Scanner src= new Scanner(System.in);
		int dinero=src.nextInt();
		int bi500=0;
		int bi200=0;
		int bi100=0;
		int bi50=0;
		int bi20=0;
		int bi10=0;
		int bi5=0;
		int euro=0;
		do {
			if(dinero>=500 ) {
				dinero-=500;
				bi500++;
			}
			if(dinero>=200 &&dinero <500) {
				dinero-=200;
				bi200++;
			}
			if(dinero>=100 &&dinero <200) {
				dinero-=100;
				bi100++;
			}
			if(dinero>=50 &&dinero <100) {
				dinero-=50;
				bi50++;
			}
			if(dinero>=20 &&dinero <50) {
				dinero-=20;
				bi20++;
			}
			if(dinero>=10 &&dinero <20) {
				dinero-=10;
				bi10++;
			}
			if(dinero>=5 &&dinero <10) {
				dinero-=5;
				bi5++;
			}
		}while(dinero>=5);
		euro=dinero;
		System.out.println("Billetes de 500 "+bi500);
		System.out.println("Billetes de 200 "+bi200);
		System.out.println("Billetes de 100 "+bi100);
		System.out.println("Billetes de 50 "+bi50);
		System.out.println("Billetes de 20 "+bi20);
		System.out.println("Billetes de 10 "+bi10);
		System.out.println("Billetes de 5 "+bi5);
		System.out.println("Monedas "+euro);
		
		
	}
}
