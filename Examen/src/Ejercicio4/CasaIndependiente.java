package Ejercicio4;



public class CasaIndependiente extends Casa implements impuestos{

	protected CasaIndependiente(int i, int a, String d, int habitacione, int baños, int pisos) {
		super(i, a, d, habitacione, baños, pisos);
		// TODO Auto-generated constructor stub
		this.valorArea= 3375;
	}
	int valorArea;
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		
		return this.valorArea* this.area;
	}
	@Override
	public String toString() {
		return "CasaIndependiente [valorArea=" + valorArea + ", numPisos=" + numPisos + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}
	@Override
	public double calcularImpuestos() {
		double res = (calculaPrecio(1)*107)/100;
		res += (this.numBaños*400) + (this.numHabitaciones*500);
		return res;
	}
	
	

}