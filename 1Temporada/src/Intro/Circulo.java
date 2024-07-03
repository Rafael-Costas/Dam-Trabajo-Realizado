package Intro;

public class Circulo extends Figura implements AreaFigura,PermimetroFigura  {

	private int radio;
	final static double PI= 3.1416;
	Circulo(int r){
		super();
		this.radio=r;
	}
	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return radio*radio*(int)PI;
	}

	@Override
	public double Perimetro() {
		
		return (2*PI)*radio;
	}
	
	public static void main(String[] args) {
		
	}
	
}
