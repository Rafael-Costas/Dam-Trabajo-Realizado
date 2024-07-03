package Juego1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partida {
	List<Tirada> Jugadores;
	
	Partida(List<Tirada> j){
		this.Jugadores=j;
	}
	//metodo para Inicializar
	
	//Metodo para ordenar los jugadores por puntos
	public void resultadosPuntos() {
		Collections.sort(Jugadores);
	}
	
	public void verMarcaddor() {
		resultadosPuntos();
	for(Tirada tirada : Jugadores) {
		System.out.println(tirada.toString());
	}
	}

	public List<Tirada> getJugadores() {
		return Jugadores;
	}

	public void setJugadores(List<Tirada> jugadores) {
		Jugadores = jugadores;
	}
}
