package Ejemplo5;

public class test {

	public static void main(String[] args) {
		CuentaAhorros abc= new CuentaAhorros(10000, 500);
		CuentaCorriente cba = new CuentaCorriente(200000, 500);
		abc.CalcularInteres();
		abc.consignar(500);
		abc.retirar(0);
		cba.CalcularInteres();
		cba.consignar(500);
		cba.retirar(0);
		cba.consignar(700);
	}
}
