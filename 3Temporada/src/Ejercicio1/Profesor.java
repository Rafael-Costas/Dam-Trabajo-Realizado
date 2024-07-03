package Ejercicio1;

public class Profesor extends Persona {
	protected String departamento;
	protected String categoria;

	Profesor(String nom, String dir, String dep, String cat) {
		super(nom, dir);
		// TODO Auto-generated constructor stub
		this.departamento =dep;
		this.categoria=cat;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
}
