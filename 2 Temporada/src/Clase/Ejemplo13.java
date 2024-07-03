package Clase;

public class Ejemplo13 {

	public static void main(String[] args) {
		StringBuffer nombre = new StringBuffer("Rafa");
		StringBuffer apellidos = new StringBuffer(80);
		StringBuffer Direccion = new StringBuffer("Tu puta casa");
		System.out.println(nombre.length());
		System.out.println(nombre.capacity());
		System.out.println(Direccion.capacity());
		System.out.println(apellidos.capacity());
		
		
		StringBuffer nome = new StringBuffer("Juan Carlos");
		StringBuffer apelidos = new StringBuffer("Algo bonito");
		System.out.println(nome.capacity());
		nome.append(apelidos);
		System.out.println(nome);
		System.out.println(nome.capacity());
		String dir = "";
		nome.append(dir);
		
		
		String otroApel="One Direction";
		nome.insert(nome.length(), otroApel);
		System.out.println(nome);
		
		nome.insert(14, "Hermoso dia que hace carajo");
		System.out.println(nome);
		System.out.println(nome.length());
		
		
		
	}
}
