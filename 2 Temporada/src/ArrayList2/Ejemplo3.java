package ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		/*
		 * Provincias de galicias
		 */
		ArrayList<String> provincias =new ArrayList<String>(List.of("Ourense,", "Lugo,"," Pontevedra,"," A Coruña"));
		String [] Cosas = { "Vigo"," eureka"};
		System.out.println(provincias);

		
		String [] unas = {"A d", "Lugswswo", "sqsqwdw","sqsqefwfvw"};
		ArrayList<String> Lugares = new ArrayList<String>(Arrays.asList(unas));
		System.out.println(Lugares);
		
	
		Scanner src= new Scanner(System.in);
		int cont=0;
		for (String n : provincias) {
			System.out.println("Posicion: "+cont+" Resultado: "+n);
			System.out.println("introduce un numero");
			String num = src.next();
			provincias.set(cont, num);
			System.out.println("Posicion: "+cont+" Resultado: "+n);
			cont++;
		}
		System.out.println(provincias);
	
	}
}
