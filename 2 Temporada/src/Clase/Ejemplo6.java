package Clase;

public class Ejemplo6 {

	public static void main(String[] args) {
		
		String cad1 ="EMMA";
		String cad2="PEPI";
		String cad3="PEPI";
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad2.compareTo(cad3));
		System.out.println(cad2.compareTo(cad1));
		System.out.println(cad2.equals(cad3));
		
		System.out.println(cad1.compareTo("EMMA MORENO"));
		System.out.println(cad1.compareTo("PEPI AMPARO"));
		System.out.println(cad2.compareTo("MORIA"));
		
		System.out.println(cad1.compareToIgnoreCase("emma"));
	}
}
