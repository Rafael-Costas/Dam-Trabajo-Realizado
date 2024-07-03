package EjerciciosParaEntretenerme;

public class TestEntero {

	public static void main(String[] args) {
		//Dos constructores, uno con parametros otro sin ellos
		Entero a= new Entero();
		Entero b = new Entero(5);
		
		//Utilizamos los metodos suma y resta
		a.suma(3);
		b.resta(3);
		
		//mostramos los objetos
		System.out.println(a.getValor());
		System.out.println(b.getValor());
		
		//Mostramos que pasaria si los multiplicasemos por dos y por tres
		a.getDoble();
		b.getTriple();
		
		//En el ojeto a lo pasamos 1000 y en el objeto B pasamos el numero a 0
		a.setNumero(1000);
		b.setNumero(0);
		
		
		//Mostramos los ultimos cambios realizado con un toString
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
