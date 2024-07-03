package Ejemplos;

import java.util.Scanner;

public class FranahaiGrados {
	
	public static double gradosAFaran(double algo) {
		double faran = (algo * 9 / 5) + 32;
		return faran;
	}

	public static double FaranaGrados(double algo) {
		double grados = (algo - 32) * 5 / 9;
		return grados;
	}
	public static double GradosaKelvin(double algo) {
		double kelvin = algo +273.15;
		return kelvin;
	}
	public static double KelvinAGrados(double algo) {
		double Grados = algo -273.15;
		return Grados;
	}
	public static double KelvinaFaranhai(double algo) {
		double Grados = (algo -273.15) * 9 / 5 + 32;
		return Grados;
	}
	public static double FaranhaiAKelvib(double algo) {
		double kelvin = (algo - 32) * 5 / 9 + 273.15;
		return kelvin;
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		System.out.println("Que quieres introducir grados a farabhai");
		System.out.println("Introduzca 1 para grados a faranhai ");
		System.out.println("Introduzca 2 para grados a Kelvin ");
		System.out.println("Introduzca 3 para faranhai a Kelvin ");
		System.out.println("Introduzca 4 para Faranhai a grados ");
		System.out.println("Introduzca 5 para Kelvin a Grados ");
		System.out.println("Introduzca 6 para kelvin a Faranhai ");
		int opc = src.nextInt();
		double num=0;
		switch(opc) {
		case 1:
			System.out.println("introduzca los grados para pasarlo a Faranhai");
			num=src.nextDouble();
			System.out.println(num+" son "+ gradosAFaran(num)+" Faranhai");
		
		break;
	case 2:
		System.out.println("introduzca los grados para pasarlo a Kelvin");
		num=src.nextDouble();
		System.out.println(num+" son "+ GradosaKelvin(num)+" Kelvin");
	
	break;
case 3:
	System.out.println("introduzca los Faranhai para pasarlo a Kelvin");
	num=src.nextDouble();
	System.out.println(num+" son "+ FaranhaiAKelvib(num)+" Kelvin");
	break;
case 4:
	System.out.println("introduzca los Faranhai para pasarlo a Grados");
	num=src.nextDouble();
	System.out.println(num+" son "+ FaranaGrados(num)+" Grados");
	break;
case 5:
	System.out.println("introduzca los Kelvin para pasarlo a Grados");
	num=src.nextDouble();
	System.out.println(num+" son "+ KelvinAGrados(num)+" Grados");
	break;
case 6:
	System.out.println("introduzca los kelvin para pasarlo a Faranhai");
	num=src.nextDouble();
	System.out.println(num+" son "+ KelvinaFaranhai(num)+" Faranhai");
	break;
}
	}
}
