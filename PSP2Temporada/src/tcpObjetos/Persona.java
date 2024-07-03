package tcpObjetos;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Persona implements Serializable {
	static Scanner src =  new Scanner(System.in);
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	String nombre;
	int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
public static Persona modificarPersona() {
		
		System.out.println("Introduce datos personas");
		System.out.println("Introduce nombre");
		String nombre = src.nextLine();
		System.out.println("Introduce la edad");
		int edad = src.nextInt();
		
		Persona person = new Persona(nombre, edad);
		                                                                                                                                                                                                                                                                                                                          
		return person;
		
		
	}
}// Fin de Persona
