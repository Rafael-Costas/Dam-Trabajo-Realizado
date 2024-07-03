package Ejercicio4_2;

public class CasaIndependiente extends Casa{

	protected CasaIndependiente(int i, int a, String d, int habitacione, int baños, int pisos) {
		super(i, a, d, habitacione, baños, pisos);
		// TODO Auto-generated constructor stub
		this.valorArea= 300000;
	}
	int valorArea;
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		return super.calculaPrecio(this.valorArea);
	}
	@Override
	public String toString() {
		return "CasaIndependiente [valorArea=" + valorArea + ", numPisos=" + numPisos + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}
	
	

}
