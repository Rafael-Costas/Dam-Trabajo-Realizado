package Ejercicio4;


public class vivienda extends Inmuebles{

	protected vivienda(int i, int a, String d,  int habitacione, int baños) {
		super(i, a, d);
		this.numHabitaciones=habitacione;
		this.numBaños=baños;
		// TODO Auto-generated constructor stub
	}
	protected int numHabitaciones;
	protected int numBaños;
	
	
	
	@Override
	public String toString() {
		return "vivienda [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", id=" + id + ", area="
				+ area + ", direccion=" + direccion + "]";
	}



	@Override
	public double calcularImpuestos() {
		// TODO Auto-generated method stub
		return 0;
	}



	



	
	
}