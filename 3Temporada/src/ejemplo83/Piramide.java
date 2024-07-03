package ejemplo83;

public class Piramide extends FIguraGeometrica{

	private double base;
	private double altura;
	private double apotema;
	Piramide(double altura, double base, double apotema){
		this.base=base;
		this.apotema=apotema;
		this.altura=altura;
		this.setSuperficie(calcularSuperficie());
		this.setVolumen(calcularVolumen());
	}
	
	public double calcularVolumen() {
		double volumen = (Math.pow(base, 2.0)*altura)/3.0;
		return volumen;
	}
	public double calcularSuperficie() {
		double areaBase = Math.pow(base, 2.0);
		double areaLado= 2.0 * base*apotema;
		return areaBase + areaLado;
	}
}
