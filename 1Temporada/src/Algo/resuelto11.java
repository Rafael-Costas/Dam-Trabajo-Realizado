package Algo;

import java.util.Scanner;

public class resuelto11 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Cuantos segundos hay");
		int res= src.nextInt();
		int seg=0;
		int min=0;
		int hora=0;
		
		do {
			if(res>=60) {
			res=res-60;
			min++;
			}
			if(min==60) {
				min=0;
				hora++;
			}
		}while(res>=60);
		
			seg=res;
		
		System.out.println("horas "+hora);
		System.out.println("minutos "+min);
		System.out.println("segundos "+seg);
	}
}
