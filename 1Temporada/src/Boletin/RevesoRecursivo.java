package Boletin;

import java.util.Scanner;

public class RevesoRecursivo {

public static int contar(int num) {
		
		if(num<10) {
			return 1;
		}else {
			return 1+ contar(num/10);
		}
	}


public static int Invertir(int num, int contar) {
	int aux=num;
	int inv=0;
	int res=aux%10;
	if(contar==0) {
		return inv *(int)Math.pow(10, contar-1);
	}else {
		
		return inv += res*(int) Math.pow(10, contar-1)+ Invertir(aux/10, contar-1);
	}
}
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num=src.nextInt();
		int contar=contar(num);
		System.out.println(Invertir(num, contar));
		
		
	}
}
