package TiendaMascotas;

public class PerroPequeño extends Perro {

	PerroPequeño(String nom, int edad, String col, PP raz) {
		super(nom, edad, col);
		// TODO Auto-generated constructor stub
		this.raz = raz;
	}

	protected	enum PP{Caniche, yorkshire_terrier, schaurizer, chihuahua};
	protected PP raz;
	@Override
	public String toString() {
		return "PerroPequeño [raz=" + raz + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
}
