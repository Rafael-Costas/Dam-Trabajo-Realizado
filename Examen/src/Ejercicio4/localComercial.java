package Ejercicio4;


public class localComercial  extends Local implements impuestos{

	
	public localComercial(int i, int a, String d, double p, tipo2 calle, String centro) {
		super(i, a, d, p, calle);
		// TODO Auto-generated constructor stub
		this.centroComercial=centro;
	}


	protected double valorArea= 3475;
	protected String centroComercial;
	
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		
		return this.valorArea* this.area;
	}
	@Override
	public String toString() {
		return "localComercial [valorArea=" + valorArea + ", centroComercial=" + centroComercial + ", tipoLocal="
				+ tipoLocal + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}

	
	@Override
	public double calcularImpuestos() {
		double res = (calculaPrecio(1)*104)/100;
		return res;
	}
	
	

}