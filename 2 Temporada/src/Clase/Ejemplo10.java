package Clase;

public class Ejemplo10 {

	public static void main(String[] args) {
		String cad1 = "Juan Suarez";
		System.out.println(cad1);
		String cad2 = cad1.replace('u', 'i');
		
		System.out.println(cad1);
		System.out.println(cad2);
		String cad3=cad2.substring(5);
		System.out.println(cad3);
				
		
		String cad4= "MAYKA ROMERO";
		System.out.println(cad4.startsWith("MAI"));
		System.out.println(cad4.endsWith("O"));
				
	}
}
