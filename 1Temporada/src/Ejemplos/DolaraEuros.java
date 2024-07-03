package Ejemplos;

import java.util.Scanner;

public class DolaraEuros {

	public static  double DolarAEuro(double algo) {
		double euro=algo*1.05;
		return euro;
	}
	public static double EuroAdolar(double algo) {
		double dolar=algo*0.96;
		return dolar;
	}
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Si quieres pasar de euro a dolar pulse 1");
		System.out.println("Si quieres pasar de dolar a euro pulse 2");
		int op= src.nextInt();
		System.out.println("Introduzca la cantidad");
		double cantidad=src.nextDouble();
		switch (op) {
		case 1: 
			System.out.println(cantidad+" euros son "+ EuroAdolar(cantidad)+" dolares");
			
		break;
		case 2:
			System.out.println(cantidad+" dolares son "+ DolarAEuro(cantidad)+" euros");
		}
	}
}
