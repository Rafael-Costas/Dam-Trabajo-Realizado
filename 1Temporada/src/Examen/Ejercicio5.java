package Examen;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Se desea realizar un pago mediante billetes de curso legal. El programa
	 * pedirá la cantidad de pesetas a pagar y mostrará en pantalla el número de
	 * billetes de 10000, 5000, 2000, 1000, 500, 200 y 100 necesarios para realizar
	 * el pago. Así mismo devolverá el resto a pagar en monedas.
	 */
	
	public static void main(String[] args) {
		
	
	Scanner src= new Scanner(System.in);
	System.out.println("Cuanto has de pagar");
	int pago=src.nextInt();
int diezM=0, cincoM=0, dosM=0, M=0, Qui=0, Dos=0, C=0, Monedas=0;
	
	do {
		if(pago>=10000) {
			pago-=10000;
			 diezM++;
		}
		if(pago>=5000 && pago <10000) {
			pago-=5000;
			 cincoM++;
		}
		if(pago>=2000 && pago <5000) {
			pago-=2000;
			 dosM++;
		}
		if(pago>=1000 && pago <2000) {
			pago-=1000;
			 M++;
		}
		if(pago>=500 && pago <1000) {
			pago-=500;
			 Qui++;
		}
		if(pago>=200 && pago<500) {
			pago-=200;
			 Dos++;
		}
		if(pago>=100 && pago<200) {
			pago-=100;
			 C++;
		}
	}while(pago>=100);
	
		Monedas=pago;
		
		System.out.println(" has de pagar con: ");
		
		System.out.println(diezM+" Billetes de Diez Mil");
		System.out.println(cincoM+" Billetes de Cinco Mil");
		System.out.println(dosM+" Billetes de Dos Mil");
		System.out.println(M +" Billetes de Mil");
		System.out.println(Qui + " Billetes de quinientos");
		System.out.println(Dos + " Billestes de Doscientos");
		System.out.println(C + " Billetes de Cien");
		System.out.println(Monedas+ " Monedas");
	}
}
