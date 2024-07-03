package Ejemplo411;

public abstract class Vehiculo {

	protected int velocidadActual;
	protected int velocidadMaxima;
	public Vehiculo(int velocidadAct, int velocidadMax){
		this.velocidadActual = velocidadAct;
		this.velocidadMaxima = velocidadMax;
	}
	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	public abstract void acelerar(int velocidad);
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public abstract void frenar(int velocidad);
	
}
