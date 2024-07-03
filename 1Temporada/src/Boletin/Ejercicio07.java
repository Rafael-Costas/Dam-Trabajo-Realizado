package Boletin;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner src= new Scanner(System.in);
		System.out.println("Introduce numeros, si quierees parar escribe un numero negativo");
		int num=0;
		int cont=0;
		int res=0;
		while(num>=0) {
			num=src.nextInt();
			if(num>=0) {
			res+=num;
			cont++;
			}
		}
		System.out.println("La media es "+res/cont);
	}

}
