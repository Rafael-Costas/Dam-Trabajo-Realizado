package Intro;

import Estudio.rectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		
		Circulo cir= new Circulo(7);
		Cuadrado Cuac= new Cuadrado(2);
		Rectangulo rec= new Rectangulo(5, 0);
		Triangulo tri = new Triangulo(5, 10);
		System.out.println(Cuac.area());
		System.out.println(cir.area());
		System.out.println(rec.area());
		System.out.println(tri.area());
		
		System.out.println(Cuac.toString());
		System.out.println(cir.toString());
		System.out.println(rec.toString());
		System.out.println(tri.toString());
		
		System.out.println(Cuac.Perimetro());
		System.out.println(cir.Perimetro());
		System.out.println(rec.Perimetro());
		
		
	}
}
