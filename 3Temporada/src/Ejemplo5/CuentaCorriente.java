package Ejemplo5;

public class CuentaCorriente extends Cuenta {
float Sobregiro;
	public CuentaCorriente(float saldo, float TasaAnual) {
		super(saldo, TasaAnual);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void retirar(float cantidad) {
		if(saldo>= cantidad) {
			saldo-=cantidad;
			NumeroRetiro++;
		}else {
		saldo=0;
		Sobregiro=cantidad-saldo;
		NumeroRetiro++;
		}
		}

	@Override
	public void consignar(float cantidad) {
		if(Sobregiro>0) {
			if(cantidad-Sobregiro>=0) {
				super.consignar(cantidad-Sobregiro);
				Sobregiro=0;
			}else {
				Sobregiro-=cantidad;
			}
		}else {
			super.consignar(cantidad-Sobregiro);
			
		}
		}
	
	
}