package Algo;

public class testSatelite {

	public static void main(String[] args) {
		
		
		//Genero un satelite con los parametros ya dados
		satelite Rojelio= new satelite(1.1, 2.2, 3.3);
		
		
		// genero un satelite sin parametros 
		satelite Arduino= new satelite();
		
		
		//Le doy valores al Objeto que no tiene valores
		Arduino.setPosicion(312, 232.2, 212142.2);
		
		
		//Uso estos metodos para mostrar las vatiables por pantalla, un metodo
		//fue generado automaticamente mientras el cotro 
		Arduino.printPosicion();
		System.out.println(Rojelio.toString());
		Rojelio.VariarALtura(40);
		System.out.println(Rojelio.toString());
		Rojelio.VariarALtura(70);
		System.out.println(Rojelio.toString());
		
		System.out.println(Rojelio.enOrbita());
		
		
	
	}
}
