package CarreraCiclista2;

public class Velocista extends Ciclista {
public Velocista(int identificador, String nombre,  double pp, double vp) {
		super(identificador, nombre);
		// TODO Auto-generated constructor stub
		this.PotenciaPromedio=pp;
		this.velocidadPromedio=vp;
	}
public double getPotenciaPromedio() {
	return PotenciaPromedio;
}
public void setPotenciaPromedio(double potenciaPromedio) {
	PotenciaPromedio = potenciaPromedio;
}
public double getVelocidadPromedio() {
	return velocidadPromedio;
}
public void setVelocidadPromedio(double velocidadPromedio) {
	this.velocidadPromedio = velocidadPromedio;
}
private double PotenciaPromedio=0;
private double velocidadPromedio = 0;
@Override
public String toString() {
	return "Velocista [PotenciaPromedio=" + PotenciaPromedio + ", velocidadPromedio=" + velocidadPromedio
			+ ", identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado
			+ ", posicionGeneral=" + posicionGeneral + "]";
}
	

}
