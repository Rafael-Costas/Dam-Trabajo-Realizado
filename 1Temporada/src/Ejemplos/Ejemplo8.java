package Ejemplos;

public class Ejemplo8 {

	public static void main(String[] args) {
		boolean i=true;
		boolean a= true;
		
		//Si ambos casos son iguales ocurren
		if(i && a) {
			System.out.println("JUJA");
		}
		//Si algun caso es true se cumple
		if(i|a) {
		System.out.println("Obama");
		}
		//Si i es difente a A se cumple
		if(i!=a) {
			System.out.println("Patata");
		}
		
		if(i^a) {
			System.out.println("Chandebrito");
		}
	}
}
