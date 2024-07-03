package Algo;

import java.util.Scanner;

public class Propuesto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dame los lados de un rectangulo");
		Scanner src= new Scanner(System.in);
		System.out.println("Base");
		double lado1= src.nextDouble();
		System.out.println("Altura");
		double lado2= src.nextDouble();
		double perimeto= (lado1*2)+(lado2*2);
		System.out.println("El perimetro es"+ perimeto);
		double area= lado1*lado2; 
		System.out.println("El area es "+area);
	}

}
