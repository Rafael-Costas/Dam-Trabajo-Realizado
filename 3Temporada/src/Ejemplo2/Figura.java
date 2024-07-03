package Ejemplo2;

import java.awt.Color;
import java.util.Arrays;

import Ejemplo3.Vehiculo;

abstract class Figura implements Comparable, Perimetrosa{
protected Color ColorFigura;
 protected int[] Posicion = new int[2];

 Figura() {
 SetColor(Color.black);
 Posicion[0] = 0;
 Posicion[1] = 0;
 }
 @Override
 public int compareTo(Object arg0) {
 	// TODO Auto-generated method stub
 	Figura v = (Figura) arg0;
 	if(this.calculArea() > v.calculArea())
 		return 1 ;
 		else if(this.calculArea() == v.calculArea())
 	return 0;
 			else
 				return -1;
 }



 Figura(Color color) {
 SetColor(color);
 }

 Figura(Color color, int[] Posicion) {
 SetColor(color);
 SetCentro(Posicion);
 }

 public void SetColor(Color color) {
 ColorFigura = color;
 }

 public Color getColor() {
 return ColorFigura;
 }

 public void SetCentro(int[] Posicion) {
 this.Posicion[0] = Posicion[0];
 this.Posicion[1] = Posicion[1];
 }

 public int[] getCentro() {
 return Posicion;
 }

public abstract double calculArea();


public double Perimetro() {
	System.out.println("Esto es un metodo de la clase figura");
	return 2;
}

@Override
public String toString() {
	return "Figura [ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
}

 }