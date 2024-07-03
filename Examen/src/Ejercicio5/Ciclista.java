package Ejercicio5;

import java.util.Random;

public abstract class Ciclista {

	protected int identificador;
	protected String nombre;
	protected double tiempoAcumulado = 0;
	protected int posicionGeneral = 0;

	public Ciclista(int identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;

	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	public void buscarCiclista() {

	}

	public int getPosicionGeneral() {
		return posicionGeneral;
	}

	public void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}

	/*
	 * 2/ escriba para la clase ciclista el método void calcularTiempoParcial() de
	 * manera que obtenga un valor double entre 8 y 30, de forma aleatoria, y se
	 * añada al atributo tiempoAcumulado.
	 */
	public void calcularTiempoParcial() {
		Random r= new Random();
		this.tiempoAcumulado+= r.nextDouble(8,30);
	}
	@Override
	public String toString() {
		return "Ciclista [identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
				+ tiempoAcumulado + ", posicionGeneral=" + posicionGeneral + "]";
	}

}
