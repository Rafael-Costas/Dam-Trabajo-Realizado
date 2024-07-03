package Objetos;

public class Coche {

	int numRuedas;

	String gasolina;
	int potencia;
	String color;
	String marca;
	String modelo;
	int numPuertas;
	double consumo;
	
	
	
	
	public void arrancar() {
		System.out.println("BRUM BRUM MOTHERFUCKER");
	}
	public void frenar() {
		System.out.println("Frenazo en seco");
	}
	public void Acelerar() {
		System.out.println("Meti el turbo pa'");
	}
	public void pasarItv() {
		System.out.println("Putas luces de mierda");
	}
	public void Acelerar(int v) {
		System.out.println("Has acelerado "+ v);
	}
	public void CambiarCocor(String Color) {
		this.color=Color;
	}
	@Override
	public String toString() {
		return "Coche [numRuedas=" + numRuedas + ", gasolina=" + gasolina + ", potencia=" + potencia + ", color="
				+ color + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas=" + numPuertas + ", consumo="
				+ consumo + "]";
	}
	public Coche(int numRuedas, String gasolina, int potencia, String color, String marca, String modelo,
			int numPuertas, double consumo) {
		
		this.numRuedas = numRuedas;
		this.gasolina = gasolina;
		this.potencia = potencia;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.numPuertas = numPuertas;
		this.consumo = consumo;
	}
	public Coche() {
		
	}
public Coche(int ruedas) {
		this.numRuedas = ruedas;
	}
	public static void main(String[] args) {	
		Coche Banana= new Coche(4, "marron", 70, "Amarillo", "FEO", "Yoquese", 1, -1);
		Banana.Acelerar();
		Banana.frenar();
		Banana.pasarItv();
		Banana.arrancar();
		System.out.println(Banana.toString());
	
}
}
