package ArrayList2;

import java.util.ArrayList;

public class Ejemplo5 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido de la lista: ");
		for (String color : a) {
			System.out.println(color);
		}
		a.add(1, "turquesa");
		System.out.println("Contenido del vector después de insertar en la posición 1: ");
		for (String color : a) {
			System.out.println(color);
		}
	}
}