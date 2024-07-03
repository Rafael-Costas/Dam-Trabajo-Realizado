package Ejercicio4;

public class Casa_Urbana extends Casa{
	protected Casa_Urbana(int i, int a, String d, int habitacione, int baños, int pisos) {
		super(i, a, d,  habitacione, baños, pisos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Casa_Urbana [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños
				+ ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	
}
