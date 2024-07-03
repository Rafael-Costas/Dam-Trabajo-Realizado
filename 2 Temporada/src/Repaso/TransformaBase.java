package Repaso;

import java.util.Scanner;

public class TransformaBase {
public static void muestraCifra (int dat) {
	if(dat<10) {
		System.out.print(dat);
	}else {
		dat-=10;
		char c= (char)('A'+dat);
		System.out.print(c);
	}
}
public static void transform(int dato, int base) {
	if(base>dato) {
		muestraCifra(dato);
	}else {
		transform(dato/base, base);
		muestraCifra(dato%base);
	}
}
	public static void main(String[] args) {
		
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce el dato");
		int num=src.nextInt();
		
		System.out.println("Introduce la base");
		int base=src.nextInt();
		transform(num, base);
		System.out.println("");
		transform(12, 16);
		System.out.println("");
		transform(13, 8);
		System.out.println("");
	}
}
