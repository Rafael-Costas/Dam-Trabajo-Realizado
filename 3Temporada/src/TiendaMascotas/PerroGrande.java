package TiendaMascotas;

public class PerroGrande extends Perro {
	PerroGrande(String nom, int edad, String col, raz raza) {
		super(nom, edad, col);
		// TODO Auto-generated constructor stub
		this.raza = raza;
	}

	protected enum raz{Pastor_Alemán, Doberman, Rotweiller};
	protected raz raza;
	@Override
	public String toString() {
		return "PerroGrande [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
}
