package Juego2;

public class TestCarrera {

	public static void main(String[] args) {
		Carrera japon = new Carrera();
		japon.iniciarlizarCarrera();
		japon.Correr();
		//Coregir en la clase
	/*	try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		japon.mostrarClasificados();
		System.out.println("Acabo la prueba");
	}
}
