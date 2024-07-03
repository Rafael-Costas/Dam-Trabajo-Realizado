package ejemplo83;

public class Cilindro extends FIguraGeometrica{

	private double radio;
	private double altura;
	Cilindro(double altura, double radio){
		this.radio=radio;
		this.altura=altura;
		this.setVolumen(CalcularVolumen());
		this.setSuperficie(CalcularSuperficie());
	}
	
	public double CalcularVolumen() {
		double volumen = Math.PI *altura * Math.pow(radio, 2.0);
		return volumen;
	}
	public double CalcularSuperficie() {
		double areaLadoA = 2.0 * Math.PI * radio * altura;
		double areaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
		return areaLadoA + areaLadoB;
	}

	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
	}
	
}
