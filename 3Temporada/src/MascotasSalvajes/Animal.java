package MascotasSalvajes;

public abstract class Animal {

	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombre;
	
	abstract protected String getNombreCientifico();
	

	
	
	
	@Override
	public String toString() {
		return "Animal [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombre=" + nombre
				+ "]";
	}





	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	public String getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public  String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
