package Cosasdiferentes;

public class Circunferencia {
	int x=10;
	int y=10;
	int radio=20;
	
	/*
	 *
	 */
	/**
	 *  El metodo consiste en calcular si cierto punto está dentro del area
	 * el metodo devuelve un boolean con la respuesta
	 * @param px coordenadas horizontales del objetivo
	 * @param py coordenadas verticales del objetivo
	 * @return devuleve true si esta dentro o flase si no esta dentro
	 */
	public boolean Ponitinside(int px, int py){
		int vx=px-x;
		int vy=py-y;
		float h= (float)Math.sqrt(vx*vx + vy+vy);
		
		return h<radio;
	}
	
	public static void main(String[] args) {
		
	}
}
