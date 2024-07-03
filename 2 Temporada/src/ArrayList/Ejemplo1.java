package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList <String>();
		ArrayList<String> otra = new ArrayList<>(12);
		
		lista.add("uno");
		otra.add( "dos");
		otra.add("tres");
		System.out.println(lista);
		System.out.println(otra);
		lista.clear();
		System.out.println(lista);
		System.out.println(lista.isEmpty());
		System.out.println(otra.get(1));
		
		System.out.println(otra.lastIndexOf("dos"));
ArrayList<String> doble = (ArrayList<String>) otra.clone();
System.out.println(doble);
	otra.add("cuatro");
	doble.add(0, "cero");
	System.out.println(doble);
	System.out.println(otra);
	System.out.println(otra.contains("Algo"));
	
	
	System.out.println(doble.remove(2));
	System.out.println(doble);
	doble.remove(doble.remove("cero"));
	System.out.println(doble);
	doble.set(0, "cinco");
	System.out.println(doble);
	}
}
