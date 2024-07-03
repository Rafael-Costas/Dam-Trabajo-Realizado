package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejemplo1 {
	//declaramos un mapa
			public static void main(String[] args) {
				HashMap<Integer, String> m = new HashMap<Integer, String>();
				
			
			//metodo para añadir parejas al map
			m.put(924, "Amalia Núñez");
			m.put(921, "Cindy Nero");
			m.put(700, "César Vázquez");
			m.put(219, "Víctor Tilla");
			m.put(537, "Alan Brito");
			m.put(605, "Esteban Quito ");
			m.put(537, "Jose Luis");
			

			System.out.println("Los elementos de m son: \n" + m);
			System.out.println(m.get(323));
			System.out.println(m.entrySet());
			for (Map.Entry pareja : m.entrySet()) {
				System.out.println("Esta es la clave "+ pareja.getKey());
				System.out.println("Este es su valor "+ pareja.getValue());
				
			}
			
		
			}
}
