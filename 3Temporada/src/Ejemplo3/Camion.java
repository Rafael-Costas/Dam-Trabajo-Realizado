package Ejemplo3;

import java.awt.Color;
import java.util.Scanner;

public class Camion extends Vehiculo {
Scanner src= new Scanner(System.in);
private byte NumeroDeEjes;

Camion(byte NumeroDeRuedas) {
super(NumeroDeRuedas);
}

Camion(Color color, byte NumeroDeRuedas) {
super(color, NumeroDeRuedas);
}

Camion(Color color, byte NumeroDeRuedas, short Cilindrada) {
super(color, NumeroDeRuedas, Cilindrada);
}

Camion(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
super(color, NumeroDeRuedas, Cilindrada, Potencia);

}

Camion(Color color, byte NumeroDeRuedas, byte NumeroDeEjes, short Cilindrada, short Potencia) {
super(color, NumeroDeRuedas, Cilindrada, Potencia);
setNumeroDeEjes(NumeroDeEjes);
}

public byte getNumeroDeEjes() {
return NumeroDeEjes;
}

public void setNumeroDeEjes(byte NumeroDeEjes) {
this.NumeroDeEjes = NumeroDeEjes;
}

@Override
public String toString() {
return "Camion [NumeroDeEjes=" + NumeroDeEjes + ", getColor()=" + getColor() + ", getNumRuedas()="
+ getNumRuedas() + ", getCilindrada()=" + getCilindrada() + ", getPotencia()=" + getPotencia() + "]";
}
@Override
	public double pagarRodaje() {
		// TODO Auto-generated method stub
		return super.pagarRodaje()+2.17*getCilindrada();
	}

@Override
	public double pagarCarburante() {
		double litros=pideLitros();
		return super.pagarCarburante()+(litros*GASOIL) ;
	}
}