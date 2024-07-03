package Ejercicio4_2;

public class ApartamentoFamiliar extends Apartamento  {

	public ApartamentoFamiliar(int i, int a, String d,  int habitacione, int baños, int valorAdm) {
		super(i, a, d,  habitacione, baños);
		// TODO Auto-generated constructor stub
		this.valorAdministracion=valorAdm;
	}
	protected double ValorArea = 2000000;
	protected int valorAdministracion;

	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		return super.calculaPrecio(this.ValorArea);
	}
@Override
public String toString() {
	return "ApartamentoFamiliar [ValorArea=" + ValorArea + ", valorAdministracion=" + valorAdministracion
			+ ", numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area=" + area
			+ ", direccion=" + direccion + "]";
}

}
