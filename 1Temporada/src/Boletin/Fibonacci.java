package Boletin;

import java.util.Scanner;

public class Fibonacci {

	public static int Fibonacci(int num,int a, int b) {
		
		int aux=0;
		if(num<=3) {
			
			return a;
		}else {
			aux=a;
			
			return Fibonacci(num-1,a+b, b=aux );
		}
	}
	public static void main(String[] args) {
		System.out.println("Cuantos numeros de fibonacci quieres mostrar?");
		Scanner src= new Scanner(System.in);
		int num=src.nextInt();
		int a= 1;  //termino penultimo
		int b= 1;  //termino ultimo
		
	
		int aux=0;
		int res=Fibonacci(num, aux, b);
		
		System.out.println("El numero en el indice "+num+" es "+Fibonacci(num,a ,b));
		
		
		
		
	}
}
