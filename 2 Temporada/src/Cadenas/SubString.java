package Cadenas;

import java.util.Scanner;

public class SubString {

	/*
	 * Un programa que esttrae todo el texto de una frase menos una parte
	 */
	public static void main(String[] args) {
		String palabra="";
		String res="";
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una frase hermano");
		palabra=src.nextLine();
		System.out.println(palabra);
	
		int inicioSubcadena=palabra.indexOf(' ');
		int finSubCadena = palabra.lastIndexOf(' ');
		System.out.print("el texto sin la primera y ultima plabra es: ");
		res=palabra.substring(inicioSubcadena, finSubCadena);
		
		if(inicioSubcadena == finSubCadena) {
			System.out.println("no hay nada entre ellas");
		}else {
			System.out.println(res);
		}
	}
}
