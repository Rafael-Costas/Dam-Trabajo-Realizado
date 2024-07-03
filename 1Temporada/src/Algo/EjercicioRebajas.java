package Algo;

import java.util.Scanner;

public class EjercicioRebajas {
	public static double DeucubrePorcentaje(double original, double nuevo) {
		return (original - nuevo) * 100 / original;
	}

	public static double Descubreorginal(double actual, double porentjae) {
		return (actual *100)/porentjae;
	}
	
	public static double HacerDescuento(double original, double porcentaje) {
		return (original*porcentaje)/100;
	}

	public static void main(String[] args) {
		int caso = 0;
		Scanner src = new Scanner(System.in);
		
		
		double original;
		double rebaja;
		double porcentaje;
		do {
			System.out.println("Si quieres descubrir el porcentaje introduce 1,\nsi quieres descubrir el precio original introduce 2 "
					+ "\nSi quieres aplicar un descuento pulse 3 \nPulsa 4 si quieres salir");
			caso= src.nextInt();
		switch (caso) {
		
		case 1:
			System.out.println("Introduce el valor viejo");

			double a = src.nextDouble();
			System.out.println("introduce el valor nuevo");
			double b = src.nextDouble();
			 rebaja = DeucubrePorcentaje(a, b);
			System.out.println("El porcentaje es " + rebaja + " %");
			break;

		case 2:
			System.out.println("Introduce el valor actual");
			double actual = src.nextDouble();
			System.out.println("introduce el porcentaje");
			 porcentaje = src.nextDouble();
			 original = Descubreorginal(actual, porcentaje);
			System.out.println("El valor original es " + original );
			break;
			
		case 3:
			System.out.println("introduce el valor original");
			 original= src.nextDouble();
			 System.out.println("Introduce el porcentaje");
			 porcentaje=src.nextDouble();
			 System.out.println("El resultadao aplicandole el porcentaje es "+HacerDescuento(original, porcentaje));
			 double res=original; 
			 res-= HacerDescuento(original, porcentaje);
			  
			 System.out.println("Deberas de pagar  "+res);
			 break;
		
		
		case 4:
			System.out.println("Hasta luego");
		break;
		default:
			System.out.println("Numero equivocado");
				
			}
		
		}while(caso!=4);
		

	}
}
