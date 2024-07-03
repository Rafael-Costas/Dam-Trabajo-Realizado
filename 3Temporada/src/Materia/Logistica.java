package Materia;

public class Logistica {
	String nombre;
	private byte Capacidad;
	private byte NumeroDeHuecos;

	Logistica(byte Capacidad, String n) {
		this.Capacidad = Capacidad;
		NumeroDeHuecos = Capacidad;
		nombre = n;
	}

	public byte DimeNumeroDeHuecos() {
		return (NumeroDeHuecos);
	}

	public byte DimeCapacidad() {
		return (Capacidad);
	}

	public boolean HayHueco() {
		return (NumeroDeHuecos != 0);
	}

	public boolean HayContenedor() {
		return (NumeroDeHuecos != Capacidad);
	}

	public void MeteContenedor() {
		System.out.println(this.toString());
		NumeroDeHuecos--;
	}

	@Override
	public String toString() {
		return "Logistica [Capacidad=" + Capacidad + ", NumeroDeHuecos=" + NumeroDeHuecos + "]";
	}

	public void SacaContenedor() {
		NumeroDeHuecos++;
	}

} // LogisticaAlmacen