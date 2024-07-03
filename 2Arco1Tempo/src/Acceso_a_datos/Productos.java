package Acceso_a_datos;

public class Productos {
	String referencia;
	String titulo;
	double precioAlquiler;
	int plazoAlquiler;
	boolean alquilado;
	
	Productos(String ref, String tit, double preAlquiler, int plaAlquiler, boolean alq){
		this.referencia=ref;
		this.titulo=tit;
		this.precioAlquiler=preAlquiler;
		this.plazoAlquiler=plaAlquiler;
		this.alquilado=alq;
	}
}
