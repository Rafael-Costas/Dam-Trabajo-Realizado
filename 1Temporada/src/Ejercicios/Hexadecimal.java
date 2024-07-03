package Ejercicios;

import java.util.Scanner;

public class Hexadecimal {

	public static void frase(int num) {
		
		switch (num) {
		case 0:
			System.out.print("0");
		case 1:
			System.out.print("1");
			break;
		case 2:
			System.out.print("2");
			break;
		case 3:
			System.out.print("3");
			break;
		case 4:
			System.out.print("4");
			break;
		case 5:
			System.out.print("5");
			break;
		case 6:
			System.out.print("6");
			break;
		case 7:
			System.out.print("7");
			break;
		case 8:
			System.out.print("8");
			break;
		case 9:
			System.out.print("9");
			break;
		case 10:
			System.out.print("A");
			break;
		case 11:
			System.out.print("B");
			break;
		case 12:
			System.out.print("C");
			break;
		case 13:
			System.out.print("D");
			break;
		case 14:
			System.out.print("E");
			break;
		case 15:
			System.out.print("F");
			break;

		}
		
	}

	public static void hexa(int num) {
		int aux = num;
		int res = 0;
		int cont=0;
		int div=0;
		do {
			aux=aux/16;
			cont++;
		}while(aux!=0);
		aux=num;
		for(int i=cont-1; i>=1; i-=1) {
			res=0;
			//System.out.println(Math.pow(16, i));
			div=0;
			div=(int) Math.pow(16, i);
			//System.out.println((int)Math.pow(16, i));
			//System.out.println((int)(aux%(int)Math.pow(16, i)));
			res+=aux%div;
			System.out.println(res);
			frase(res);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner src = new Scanner(System.in);
		System.out.println("Introduce un numero decimal");
		int num = src.nextInt();
		hexa(num);
		
		

	}

}
