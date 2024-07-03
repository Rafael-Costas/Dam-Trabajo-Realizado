package TiendaMascotas;

public class GatoPeloCorto extends Gato {
GatoPeloCorto(String nom, int edad, String col, gpc raz) {
		super(nom, edad, col);
		// TODO Auto-generated constructor stub
		this.raz= raz;
	}

 protected enum gpc {Azul_Ruso, Británico, Manx, Devon_Rex};
 protected gpc raz;
@Override
public String toString() {
	return "GatoPeloCorto [raz=" + raz + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
}
 
}
