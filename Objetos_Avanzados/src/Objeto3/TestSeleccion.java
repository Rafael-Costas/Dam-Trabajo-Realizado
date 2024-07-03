package Objeto3;

import java.util.ArrayList;

public class TestSeleccion {

	public static ArrayList<SeleccionFutbol> Integrantes = new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "interior derecho");
		Masajista raulMartinez= new Masajista(3, "Raúl", "Martinez", 41, "LIcenciado en Fisioterapia", 18);
		Integrantes.add(delBosque);
		Integrantes.add(iniesta);
		Integrantes.add(raulMartinez);
				
		System.out.println("Todos los integrantes se concentran ");
		for (SeleccionFutbol integrantes : Integrantes) {
			System.out.print(integrantes.toString()+ " -> ");
			integrantes.Concentrarse();
		}
		System.out.println(" ");
		System.out.println("Todos los integrantes viajana ");
		for (SeleccionFutbol integrantes : Integrantes) {
			System.out.print(integrantes.toString()+ " -> ");
			integrantes.Viajar();
		}
	
	//Entrenamiento
		
	System.out.println("\n Entrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar ");
	System.out.println(delBosque.toString()+" -> ");
	delBosque.dirigirEntrenamiento();
	System.out.println(iniesta.toString()+" -> ");
	iniesta.entrenar();
	
	//masaje
	System.out.println("\n Masaje: Solamente el Masajeador puede masajear ");
	System.out.println(raulMartinez.toString()+" -> ");
	raulMartinez.darMasaje();
	
	
	//Partido
	System.out.println("Solo el jugador y el entrenador tiene metodos para el partido");
	System.out.println(delBosque.toString()+" -> ");
	delBosque.dirigirPartido();
	System.out.println(iniesta.toString()+" -> ");
	iniesta.jugarPartido();
	
	}
}
