package Materia;

public class Logistica2ç {

	String nombre;
	private byte Capacidad;
	//private byte NumeroDeHuecos;
	private byte numeroDeContenedores;
	Logistica2ç(byte Capacidad, String n) {
		this.Capacidad = Capacidad;
	//	NumeroDeHuecos = Capacidad;
		numeroDeContenedores =0;
		nombre = n;
	}

	public int NumerodeContenedores() {
		return (numeroDeContenedores);
	}

	public byte DimeCapacidad() {
		return (Capacidad);
	}

	public boolean HayHueco() {
		return (numeroDeContenedores != Capacidad);
	}

	public boolean HayContenedor() {
		return (numeroDeContenedores != 0);
	}

	public void MeteContenedor() {
		System.out.println(this.toString());
		numeroDeContenedores++;
	}

	@Override
	public String toString() {
		return "Logistica [Capacidad=" + Capacidad + ", numeroDecontenedores=" + numeroDeContenedores + "]";
	}

	public void SacaContenedor() {
		
		numeroDeContenedores--;
	}

} // LogisticaAlmacen
