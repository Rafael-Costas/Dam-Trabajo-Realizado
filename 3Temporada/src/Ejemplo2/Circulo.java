package Ejemplo2;
import java.awt.Color;
import java.util.Arrays;
public class Circulo extends Figura {
 private double Radio;

 Circulo(double Radio) {
 setRadio(Radio);



 }

 Circulo(double Radio,Color color) {
 super(color);
 setRadio(Radio);
 }

 Circulo(double Radio, Color color, int[] Posicion) {
 super(color, Posicion);
 setRadio(Radio);
 }

 public void setRadio(double Radio) {
 this.Radio = Radio;
 }

 @Override
	public double calculArea() {
		return Math.PI * (Radio*Radio);
	}
 
 public double getRadio() {
 return Radio;
 }

@Override
public String toString() {
	return "Circulo [Radio=" + Radio + ", ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
}
 
@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
	super.Perimetro();	
	return 2*Math.PI*getRadio();
	}
 }
