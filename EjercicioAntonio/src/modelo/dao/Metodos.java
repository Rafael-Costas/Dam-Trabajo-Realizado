package modelo.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import javax.swing.JOptionPane;

import ModeloConexion.ConexionBd;
import modelo.vo.ClienteVo;
import modelo.vo.cuentaVo;

public class Metodos {
	public ClienteVo insertarPersona(cuentaVo cuenta) {
		ConexionBd conex= new ConexionBd();
		try {
			Statement estatuto = conex.getConexion().createStatement();
			estatuto.execute("use bancovigo");
			estatuto.executeUpdate("INSERT INTO Cuenta VALUES ('"+cuenta.getCuCodCuenta()+"', '"
					+cuenta.getCuCodSucursal()+"', '"+cuenta.getCuFechaCreacion()+"', '"
					+cuenta.getCuSaldo()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
		
		return null;
		
	}
	public ClienteVo Actualizar(cuentaVo cuenta) throws SQLException {
		ConexionBd conex= new ConexionBd();
		
		   conex.getConexion().setCatalog("bancoVigo");
		String consulta="UPDATE cuenta SET CuCodSucursal= ? ,cuFechaCreacion = ? , cuSaldo=?  WHERE cuCodCuenta= ? ";
		PreparedStatement	estatuto = conex.getConexion().prepareStatement(consulta);
	
		
        estatuto.setInt(1, cuenta.getCuCodSucursal());
        estatuto.setDate(2, cuenta.getCuFechaCreacion());
        estatuto.setInt(3, (int) cuenta.getCuSaldo());
       
        estatuto.setInt(4, cuenta.getCuCodCuenta());
        estatuto.execute();

      JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
     

		return null;
		
		
	}

	public ClienteVo Delete(cuentaVo cuenta) {
		ConexionBd conex= new ConexionBd();
		try {
			
			Statement estatuto = conex.getConexion().createStatement();
			estatuto.execute("use bancovigo");
			estatuto.executeUpdate("delete from cuenta where cuCodCuenta = "+ cuenta.getCuCodCuenta());
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
		
		return null;
		
	}

	
}
