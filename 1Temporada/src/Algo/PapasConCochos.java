package Algo;

import java.util.Scanner;

public class PapasConCochos {
	static double papas;
	static double chocos;
	public static void addChocos(int c) {
		chocos+=c;
	}
	public static void addPapas(int p) {
		papas+=p;
	}
	
	public static void showChocos() {
		System.out.println("En la reserva hay "+chocos+" chocos");
	}
	public static void showPapas() {
		System.out.println("En la reserva hay "+papas+" Papas");
	}

	public static int PapasChocos(double p, double c) {
		int personas=0;
		if(p < 1 || c <0.5) {
			return personas;
		}else {
			p=p-1;
			c=c-0.5;
			personas+=3;
			return PapasChocos(p, c);
		}
	}
public static int PapasChocos2(double p, double c) {
		int personas=0;
		do {
			if(p>=1 && c>=0.5) {
				p-=1;
				c-=0.5;
				personas+=3;
			}
		}while(p>=1 || c>=0.5);
		return personas;
	}
public static double PapasChocos3(double p, double c) {
	double personas;
	
	if(p<1 || c <0.5) {
		return personas=0;
	}else {
	if(p == c*2) {
		personas=(int) p*3;
		return personas;
	}else {
		if(p > c*2) {
			personas = c*6;
			return personas;
		}else {
			personas = (int) p*3;
			return personas;
		}
	}
	}
	
}
public static double gastos() {
	int personas=0;
	do {
		if(papas>=1 && chocos>=0.5) {
			papas-=1;
			chocos-=0.5;
			System.out.println(papas);
			personas+=3;
			System.out.println(chocos);
		}
	}while(papas>=1 && chocos>=0.5);
	return personas;
}

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce cuantos kilos de papas hay");
		papas=src.nextDouble();
		System.out.println("Ahora cuantos chocos");
		chocos=src.nextDouble();
		int personas=0;
		
		System.out.println(gastos());
		showChocos();
		showPapas();
		int i=0;
	while(i!=0) {
		
	}
	}
}
