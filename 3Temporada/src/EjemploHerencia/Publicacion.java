package EjemploHerencia;

public class Publicacion {
// Stributos
	protected int numeroDePaginas;
	
	protected float Precio;
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	@Override
	public String toString() {
		return "Publicacion [numeroDePaginas=" + numeroDePaginas + ", Precio=" + Precio + "]";
	}
	public Publicacion() {
		this.numeroDePaginas=0;
		this.Precio=0f;
	}
	public Publicacion(int numeroDePaginas, float precio) {
		super();
		this.numeroDePaginas = numeroDePaginas;
		Precio = precio;
	}
}
