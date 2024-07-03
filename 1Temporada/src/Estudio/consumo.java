package Estudio;

public class consumo {
	/*
	 * kms. Kilómetros recorridos por el coche, litros. Litros de combustible
	 * consumido, vmed. Velocidad media, pgas. Precio de la gasolina. Métodos:
	 * getTiempo. Indicará el tiempo empleado en realizar el viaje. consumoMedio.
	 * Consumo medio del vehiculo (en litros cada 100 kilómetros). consumoEuros.
	 * Consumo medio del vehiculo (en euros cada 100 kilómetros).
	 */
	double km=0;
	double litros=0;
	double vmed=0;
	double pagas;
	
	public void getVariables(double k, double l, double v, double p) {
		this.km=k;
		this.litros=l;
		this.vmed=v;
		this.pagas=p;
	
	
	}

	
	
	
	public double tiempo() {
		double tiempo= this.km/this.vmed;
		return tiempo;
	}
	
	public double consumpMedio() {
		double res= (this.litros/this.km)*100;
		return res;
	}
	
	public double  consumoEuros() {
		double res= (this.pagas/this.km)*100;
		return res;
	}
	
	@Override
	public String toString() {
		return "consumo [km=" + km + ", litros=" + litros + ", vmed=" + vmed + ", pagas=" + pagas + "]";
	}
}
