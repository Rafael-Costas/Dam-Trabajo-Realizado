package modelo;

import javax.swing.JOptionPane;

import Controlador.Coordinador;
import modelo.dao.Metodos;
import modelo.vo.cuentaVo;


public class Logica {
	
	private Coordinador miCoordinador;
	public static boolean consultaPersona=false;
	public static boolean modificaPersona=false;
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}
	
	public void validarRegistro(cuentaVo miPersona) {
		Metodos metodos;
		
			metodos = new Metodos();
			metodos.insertarPersona(miPersona)	;					
		
		
	}

}
