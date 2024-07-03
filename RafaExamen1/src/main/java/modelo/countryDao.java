package modelo;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Controlador.Coordinador;



public class countryDao {
Coordinador cor;
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.cor=miCoordinador;
		
	}
	public void registrarPais(Country pais)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO `country` (`country_id`, `country`, `last_update`) VALUES (NULL, '"+pais.getPais()+"', current_timestamp())");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}
}
