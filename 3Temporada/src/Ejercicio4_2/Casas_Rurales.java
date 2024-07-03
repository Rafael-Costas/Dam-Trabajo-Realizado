package Ejercicio4_2;

public class Casas_Rurales extends Casa {
	public Casas_Rurales(int i, int a, String d, int habitacione, int baños, int pisos, double cabece, int alt) {
		super(i, a, d,  habitacione, baños, pisos);
		this.cabeceraMunicipal=cabece;
		this.altitud=alt;
	}
	protected double cabeceraMunicipal;
	protected int altitud;
	protected double valorArea= 1500000;
	 
	@Override
	protected double calculaPrecio(double valorArea) {
		// TODO Auto-generated method stub
		return super.calculaPrecio(this.valorArea);
	}

	@Override
	public String toString() {
		return "Casas_Rurales [cabeceraMunicipal=" + cabeceraMunicipal + ", altitud=" + altitud + ", valorArea="
				+ valorArea + ", numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños="
				+ numBaños + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
}
