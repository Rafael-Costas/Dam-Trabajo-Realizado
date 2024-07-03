package Ejemplo411;

public class Acuatico extends Vehiculo implements vela, Motor{

	public Acuatico(int velocidadAct, int velocidadMax) {
		super(velocidadAct, velocidadMax);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int aceleracion) {
		int vel = velocidadActual +aceleracion;
		if(vel > velocidadMaxima) {
			System.out.println("Te pilla la policia");
		}else {
			this.velocidadActual= vel;
		}
		
}
	@Override
	public void frenar(int frenar) {
		int vel = velocidadActual -frenar;
		if(vel < 0) {
			System.out.println("La velocidad no puede ser negativa");
		}else {
			this.velocidadActual= vel;
		}
		
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		
		return (fuerza*radio);
	}

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		if(velocidadViento > 80 || velocidadViento <10) {
			this.velocidadActual =0;
		}
		
	}
	}
