package Cadenas;

import java.util.Scanner;

public class Acronimos {

	public static void main(String[] args) {
		String muyLarga ="";
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una frase con diferentes palabras");
		muyLarga =src.nextLine();
		String [] Arr = muyLarga.split(" ");
		String acronimo = "";
		for(int i=0; i<Arr.length; i++) {
			
			if(65<=(int)Arr[i].charAt(i) && 91>=(int)Arr[i].charAt(i) )
			acronimo+=Arr[i].charAt(0);
		}
		System.out.println(acronimo);
		
	}
}
