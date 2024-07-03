package Clase;

public class Ejemplo14 {

	
	public static void main(String[] args) {
		StringBuffer nome = new StringBuffer("Torreon");
		nome.reverse();
		System.out.println(nome);
		StringBuffer modulo= new StringBuffer("Lenguajes de marcas y sistemas de gestion de informacion");
		modulo.delete(21, 67);
		System.out.println(modulo);
		modulo.replace(15,89, "Babuino");
		System.out.println(modulo);
	
		String inmuta = modulo.substring(0,modulo.length());
		System.out.println(inmuta);
		
		String fin = modulo.toString();
		System.out.println("cadena "+fin + " tamaño "+fin.length());
	}
}
