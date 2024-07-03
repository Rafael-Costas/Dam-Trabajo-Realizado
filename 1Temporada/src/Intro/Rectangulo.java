package Intro;

import Estudio.rectangulo;

public class Rectangulo extends Figura implements AreaFigura, PermimetroFigura{

	
	
	private String nombre;
	private int ancho = 0;
	private int alto = 0;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return  super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	Rectangulo(int an, int al, String nombre) {
		super();
		ancho = an;
		this.alto = al;
		this.nombre=nombre;
	}
	Rectangulo(int an, int al ) {
		ancho = an;
		this.alto = al;
		
	}

	public int getAncho() {
		return this.ancho;
	}

	public int getAlto() {
		return this.alto;
	}

	public int incrementaAncho() {
		ancho++;
		return this.ancho;
	}

	public int incrementarAlto() {
		alto++;
		return this.alto;
	}

	
	public void setName(String Algo) {
		this.nombre=Algo;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return "rectangulo [ancho=" + ancho + ", alto=" + alto +"nombre"+ nombre + "]";
	}

	/*
	 * como deseamos poder calcular ares de rectangulos
	 * tenfre que escribir 
	 */
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return this.ancho*this.alto;
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 2*alto+2*ancho;
	}

	

	}

