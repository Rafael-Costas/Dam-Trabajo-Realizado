package Boletin;

import java.util.Scanner;

public class AcertarNumero {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Tienes que acertar el numero en 5 intento");
		int Random= (int) (Math.random()*100);
		int acertar=0;
		int cont=0;
		do {
			acertar=src.nextInt();
			if(acertar < Random) {
				System.out.println("Mas alto");
				cont++;
			}
			if(acertar > Random) {
				System.out.println("Mas bajo");
				cont++;
			}
			if(acertar == Random) {
				System.out.println("Felicitaciones");
				
			}
		}while(Random!=acertar && cont<5 );
		
		if(acertar != Random) {
			System.out.println("Intentalo mas tarde");
			System.out.println("El numero era " +Random);
			
		}
	}
}
