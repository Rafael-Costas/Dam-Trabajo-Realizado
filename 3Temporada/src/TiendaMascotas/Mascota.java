package TiendaMascotas;

public  class Mascota {

	protected String nombre;
	protected int edad;
	protected String color;
	 Mascota(String nom, int edad, String col){
		this.nombre=nom;
		this.edad=edad;
		this.color=col;
	}
	protected  void sonido() {
	System.out.print("no sé");
	}
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}

}
