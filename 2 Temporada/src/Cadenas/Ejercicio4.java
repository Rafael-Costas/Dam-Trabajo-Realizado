package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Introduce una frase");
		String Frase = src.nextLine();
		System.out.println("Introduce que quieres poner en mayucula");
		String upper = src.nextLine();
		String [] Arr= Frase.split(" ");
		String [] ArrUp= upper.split(" ");
		
		for(int i=0; i<Arr.length; i++) {
			
			for(int j=0; j<ArrUp.length; j++) {
				if(Arr[i].equals(ArrUp[j])) {
					Arr[i]=Arr[i].toUpperCase();
				}
			}
			
		}
		String res= "";
		for (String string : Arr) {
			res+=string+ " ";
		}
		System.out.println(Frase);
		System.out.println(res);
	}
}
