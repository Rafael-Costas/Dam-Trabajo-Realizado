package Acceso_a_datos;

public class Clientes {
	/*
	 * La aplicación también mantendrá un listado de clientes, de los clientes
	 * almacenaremos: ▪ No cliente, nombre, dirección, teléfono y productos
	 * alquilados.
	 */
	int numCliente;
	String nombre;
	String direccion;
	int num;
	Videojuego videojuego;
	Pelicula pelicula;
	Clientes(int numCliente, String nombre, String direccion, int num, Videojuego video){
	this.numCliente = numCliente;	
	this.nombre=nombre;
	this.direccion=direccion;
	this.num=num;
	this.videojuego = video;
	}
	Clientes(int numCliente, String nombre, String direccion, int num, Pelicula peli){
		this.numCliente = numCliente;	
		this.nombre=nombre;
		this.direccion=direccion;
		this.num=num;
		this.pelicula = peli;
		}
}
