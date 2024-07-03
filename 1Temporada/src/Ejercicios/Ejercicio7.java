package Ejercicios;

import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int valor =0;
		for(int i=0; i<500; i++) {
			valor=rnd.nextInt(100,  200);
			if(valor%2==0) {
				System.out.println(valor+" es par ");
			}else {
				System.out.println(valor+" es impar");
			}
			if(valor==200) {
				System.out.println("Che doscientosssssssssssssssssssssssssssssssssssss");
			}
			if(valor==100){
				System.out.println("10000000000000000000000000000000000000000000000");
			}
		}
	}
}
