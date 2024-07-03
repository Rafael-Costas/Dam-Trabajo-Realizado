package Clase;

public class Ejemplo4 {

	public static void main(String[] args) {
		char [] nombre ={'p','e','p','e'};
		char [] nombre2 = {112, 101, 112, 101};
		char [] nombre3 = new char[4];
		for(int i=0;i<nombre.length; i++ ) {
			System.out.print(nombre[i] +", ");
		}
		System.out.println("");
		for(int i=0;i<nombre2.length; i++ ) {
			System.out.print(nombre2[i] +", ");
		}
		System.out.println("");
		for(int i=0;i<nombre3.length; i++ ) {
			System.out.print(nombre3[i] +", ");
		}
		
		System.out.println("");
		System.out.println(nombre);
		System.out.println(nombre2);
		System.out.println(nombre3);
	int [] num = {1,2,3,4,5};
	System.out.println(num);
	String frase ="Hola jode antonio";
	System.out.println(frase);
	
	System.out.println(frase.charAt(3));
	
	
	}
}
