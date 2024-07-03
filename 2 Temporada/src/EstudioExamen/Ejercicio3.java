package EstudioExamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	/*
	 * Código que vaya leyendo palabras desde el teclado hasta encontrar la
palabra "fin".
Cuando esto sucede, debe mostrar por pantalla la palabra que estaría
en la última posición alfabética de entre todas las escritas. La
palabra "fin" queda excluida.
	 */
		Scanner src= new Scanner(System.in);
		String frase;
		System.out.println("Introduce las palabras que quieras, si quieres para pon fin");
		//frase=src.next();
		boolean a =true;
		String res="";
		do {
			frase=src.next();
			res+=frase +" ";
			if(frase.equals("fin")) {
				a = false;
			}else {
				
			}
		}while(a);
		System.out.println(res); 
	}
}
