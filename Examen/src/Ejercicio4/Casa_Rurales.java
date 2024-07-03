package Ejercicio4;


public class Casa_Rurales extends Casa implements impuestos {
	public Casa_Rurales(int i, int a, String d, int habitacione, int baños, int pisos, double cabece, int alt) {
		super(i, a, d,  habitacione, baños, pisos);
		this.cabeceraMunicipal=cabece;
		this.altitud=alt;
	}
	protected double cabeceraMunicipal;
	protected int altitud;
	protected double valorArea= 1425;
	 
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		
		return this.valorArea* this.area;
	}
	@Override
	public String toString() {
		return "Casas_Rurales [cabeceraMunicipal=" + cabeceraMunicipal + ", altitud=" + altitud + ", valorArea="
				+ valorArea + ", numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños="
				+ numBaños + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	@Override
	public double calcularImpuestos() {
		double res = (calculaPrecio(1)*107)/100;
		res += (this.numBaños*400) + (this.numHabitaciones*500);
		res += this.altitud *3;
		return res;
	}
	
}

