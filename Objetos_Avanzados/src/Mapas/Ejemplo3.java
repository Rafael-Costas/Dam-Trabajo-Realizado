package Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		m.put(537, "Jose Luis");
		Scanner src = new Scanner(System.in);
		System.out.println("Pro favor introduce un codigo");
		int codigo = src.nextInt();
		if(m.containsKey(codigo)) {
			System.out.println("EL codigo "+codigo+" corresponde a ");
			System.out.println(m.get(codigo));
		}else {
			System.out.println("No existe el cdoigo");
		}
		
	}
}
