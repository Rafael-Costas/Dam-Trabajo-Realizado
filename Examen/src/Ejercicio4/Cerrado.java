package Ejercicio4;



public class Cerrado extends Casa_Urbana implements impuestos {
	public Cerrado(int i, int a, String d,  int habitacione, int baños, int pisos, int adm, double Pisi, boolean cp) {
		super(i, a, d, habitacione, baños, pisos);
		// TODO Auto-generated constructor stub
		this.administracion=adm;
		this.Piscina=Pisi;
		this.CamposDeportivos= cp;
	}
	protected int administracion;
	protected double ValorArea=2125;
	protected double Piscina;
	protected boolean CamposDeportivos;
	
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		
		return this.ValorArea* this.area;
	}
	@Override
	public String toString() {
		return "Cerrado [administracion=" + administracion + ", ValorArea=" + ValorArea + ", Piscina=" + Piscina
				+ ", CamposDeportivos=" + CamposDeportivos + ", numPisos=" + numPisos + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}
	@Override
	public double calcularImpuestos() {
		double res = (calculaPrecio(1)*107)/100;
		res += (this.numBaños*400) + (this.numHabitaciones*500);
		if(this.Piscina!=0) {
			res += 7000;
		}
		if(this.CamposDeportivos) {
			res += 5000;
		}
		return res;
	}

}
