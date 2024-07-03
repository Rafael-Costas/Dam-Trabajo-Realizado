package ArcoFinal;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero entre el 1 al 12 para saber el mes ");
		Scanner src= new Scanner(System.in);
		int mes=src.nextInt();
		switch(mes) {
		case 1:
			System.out.println("En Enero hay 31 dias");
			break;
		case 2:
			System.out.println("En Febrero hay 28 dias");
			break;
		case 3:
			System.out.println("En Marzo hay 31 dias");
			break;
		case 4:
			System.out.println("En Abril hay 30 dias");
			break;
		case 5:
			System.out.println("En mayo hay 31 dias");
			break;
		case 6:
			System.out.println("En Junio hay 30 dias");
			break;
		case 7:
			System.out.println("En Julio hay 30 dias");
			break;
		case 8:
			System.out.println("En Agosto hay 31 dias");
			break;
		case 9:
			System.out.println("En Septiembre hay 30 dias");
			break;
		case 10:
			System.out.println("En Octubre hay 31 dias");
			break;
		case 11:
			System.out.println("En Noviembre hay 30 dias");
			break;
		case 12:
			System.out.println("En Diciembre hay 31 dias");
			break;
		default:
			System.out.println("No es un mes valido");
		}
		switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("En Enero hay 31 dias");
			break;
		case 2:
			System.out.println("En Febrero hay 28 dias");
			break;
		
		case 4, 6, 9, 11 :
			System.out.println("En Abril hay 30 dias");
			break;
		
		default:
			System.out.println("No es un mes valido");
		}
		
	}
}
