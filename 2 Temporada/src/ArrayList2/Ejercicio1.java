package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> Clase = new ArrayList<String>();
		Clase.add("Jose Antonio");
		Clase.add("Antonio Jose");
		Clase.add("Ricardito");
		Clase.add("Lord Antonio");
		Clase.add("Javi");
		Clase.add("Jose");
		Collections.sort(Clase);
		for (String string : Clase) {
			System.out.println(string);
		}
	}
}
