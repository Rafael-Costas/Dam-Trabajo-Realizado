package Ejemplo411;

public class test {

	public static void main(String[] args) {
		Terrestre camioneta = new Terrestre(50, 120);
		Acuatico barquito = new Acuatico(50, 110);
		System.out.println(camioneta.toString());
		camioneta.acelerar(50);
		System.out.println("Nueva velocidad actual "+ camioneta.getVelocidadActual());
		System.out.println(barquito.toString());
		System.out.println("Revoluciones del motor = "+ barquito.calcularRevolucionesMotor(1200, 2));
		
		barquito.recomendarVelocidad(20);
		System.out.println(barquito.toString());
	}
}
