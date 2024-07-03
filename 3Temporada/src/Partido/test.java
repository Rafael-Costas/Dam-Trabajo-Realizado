package Partido;

public class test {

	public static void main(String[] args) {
		
		PartidoFutbolLigaEspañola pfle = new PartidoFutbolLigaEspañola();
		
		pfle.setEquipoLocal("Peñasco");
		pfle.setEquipoVisitante("Rapido B");
		pfle.setGolesEquipoLocal(2);
		pfle.setGolesEquipoVisitante(0);
		System.out.println("tiempo de juego: "+ PartidoFutbol.duracionPartidoFutbol);
		System.out.println(pfle.toString());
		
		PartidoBaloncestoEuroLiga pbel = new PartidoBaloncestoEuroLiga();
		
		pbel.setEquipoLocal("Lavadores");
		pbel.setEquipoVisitante("Sedona");
		pbel.setCestasEquipoLocal(111);
		pbel.setCestasEquipoVisitante(90);
		System.out.println("tiempo de juego: "+PartidoBaloncesto.duracionPartidoBaloncesto);
		System.out.println(pbel.toString());
		
		PartidoTenisMontecarlo ptm = new PartidoTenisMontecarlo();
		
		ptm.setEquipoLocal("Nadal");
		ptm.setEquipoVisitante("Federer");
		ptm.setJuegosLocal(5);;
		ptm.setJuegosVisitante(23);
		System.out.println(ptm.toString());
	}
}
