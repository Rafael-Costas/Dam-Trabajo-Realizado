package ArrayList2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo4 {

	public static void main(String[] args) {
		ArrayList<String> a  = new ArrayList<String>(List.of("rojp", "verde", "azul", "blanco", "amarillo"));
		System.out.println("contenido de la lista: ");
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
	}
}
