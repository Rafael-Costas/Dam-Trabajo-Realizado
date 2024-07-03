package Ejemplo5;

public class Cuenta {
	
	//atributos
	protected int NumCuentas;
	protected String dueño;
	protected float saldo;
	protected int NumConsignaciones=0;
	protected int NumeroRetiro=0;
	protected float TasaAnual;
	protected float ComisionMensual=0;
	
	//Constructos
	public Cuenta(float saldo,float TasaAnual) {
		this.saldo =saldo;
		this.TasaAnual=TasaAnual;
	}
	/*
	 * Consignar una cantidad de dinero en la cuenta actualizando su saldo
	 */
	public void consignar(float cantidad) {
		saldo += cantidad;
		NumConsignaciones++;
	}
	
	public void retirar(float cantidad) {
		if(saldo>=0) {
			saldo=saldo-cantidad;
			NumeroRetiro++;
		}else {
			System.out.println("Alguien no tiene dineros");
		}
		
	}
	
	/*
	 * Calcular la interes mensual de algo que no sé
	 */
	public void CalcularInteres() {
		saldo=saldo*(TasaAnual /12);
	}
	@Override
	public String toString() {
		return "Cuenta [NumCuentas=" + NumCuentas + ", dueño=" + dueño + ", saldo=" + saldo + ", NumConsignaciones="
				+ NumConsignaciones + ", NumeroRetiro=" + NumeroRetiro + ", TasaAnual=" + TasaAnual
				+ ", ComisionMensual=" + ComisionMensual + "]";
	}
	
	
}
