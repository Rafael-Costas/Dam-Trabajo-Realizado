package modelo.vo;

import java.sql.Date;

public class TransaccionesVo {

	private int id;
	private int trCodCuenta;
	private Date trFechaTransaccion;
	private String trTipo;
	private int trCantidad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrCodCuenta() {
		return trCodCuenta;
	}
	public void setTrCodCuenta(int trCodCuenta) {
		this.trCodCuenta = trCodCuenta;
	}
	public Date getTrFechaTransaccion() {
		return trFechaTransaccion;
	}
	public void setTrFechaTransaccion(Date trFechaTransaccion) {
		this.trFechaTransaccion = trFechaTransaccion;
	}
	public String getTrTipo() {
		return trTipo;
	}
	public void setTrTipo(String trTipo) {
		this.trTipo = trTipo;
	}
	public int getTrCantidad() {
		return trCantidad;
	}
	public void setTrCantidad(int trCantidad) {
		this.trCantidad = trCantidad;
	}
}
