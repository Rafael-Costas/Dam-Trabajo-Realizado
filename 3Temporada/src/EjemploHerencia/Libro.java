package EjemploHerencia;

public class Libro extends Publicacion{
	private String Titulo;
	private String TipoPortada;
	private String ISBN;
	private String NombreAutor;
	private String Editorial;
	private String getTitulo() {
		return Titulo;
	}
	
	public Libro(int ndp, float p,String titulo, String tipoPortada, String iSBN, String nombreAutor, String editorial) {
		super(ndp, p);
		Titulo = titulo;
		TipoPortada = tipoPortada;
		ISBN = iSBN;
		NombreAutor = nombreAutor;
		Editorial = editorial;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getTipoPortada() {
		return TipoPortada;
	}
	public void setTipoPortada(String tipoPortada) {
		TipoPortada = tipoPortada;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNombreAutor() {
		return NombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		NombreAutor = nombreAutor;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [Titulo=" + Titulo + ", TipoPortada=" + TipoPortada + ", ISBN=" + ISBN + ", NombreAutor="
				+ NombreAutor + ", Editorial=" + Editorial + ", numeroDePaginas=" + numeroDePaginas + ", Precio="
				+ Precio + "]";
	}

	
}
