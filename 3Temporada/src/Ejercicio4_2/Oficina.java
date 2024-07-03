package Ejercicio4_2;

public class Oficina extends Local{

	public Oficina(int i, int a, String d, double p, boolean e,tipo calle) {
		super(i, a, d, p,calle);
		this.esGobierno=e;
		// TODO Auto-generated constructor stub
	
	}
	
	protected double valorArea=3500000;
	protected boolean esGobierno;
	
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		return super.calculaPrecio(this.valorArea);
	}

	@Override
	public String toString() {
		return "Oficina [valorArea=" + valorArea + ", esGobierno=" + esGobierno + "]";
	}

	
	
}
