package Ejercicio5;

import java.util.Random;

public class Velocista extends Ciclista {
	public Velocista(int identificador, String nombre, double pp, double vp) {
		super(identificador, nombre);
		// TODO Auto-generated constructor stub
		this.PotenciaPromedio = pp;
		this.velocidadPromedio = vp;
	}

	public double getPotenciaPromedio() {
		return PotenciaPromedio;
	}

	public void setPotenciaPromedio(double potenciaPromedio) {
		PotenciaPromedio = potenciaPromedio;
	}

	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	private double PotenciaPromedio = 0;
	private double velocidadPromedio = 0;

	/*
	 * 3/ para los velocistas reescribira este método de forma que además de hacer
	 * lo anteriormente indicado le añada un valor de 3 por la velocidad promedio y
	 * por ultimo se añada al atributo tiempoAcumulado.
	 */
	@Override
	public void calcularTiempoParcial() {
		Random r= new Random();
		this.tiempoAcumulado+= r.nextDouble(8,30);
		this.tiempoAcumulado+=this.velocidadPromedio*3;

	}
	@Override
	public String toString() {
		return "Velocista [PotenciaPromedio=" + PotenciaPromedio + ", velocidadPromedio=" + velocidadPromedio
				+ ", identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado
				+ ", posicionGeneral=" + posicionGeneral + "]";
	}

}
