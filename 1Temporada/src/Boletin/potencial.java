package Boletin;

import java.util.Scanner;

public class potencial {

	public static int calculo(int num, int potencia) {
		int res= (int) Math.pow(num, potencia);
		
		return res;
	}
	public static int calculo2(int num, int potencia) {
		
		if(potencia==1) {
			return num;
		}else {
			return num* calculo2(num, potencia-1);
		}
		

	}
public static int calculo3(int num, int potencia) {
	int res=1;
	for(int i=0; i<potencia; i++) {
		res*=num;
	}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner src= new Scanner (System.in);
		System.out.println("Introduce un numero");
		int base =src.nextInt();
		System.out.println("Introduce la potecia");
		int potencia= src.nextInt();
		int res= calculo(base, potencia);
		System.out.println(base+" elevado a "+ potencia+" es " + res);
		System.out.println(base+" elevado a "+ potencia+" es " + calculo2(base, potencia));
		System.out.println(base+" elevado a "+ potencia+" es " + calculo3(base, potencia));
		
	}
}
