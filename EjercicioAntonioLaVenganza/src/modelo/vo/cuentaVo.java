package modelo.vo;

import java.sql.Date;

public class cuentaVo {
private int cuCodCuenta;
private int cuCodSucursal;
private Date cuFechaCreacion;
private int cuSaldo;
public int getCuCodCuenta() {
	return cuCodCuenta;
}
public void setCuCodCuenta(int cuCodCuenta) {
	this.cuCodCuenta = cuCodCuenta;
}
public int getCuCodSucursal() {
	return cuCodSucursal;
}
public void setCuCodSucursal(int cuCodSucursal) {
	this.cuCodSucursal = cuCodSucursal;
}
public Date getCuFechaCreacion() {
	return cuFechaCreacion;
}
public void setCuFechaCreacion(Date cuFechaCreacion) {
	this.cuFechaCreacion = cuFechaCreacion;
}
public double getCuSaldo() {
	return cuSaldo;
}
public void setCuSaldo(int cuSaldo) {
	this.cuSaldo = cuSaldo;
}

}
