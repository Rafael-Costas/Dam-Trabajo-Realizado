package Intro;

public class Triangulo extends Figura implements  AreaFigura {
private double base;
private double alto;



public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAlto() {
	return alto;
}
public void setAlto(double alto) {
	this.alto = alto;
}
@Override
public String toString() {
	return "Triangulo [base=" + base + ", alto=" + alto + "]";
}
public Triangulo() {
	
}
public Triangulo(double alt, double base) {
	this.alto=alt;
	this.base=base;
}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int)(base*alto)/2;
	}

	

	
}
