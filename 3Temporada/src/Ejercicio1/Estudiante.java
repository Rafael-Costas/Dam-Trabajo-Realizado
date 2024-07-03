package Ejercicio1;

public class Estudiante extends Persona {

	protected String carrera;
	protected String semestre;
	Estudiante(String nom, String dir, String carrera, String semestre) {
		super(nom, dir);
		this.carrera = carrera;
		this.semestre= semestre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	

}
