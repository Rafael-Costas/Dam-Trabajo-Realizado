package TiendaMascotas;

public class GatosPeloLargo  extends Gato{

	GatosPeloLargo(String nom, int edad, String col, gpl raz) {
		super(nom, edad, col);
		this.raz=raz;
	// TODO Auto-generated constructor stub
	}

	protected enum gpl {Angora, Himalayo, Balinés, Somalí};
	protected gpl raz;
	@Override
	public String toString() {
		return "GatosPeloLargo [raz=" + raz + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
}
