package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Ordenamiento {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		int a= src.nextInt();
		int b= src.nextInt();
		int c= src.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
				if(b>c) {
					System.out.println(b);
					System.out.println(c);
				}else {
					System.out.println(b);
					System.out.println(c);
				}
			}else {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
				
			}
		}else {
			if(b>c) {
				System.out.println(b);
				if(a>c) {
					System.out.println(a);
					System.out.println(c);
				}else {
					System.out.println(c);
					System.out.println(a);
				}
			}else {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}
		
	}
}
