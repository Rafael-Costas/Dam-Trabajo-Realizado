package Ejercicios;

import java.util.Scanner;

public class Vampirrrrrrio {

	public static void Vampirio(int n) {
	}
		
		public static void Colmillos(int n) {
			int num1=0;
			int aux=n;
			int num2=0;
			int num3=0;
			int num4=0;
			num1=aux%10;
			aux=aux/10;
			num2=aux%10;
			aux=aux/10;
			num3=aux%10;
			aux=aux/10;
			num4=aux%10;
			
			
			int par1_2=(num1*10)+num2;
			int par2_1=(num2*10)+num1;
			int par1_3=(num1*10)+num3;
			int par3_1=(num3*10)+num1;
			int par4_1=(num4*10)+num1;
			int par1_4=(num1*10)+num4;
			int par2_3=(num2*10)+num3;
			int par3_2=(num3*10)+num2;
			int par2_4=(num2*10)+num4;
			int par4_2=(num4*10)+num2;
			int par3_4=(num3*10)+num4;
			int par4_3=(num4*10)+num3;
			
			
			if(par1_2*par4_3==n) {
				System.out.println("Es Vampiro");
			}
			if(par1_2*par3_4==n) {
				System.out.println(" Es Vampiro");
			}
			if(par2_1*par4_3==n) {
				System.out.println("Es Vampiro");
			}
			if(par2_1*par3_4==n) {
				System.out.println("Es Vampiro");
			}
			if(par1_3*par2_4==n) {
				System.out.println("Es Vampiro");
			}
			if(par1_3*par4_2==n) {
				System.out.println("Es Vampiro");
			}
			if(par3_1*par2_4==n) {
				System.out.println("Es Vampiro");
			}
			if(par3_1*par4_2==n) {
				System.out.println("Es Vampiro");
			}
			if(par1_4*par2_3==n) {
				System.out.println("Es VAmpiro");
			}
			if(par1_4*par3_2==n) {
				System.out.println("Es VAmpiro");
			}
			if(par4_1*par2_3==n) {
				System.out.println("Es VAmpiro");
			}
			if(par4_1*par3_2==n) {
				System.out.println("Es VAmpiro");
			}
			
		}
		
		
		
	
	public static int contar(int i) {
		int div = i;
		int cont = 0;
		do {
			cont++;
			
			div/=10;
		}while (div!=0);
		return cont;
	}
	public static void main(String[] args) {
		System.out.println("Introduce un numero de cifras par");
		Scanner src= new Scanner(System.in);
		int num=src.nextInt();
		Colmillos(num);
		
	}
}
