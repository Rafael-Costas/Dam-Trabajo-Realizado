package Intro;

public class Pez {

	private String nombre;
	private static int numPeces = 0;

	
	Pez() {
		numPeces++;
	}

	Pez(String n) {
		numPeces++;
		this.nombre = n;
	}
	
	public Pez(Pez a) {
		numPeces++;
		this.nombre = a.getNombre();
	}

	public int CuantaPecez() {
		return numPeces;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pez) {
			Pez tempPez = (Pez) obj;

			if (this.nombre == tempPez.nombre) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

	
	@Override
	public String toString() {
		return "Pez [nombre=" + nombre + "]";
	}

	@Override
	protected Object clone() {
		Object obj = null;
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return obj;
		}

	}

	public static void main(String[] args) {

		Pez Sardina= new Pez("Sardina");
		Pez Tiburon= new Pez("Tiburon");
		Pez Tigre = new Pez(Tiburon);
		Pez tonto= new Pez();

		System.out.println(Tiburon.CuantaPecez());
		System.out.println(Tiburon.toString());
		System.out.println(Tigre.equals(Tiburon));
		
		
	}

}
