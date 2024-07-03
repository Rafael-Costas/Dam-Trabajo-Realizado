package Ejemplo2;

import java.awt.Color;
import java.util.Arrays;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	public Triangulo() {
		// TODO Auto-generated constructor stub
		base=1;
		altura=1;
	}
	public Triangulo(double b, double a) {
		this.base=b;
		this.altura=a;
	}
	public Triangulo(double b, double a, Color c, int [] pos) {
		super(c, pos);
		this.base=b;
		this.altura=a;
	}
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", ColorFigura=" + ColorFigura + ", Posicion="
				+ Arrays.toString(Posicion) + "]";
	}
	@Override
	public double calculArea() {
			return (base*altura)/2;
	}
	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		System.out.println("No es calcular el perimetro lo siento");
		return 0;
	}
}
