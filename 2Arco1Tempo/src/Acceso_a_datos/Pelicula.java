package Acceso_a_datos;

public class Pelicula {
	
	Genero genero;
	int año;
	String director;
	String interpretes;
	Pelicula( Genero gen, int año, String director, String interpretes) {
		
		// TODO Auto-generated constructor stub
		this.genero=gen;
		this.año=año;
		this.director=director;
		this.interpretes=interpretes;
	}
}
