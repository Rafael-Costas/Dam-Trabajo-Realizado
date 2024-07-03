package Acceso_a_datos;

public class Videojuego extends Productos{
	
	Estilo estilo;
	Plataforma plataforma;
	Videojuego(String ref, String tit, double preAlquiler, int plaAlquiler, boolean alq, Estilo est, Plataforma plataforma) {
		super(ref, tit, preAlquiler, plaAlquiler, alq);
		this.estilo=est;
		this.plataforma=plataforma;
	}
	
}
