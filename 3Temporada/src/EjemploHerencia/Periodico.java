package EjemploHerencia;

public class Periodico extends Publicacion{
	private String Nombre;
	private String Fecha;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public Periodico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Periodico(int ndp, float p,String nombre, String fecha) {
		super(ndp, p);
		Nombre = nombre;
		Fecha = fecha;
	}
	
}
