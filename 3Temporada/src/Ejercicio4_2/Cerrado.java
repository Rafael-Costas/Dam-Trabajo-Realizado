package Ejercicio4_2;

public class Cerrado extends Casa_Urbana {
	public Cerrado(int i, int a, String d,  int habitacione, int baños, int pisos, int adm, double Pisi, boolean cp) {
		super(i, a, d, habitacione, baños, pisos);
		// TODO Auto-generated constructor stub
		this.administracion=adm;
		this.Piscina=Pisi;
		this.CamposDeportivos= cp;
	}
	protected int administracion;
	protected double ValorArea=2500000;
	protected double Piscina;
	protected boolean CamposDeportivos;
	
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		return super.calculaPrecio(this.ValorArea);
	}

	@Override
	public String toString() {
		return "Cerrado [administracion=" + administracion + ", ValorArea=" + ValorArea + ", Piscina=" + Piscina
				+ ", CamposDeportivos=" + CamposDeportivos + ", numPisos=" + numPisos + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}
	

}
