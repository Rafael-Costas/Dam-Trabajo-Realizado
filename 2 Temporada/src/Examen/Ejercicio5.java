package Examen;

import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que cree dos arrayLists de paises, que serán strings:
		 * España, Francia, Italia, etc., ambos de tamaño mayor que cinco y con paises
		 * repetidos entre los dos (no en cada uno). Con posterioridad dicho programa
		 * comparará ambos arrayLists y almacenará en un tercer arrayList los paises
		 * repetidos de ambos.
		 */
		ArrayList<String> Paises = new ArrayList<String>();
		ArrayList<String> Paises2 =  new ArrayList<String>();
		Paises.add("España");
		Paises.add("Franci");
		Paises.add("Mexico");
		Paises.add("Inglaterra");
		Paises.add("Madagascar");
		Paises.add("China");
		
		Paises2.add("España");
		Paises2.add("Italia");
		Paises2.add("Inglaterra");
		Paises2.add("Rusia");
		Paises2.add("Japon");
		Paises2.add("China");
		Paises2.add("Madagascar");
		
		
		ArrayList<String> Res = new ArrayList<String>();
		//no le he puesto lower case a los string porque consideraba que sobraba
		for (String string : Paises) {
			for (String string2 : Paises2) {
				if(string.equals(string2)) {
					Res.add(string);
				}
			}
		}
		System.out.println(Res);
		
	}
}
