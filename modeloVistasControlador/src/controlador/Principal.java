package controlador;

import Vista.añadir;
import modelo.añadirDao;


public class Principal {
	Coordinador miCoordinador;
	añadir añ;
	añadirDao año;
	
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
	}
	private void iniciar() {
		/*Se instancian las clases*/
		añ=new añadir();
		año= new añadirDao();
		miCoordinador= new Coordinador();
		añ.setCoordinador(miCoordinador);
		año.setCoordinador(miCoordinador);
		miCoordinador.setAñadir(añ);
		miCoordinador.setDao(año);
	
		añ.setVisible(true);
	}
}
