package Estudio;

public class Cuadrado {
	private static int lado = 0;

	Cuadrado(int lados) {
		lado = lados;
	}

	public int area() {
		return lado*lado;
	}
	
	public static void main(String[] args) {
		Cuadrado mine= new Cuadrado(5);
		System.out.println("El ares es "+mine.area());
		Cuadrado craft= new Cuadrado(7);
		System.out.println("El ares es "+craft.area());

	
	
	}
	
}
