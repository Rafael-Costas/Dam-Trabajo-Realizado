package Ejercicio1;

public class Cine {
	String nombre;
	private byte Capacidad;
	//private byte NumeroDeHuecos;
	private byte numeroDeButacas;
	Cine(byte Capacidad, String n) {
		this.Capacidad = Capacidad;
	//	NumeroDeHuecos = Capacidad;
		numeroDeButacas =0;
		nombre = n;
	}

	public int NumerodeContenedores() {
		return (numeroDeButacas);
	}

	public byte DimeCapacidad() {
		return (Capacidad);
	}

	public boolean HayHueco() {
		return (numeroDeButacas != Capacidad);
	}

	public boolean HayContenedor() {
		return (numeroDeButacas != 0);
	}

	public void MeteContenedor() {
		System.out.println(this.toString());
		numeroDeButacas++;
	}

	@Override
	public String toString() {
		return "Cine [Capacidad=" + Capacidad + ", numeroDeButacas=" + numeroDeButacas + "]";
	}

	public void SacaContenedor() {
		System.out.println(this.toString());
		numeroDeButacas--;
	}

} // LogisticaAlmacen

