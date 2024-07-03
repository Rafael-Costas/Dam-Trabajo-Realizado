package Ejemplos;

import java.util.Scanner;

public class DiasHoras {

	public static void main(String[] args) {
		
		Scanner src= new Scanner(System.in);
		System.out.println("Introduzca las horas");
		int num=src.nextInt();
		int dia=0;
		int hora=0;
		int semana=0;
		do {
			if(num>=24) {
			num=num-24;
			dia++;
			}
			if(dia>=7) {
				dia=0;
				semana++;
			}
		}while(num>24);
		hora=num;
		System.out.println("Es la semana "+semana);
		System.out.println("Es el dia "+ dia);
		System.out.println("Es la hora "+hora);
	}
}
