package TiendaMascotas;

public class GatoSinPelo extends Gato {

	GatoSinPelo(String nom, int edad, String col, gsl raza) {
		super(nom, edad, col);
		// TODO Auto-generated constructor stub
		raz=raza;
	}

	protected enum gsl{Esfinge, elfo, donksoy};
	protected gsl raz;
	@Override
	public String toString() {
		return "GatoSinPelo [raz=" + raz + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	
}
