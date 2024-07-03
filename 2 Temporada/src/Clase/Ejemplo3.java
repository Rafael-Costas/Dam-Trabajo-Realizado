package Clase;

import java.util.Scanner;

public class Ejemplo3 {
	private static int [] Banana;
	final static int POSICIONES=10;
	
	
public static void main(String[] args) {
	int dato=0;
	int media=0;
Scanner src= new Scanner(System.in);
	Banana = new int [POSICIONES];
	for(int i=0; i<Banana.length; i++) {
	try {
		
	
		System.out.println("Introduzca la temperatura: ");
		String sdato= src.next();
		dato=Integer.parseInt(sdato);
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Tu puta madre");
	}
		Banana[i]=dato;
		
		
	}
	for(int i=0; i<POSICIONES;i++) {
		media+=Banana[i];
	}
	media = media/POSICIONES;
	System.out.println("la media es: "+media);
}
}