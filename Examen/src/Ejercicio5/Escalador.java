package Ejercicio5;

import java.util.Random;

public class Escalador extends Ciclista {
	protected double aceleracionPromedio;
	protected double gradoRampa;

	public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
		super(identificador, nombre);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}

	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}
	/*
	 * 4/ en el caso de los escaladores exactamente igual y añadiendo un valor de 5
	 * por la aceleración promedio y ese total se añadira al atributo
	 * tiempoAcumulado.
	 */
	@Override
	public void calcularTiempoParcial() {
		Random r= new Random();
		this.tiempoAcumulado+= r.nextDouble(8,30);
		this.tiempoAcumulado+=this.aceleracionPromedio*5;

	}

	@Override
	public String toString() {
		return "Escalador [aceleracionPromedio=" + aceleracionPromedio + ", gradoRampa=" + gradoRampa
				+ ", identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado
				+ ", posicionGeneral=" + posicionGeneral + "]";
	}

}
