package Cadenas;

import java.util.Random;
import java.util.Scanner;

public class AdivinaPalabra {

	public static String Palabra() {
		String Palabra= "";
		Random r= new Random();
		for(int i=0; i<4; i++) {
			Palabra+=(char) (r.nextInt(97, 122));
		}
		
		return Palabra;
	}
	public static void main(String[] args) {
		
		String Palabra=Palabra();
		System.out.println(Palabra);
	
		Scanner lector = new Scanner(System.in);
		System.out.println("Empezamos el juego.");
		System.out.println("Adivina una palabra del diccionario.");
		boolean acierto = false;
		int cont=0;
		while (!acierto &&  cont<10) {
			System.out.print("¿Qué palabra crees que es?");
			String Intento = lector.nextLine();
			cont++;
			//metodo compareTo
			int posicion = Intento.compareTo(Palabra);
			if (posicion < 0) {
				// La palabra del usuario es anterior a la secreta.
				System.out.println("Has fallado! La palabra va después ...");
			} else if (posicion > 0) {
				// La palabra del usuario es posterior a la secreta
				System.out.println("Has fallado! La palabra va antes ...");
			} else {
				// Si vale 0, es que se ha acertado.
				acierto = true;
			}
		}
		if(acierto)
		System.out.println("Enhorabuena. Has acertado! Lo acertaste en el intento "+cont);
	}

}