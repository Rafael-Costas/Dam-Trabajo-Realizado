package TiendaMascotas;

public class Gato extends Mascota{

	Gato(String nom, int edad, String col) {
		super(nom, edad, col);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void sonido() {
		// TODO Auto-generated method stub
		System.out.println("Miau miau");
	}
	

}
