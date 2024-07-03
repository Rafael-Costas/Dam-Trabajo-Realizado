package Controlador;


import Vistas.Base;
import Vistas.ListadoCuentas;
import Vistas.transacciones;
import modelo.Logica;


public class Principal {
	 Logica miLogica;
	 Base miBase;
	 ListadoCuentas miListadoCuentas;
	 
	 transacciones miTransacciones;
	 Coordinador miCoordinador;
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
	}
	private void iniciar() {
		/*Se instancian las clases*/
		miBase=new Base();
		miListadoCuentas=new ListadoCuentas();
		miTransacciones= new transacciones();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		
		/*Se establecen las relaciones entre clases*/
		miBase.setCoordinador(miCoordinador);
		miListadoCuentas.setCoordinador(miCoordinador);
		miTransacciones.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
		miCoordinador.setMiVentanaPrincipal(miBase);
		miCoordinador.setMiVentanaRegistro(miListadoCuentas);
		miCoordinador.setMiVentanaBuscar(miTransacciones);
		miCoordinador.setMiLogica(miLogica);
				
		miBase.setVisible(true);
	}
}
