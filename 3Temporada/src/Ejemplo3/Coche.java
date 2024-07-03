package Ejemplo3;

import java.awt.Color;

public class Coche extends Vehiculo {
	private int NumeroPuertas;

	Coche(Color color, byte NumRuedas, short Cilindrada, short Potencia) {
		super(color, NumRuedas, Cilindrada, Potencia);
		
	}
	Coche(Color color, byte NumRuedas, short Cilindrada) {
		super(color, NumRuedas, Cilindrada);
		
	}
	Coche(Color color, byte NumRuedas) {
		super(color, NumRuedas);
		
	}
	Coche(Color color) {
		super(color);
		
	}
	
	public Coche(byte NumRuedas) {
		super(NumRuedas);
		// TODO Auto-generated constructor stub
	}
	public Coche(short Cilindrada) {
		super(Cilindrada);
		// TODO Auto-generated constructor stub
	}
	public Coche(Color color, byte NumRuedas, short Cilindrada, short Potencia, int numPuertas) {
		super(color, NumRuedas, Cilindrada, Potencia);
		this.NumeroPuertas = numPuertas;
	}

	
	public int getNumeroPuertas() {
		return NumeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		NumeroPuertas = numeroPuertas;
	}
	@Override
	public short getPotencia() {
		// TODO Auto-generated method stub
		return super.getPotencia();
	}
	@Override
	public String toString() {
		return "Coche [NumeroPuertas=" + NumeroPuertas + ", getColor()=" + getColor() + ", getNumRuedas()="
				+ getNumRuedas() + ", getCilindrada()=" + getCilindrada() + ", toString()=" + super.toString()
				+ ", pagarRodaje()=" + pagarRodaje() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	@Override
	public double pagarRodaje() {
		// TODO Auto-generated method stub
		return super.pagarRodaje()+40*getNumeroPuertas()+0.18*getPotencia();
	}
	
	@Override
	public double pagarCarburante() {
		double litros = pideLitros();
		if(esDiesel())
		return super.pagarCarburante()+(litros*GASOLINA);
		else 
			return super.pagarCarburante()+(litros*GASOIL);
		
	}
}
