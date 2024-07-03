package ArcoFinal;

import java.util.Scanner;

public class resuelto4 {
	/*
	public static boolean esArmstrong(int n) {
		if (n ==calcularPotencia(n)) {
			return true;
		}else {
			return false;
		}
	}
	
	*/
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Inntroduce un numero");
		int num = src.nextInt();
		int aux=num;
		System.out.println("Cuanto es la longitd del numero?");
		int longi=src.nextInt();
		
		
		int res=0;
		
		do {
			if(aux>=10) {
				
				res+=(int)Math.pow(aux%10, longi);
				
				aux=aux/10;
				
				}
				if(aux<10){
					
					
					res+=(int)Math.pow(aux, longi);
				}
		}while(aux>=10);
		if(num==res) {
			System.out.println("Es un numero Armstrong");
		}else {
			System.out.println("No es un numero Armstrong");
		}
	}
}
