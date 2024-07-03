package Ejercicio4;

public class AparteamentoEstudio extends Apartamento  implements impuestos{

	protected AparteamentoEstudio(int i, int a, String d, int habitacione, int baños) {
		super(i, a, d, habitacione, baños);
		// TODO Auto-generated constructor stub
	}
	
	int valorArea = 1775;
	
	@Override
	public String toString() {
		return "AparteamentoEstudio [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		
		return this.valorArea* this.area;
	}

	@Override
	public double calcularImpuestos() {
		double res = (calculaPrecio(1)*105)/100;
		

		return res;
	
}


}
