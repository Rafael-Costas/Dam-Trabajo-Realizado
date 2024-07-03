package Mapas;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio8 {

	/*
	 * Ejercicio8
	 * Realiza un programa que escoja entre 8 cartas de la baraja española
	 */
	
	static ArrayList<Carta> lista = new ArrayList<>();
	public static void main(String[] args) {
		Carta c = new Carta();
		lista.add(c);
		do {
			Carta m = new Carta();
			if(lista.contains(m)) {
				System.out.println("cagaste");
			}else {
				lista.add(m);
				
			}
			
		}while(lista.size()<5);
	for (Carta string : lista) {
		System.out.println(string);
	}
	}
}
