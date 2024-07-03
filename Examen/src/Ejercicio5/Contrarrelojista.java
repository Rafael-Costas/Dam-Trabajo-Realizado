package Ejercicio5;

public class Contrarrelojista extends Ciclista{

	protected double velocidadMaxima=0;
	public Contrarrelojista(int identificador, String nombre,  double vM) {
		super(identificador, nombre);
		// TODO Auto-generated constructor stub
		this.velocidadMaxima=vM;
	}
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	@Override
	public String toString() {
		return "Contrarrelojista [velocidadMaxima=" + velocidadMaxima + ", identificador=" + identificador + ", nombre="
				+ nombre + ", tiempoAcumulado=" + tiempoAcumulado + ", posicionGeneral=" + posicionGeneral + "]";
	}
@Override
	public void calcularTiempoParcial() {
		// TODO Auto-generated method stub
		super.calcularTiempoParcial();
		this.tiempoAcumulado=this.velocidadMaxima*2;
	}
public void  imprimitTipo() {
	System.out.println("Soy contrarrelojista");
}
}
