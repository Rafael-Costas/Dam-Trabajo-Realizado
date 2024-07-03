package Ejercicio1;

public class Persona {
	protected String nombre;
	protected String direccion;
	Persona(String nom, String dir){
		this.nombre=nom;
		this.direccion=dir;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
