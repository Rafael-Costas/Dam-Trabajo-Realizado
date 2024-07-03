package Ejemplos;

import java.util.Scanner;

public class EjercicioMetodos {
	public static double MetrosAKm(double m) {
		double km = m / 1000;
		return km;

	}

	public static double DekmAM(double Km) {
		double m = Km * 1000;
		return m;

	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		double metros;
		double km;
		System.out.println("Por favot introduzca unos metritos");
		metros = src.nextDouble();

		km = MetrosAKm(metros);
		System.out.println("HAy " + km + " km");
		System.out.println("Introduzca Kilometros a metros");
		km = src.nextDouble();
		metros = DekmAM(km);
		System.out.println("Hay " + metros + " metros");
	}
}
