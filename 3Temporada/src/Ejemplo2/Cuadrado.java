package Ejemplo2;

import java.awt.Color;
import java.util.Arrays;

public class Cuadrado extends Figura{
	private double lado ;
	
	Cuadrado(){
		this.lado=1;
	}
	Cuadrado(double l){
		this.lado=l;
	}
	Cuadrado(double l, Color c){
		super(c);
		this.lado=l;
	}
	Cuadrado(double l, Color c, int [] posicion){
		super(c, posicion);
		this.lado=l;
	}
	
	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}


@Override
public double Perimetro() {
	// TODO Auto-generated method stub
	return 4*lado;
}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion)
				+ "]";
	}
	@Override
	public double calculArea() {
		
		return lado*lado;
	}
	
	
}
