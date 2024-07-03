package Ejercicio4;



public class ApartamentoFamiliar extends Apartamento implements impuestos{

	public ApartamentoFamiliar(int i, int a, String d,  int habitacione, int baños, int valorAdm) {
		super(i, a, d,  habitacione, baños);
		// TODO Auto-generated constructor stub
		this.valorAdministracion=valorAdm;
	}
	protected double ValorArea = 2425;
	protected int valorAdministracion;

	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		
		return this.ValorArea* this.area;
	}
@Override
public String toString() {
	return "ApartamentoFamiliar [ValorArea=" + ValorArea + ", valorAdministracion=" + valorAdministracion
			+ ", numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area=" + area
			+ ", direccion=" + direccion + "]";
}
@Override
public double calcularImpuestos() {
	double res = (calculaPrecio(1)*105)/100;
	res += (this.numBaños*400) + (this.numHabitaciones*500);
	res+= this.valorAdministracion*5;
	return res;
}


}
