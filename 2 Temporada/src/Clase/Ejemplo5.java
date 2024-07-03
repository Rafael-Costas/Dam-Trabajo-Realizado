package Clase;

public class Ejemplo5 {

	public static void main(String[] args) {
		String cad1 = "pepe";
		String cad2 = new String("Banana");
		String cad3= new String(cad2);
		String cad4="chelo";
		System.out.println(cad1);
		System.out.println(cad2);
		System.out.println(cad3);
		System.out.println(cad4.length());
		String cad5 ="Andy";
		cad5=cad5.concat("AAAAAAAAAAAAAAAAAAAAAA");
		System.out.println(cad5);
	}
}
