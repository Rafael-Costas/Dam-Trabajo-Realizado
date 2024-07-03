package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class propuesto7 {

	public static double MillasAMetros(double num) {
		
		double metros=0;
		metros=num*1852;
		
		return metros;
	}
	public static double MillasAkilometros(double num) {
		double metros =MillasAMetros(num);
		double km= metros/1000;
		return km;
	}
	
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduzca millas");
		double millas=src.nextDouble();
		System.out.println("La cantidad de metros es "+MillasAMetros(millas));
		System.out.println("La cantidad de km es "+MillasAkilometros(millas));
	}
}
