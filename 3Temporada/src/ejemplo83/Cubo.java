package ejemplo83;

public class Cubo extends FIguraGeometrica{

	private double lado;
	
	Cubo(double lado){
	
		this.lado=lado;
		this.setVolumen(CalcularVolumen());
		this.setSuperficie(CalcularSuperficie());
	}
	public double CalcularVolumen() {
		double volumen = Math.pow(lado, 3);
		return volumen;
	}
	
	public double CalcularSuperficie() {
		double Superficie =Math.pow(this.lado, 2)*6;
		return Superficie;
	}
	@Override
	public String toString() {
		return "Cubo [lado=" + this.lado + "]";
	}
	
	
}
