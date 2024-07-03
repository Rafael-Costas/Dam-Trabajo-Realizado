package ejemplo83;

public class Esfera  extends FIguraGeometrica{
	private double radio;
	public Esfera(double radio) {
		this.radio=radio;
		this.setSuperficie(calcilarVolumen());
		this.setVolumen(CalcularSuperficie());
	}
	public double calcilarVolumen() {
		double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
		return volumen;
	}
	public double CalcularSuperficie() {
		double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
		return superficie;
	}
	@Override
	public String toString() {
		return "Esfera [radio=" + radio + "]";
	}
	
}
