package Intro;

public class Cuadrado extends Figura implements AreaFigura, PermimetroFigura{

	private int lado;

	public Cuadrado(int lado) {
		this.lado= lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return lado * lado* lado *lado ;
	}


}
