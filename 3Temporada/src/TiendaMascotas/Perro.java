package TiendaMascotas;

public class Perro extends Mascota {

	Perro(String nom, int edad, String col) {
		super(nom, edad, col);
		// TODO Auto-generated constructor stub
	}



	@Override
	protected void sonido() {
		// TODO Auto-generated method stub
		System.out.println("Guau guau Guao");
	}
}
