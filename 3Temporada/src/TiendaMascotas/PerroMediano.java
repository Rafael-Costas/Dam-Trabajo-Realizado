package TiendaMascotas;

public class PerroMediano extends Perro {

	PerroMediano(String nom, int edad, String col, raza ra) {
		super(nom, edad, col);
		this.raza= ra;
		// TODO Auto-generated constructor stub
	}
	protected	enum raza {Collie, Dalmata, Bulldog, Galgo, Sabueso}
	protected raza raza;
	@Override
	public String toString() {
		return "PerroMediano [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	
}
