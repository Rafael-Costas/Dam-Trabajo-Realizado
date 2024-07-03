package Cadenas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.println("Escribe una línea de texto cualquiera y pulsa retorno: ");
		String texto = lector.nextLine();

		System.out.println("¿Qué carácter quieres buscar?");
		String charText = lector.next();
		//lector.nextLine();
		char charBusca = charText.charAt(0);

		// metodos indexOf
		// metodos lastIndexOf
		int cont=0;
		int pos=-1;
		int posInicial = texto.indexOf(charBusca);
		int posFinal = texto.lastIndexOf(charBusca);
		
		for(int i=0; i<texto.length(); i++) {
			pos=texto.indexOf(charText, i);
			
			
			if(texto.charAt(i)==charBusca) {
				System.out.println("En la posicion "+pos+" está la letra "+charBusca);
				cont++;
			}
		}
		
		
		if (posInicial > -1) {
			System.out.println("Las apariciones del carácter " + charBusca + " son: "+cont);
			System.out.println("Primera vez en: " + posInicial);
			System.out.println("Última vez en: " + posFinal);
		} else {
			System.out.println("Este carácter no se encuentra en el texto.");
		}
	}
}