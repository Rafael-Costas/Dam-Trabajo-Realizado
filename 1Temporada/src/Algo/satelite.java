package Algo;

/*
 * Método void variaAltura(double desplazamiento). Este método acepta un parámetro que será positivo o
negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
Método boolean enOrbitaQ. Este método devolverá false si el satélite está en tierra y true en caso
contrario.
Método void variaPosicion(double variap, double variam). Este método permite modificar los atributos de
posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores
positivos o negativos relativos que harán al satélite modificar su posición.F
 */
public class satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}
	public void varaCordenadas(double variap, double variam) {
		meridiano= meridiano+variam;
		paralelo=paralelo+variap;
	}
	/*public void variaPosicion(double variap, double variam, double variad) {
		meridiano= meridiano+variam;
		paralelo=paralelo+variap;
		distancia_tierra+=variad;
	}*/
	public void variaPosicion(double variap, double variam, double variad) {
		varaCordenadas(variap, variam);
		VariarALtura(variad);
	}

	public boolean enOrbita() {
		if(distancia_tierra>0) {
			return true;
		}else {
			return false;
		}
	}
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	public void VariarALtura(double desplazamiento) {
		distancia_tierra=distancia_tierra+desplazamiento;
	}

	public void printPosicion() {
		System.out.println("El satelite se encuentra en el paralelo " + paralelo + " Meridianao " + meridiano
				+ " a una distancia de la tierra de " + distancia_tierra + " Kilometros");
	}

	@Override
	public String toString() {
		return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra
				+ "]";
	}

}