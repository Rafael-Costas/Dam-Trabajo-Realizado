package Objeto3;

public class Entrenador extends SeleccionFutbol{

	
	protected String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	
	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]";
	}

	public void Viajar() {
		super.Viajar();
		System.out.println("Viajan en avion en primera clase");
	}
	public void Concentrarse() {
		super.Concentrarse();
		System.out.println("El entrenador tiene una habitacion doble");
	}
	
}

