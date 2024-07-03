package Ejercicio4_2;

public class localComercial  extends Local{

	
	public localComercial(int i, int a, String d, double p, tipo calle, String centro) {
		super(i, a, d, p, calle);
		// TODO Auto-generated constructor stub
		this.centroComercial=centro;
	}


	protected double valorArea= 3000000;
	protected String centroComercial;
	
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		return super.calculaPrecio(this.valorArea);
	}

	@Override
	public String toString() {
		return "localComercial [valorArea=" + valorArea + ", centroComercial=" + centroComercial + ", tipoLocal="
				+ tipoLocal + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}

	
	
	
	

}
