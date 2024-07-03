package Examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule la cuota final que se debe abonar en un club
		 * de tenis. La cuota normal es de 800 euros. Tendrán un 40% de descuento las
		 * personas mayores de 65 años y un 25% de descuento los menores de 21 años, si
		 * los padres no son socios, y un 45% si los padres son socios.
		 */
		
		Scanner src= new Scanner(System.in);
		System.out.println("Cuantos años tienes");
		int años=src.nextInt();
		
		//Estoy partiendo de la idea que si tiene 65 años sus padre no son socios
		//porque ya no estan
		if(años>65) {
			System.out.println("Tienes un descuento del 40%");
			System.out.println("Has de pagar "+ (800-((800*40)/100)));
		}
		
		if(años<21) {
			System.out.println("Tus padres son socios?");
			System.out.println("Introduce un 1 para si, cualquier otro para no");
			int socios= src.nextInt();
			if(socios==1) {
				System.out.println("Tienes un descuento del 45%");
				System.out.println("Has de pagar "+ (800-((800*45)/100)));
			}
			if(socios!=1) {
				System.out.println("Tienes un descuento del 25%");
				System.out.println("Has de pagar "+ (800-((800*25)/100)));
			}
			
		}
		if(años>=21 && años<=65) {
			System.out.println("Has de pagar 800 euros");
		}
		
		
	}
}
