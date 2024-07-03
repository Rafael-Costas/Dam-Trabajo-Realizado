package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
public class GatosGatunos {

	public static void main(String[] args) {
	ArrayList<Gato> g = new ArrayList<Gato>();
	g.add(new Gato("Garfield", "naranja", "mestizo", 12));
	g.add(new Gato("Pepe", "gris", "angora", 1));
	g.add(new Gato("Mauri", "blanco", "manx", 32));
	g.add(new Gato("Ulises", "marrón", "persa", 1));
	System.out.println("\nDatos de los gatos:\n");
	for (Gato gatoAux: g) {
	System.out.println(gatoAux+"\n");
	}
	
	System.out.println("Datos ordenados de mas a menos adad");
		Collections.sort(g);
		for (Gato gatoAux: g) {
			System.out.println(gatoAux+"\n");
			}
	}
	}
