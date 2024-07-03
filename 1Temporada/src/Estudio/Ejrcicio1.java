package Estudio;

import java.util.Scanner;

public class Ejrcicio1 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule la cuota que se debe abonar en un club de
		 * tenis. La cuota es de 800 euros. Tendrán un 40% de descuento las personas
		 * mayores de 65 años y un 25% de descuento los menores de 21 años, si los
		 * padres no son socios, y un 45% si los padres son socios.
		 */
		int dine=800;
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce 1 para si o un 0 para no");
		System.out.println("Eres mayor de 65?");
		int viejo =src.nextInt();
		System.out.println("Eres menor de 21");
		int joven=src.nextInt();
		System.out.println("Tus padres son socios?");
		int socios= src.nextInt();
		/*
		if(viejo==1 && joven ==0 && socios==0) {
			System.out.println("Tienes un descuento del 40%");
		}
		if(viejo==1 && joven ==1) {
			System.out.println("Te has equivocado");
		
		}
		if(viejo==1 && socios ==1) {
			System.out.println("Te has equivocado");
		
		}
			if(viejo==0 &&joven==1 && socios==0) {
				System.out.println("Tienes descuento del 25%");
			}
			if(viejo==0 &&joven==1 && socios==1) {
				System.out.println("Tienes un descuento del 45%");
			}*/
			
		if(viejo==1) {
		if(joven!=1 && socios!=1) {
		System.out.println("Tienes un descuento del 40%");	
		}else {
			System.out.println("TE has equivocado");
		}
		}else {
			if(joven==0) {
				System.out.println("No tienes descuento");
			}else {
				if(socios==1) {
					System.out.println("Tienes un 45%");
				}else {
					System.out.println("Tienes un 25%");
				}
			}
		}
		
		
	}

}
