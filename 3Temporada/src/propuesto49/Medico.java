package propuesto49;

public class Medico {

	protected String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	Medico(String nombre){
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + "]";
	}
	
	
}
