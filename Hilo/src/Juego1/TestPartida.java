package Juego1;

import java.util.ArrayList;
import java.util.List;

public class TestPartida {

	public static void main(String[] args) {
		List<Tirada> players = new ArrayList<Tirada>();
		for(int i=0; i<5;i++ ) {
			Tirada t= new Tirada("a"+i);
			players.add(t);
		}
		Partida p = new Partida(players);
			for (Tirada tirada : p.getJugadores()) {
				tirada.start();
				try {
					tirada.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			p.resultadosPuntos();
			p.verMarcaddor();
	}
}
