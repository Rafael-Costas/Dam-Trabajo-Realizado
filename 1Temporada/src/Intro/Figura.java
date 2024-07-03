package Intro;

public class Figura {

	double area;
	double perimetro;
	String color;

	
	Figura() {
	area=0;
	perimetro=0;
	}
	
	Figura(double a, double p, String color){
		this.area=a;
		this.perimetro=p;
		this.color=color;
	}

	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + ", color="+color+"]";
	}
	
	
}
