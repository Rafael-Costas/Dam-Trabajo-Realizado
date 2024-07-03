package Partido;

public class PartidoTenisMontecarlo implements PartidoTenis{
	
	//atributos

	String Local;

	 String Visitante;

	 int juegosLocal;

	 int juegosVisitante;

	@Override
	public void setEquipoLocal(String Local) {
		this.Local= Local;
		
	}

	@Override
	public void setEquipoVisitante(String Visitante) {
		this.Visitante= Visitante;
		
	}

	@Override
	public void setJuegosLocal(int juegos) {
		// TODO Auto-generated method stub
		this.juegosLocal=juegosLocal;
		
	}

	public void setJuegosVisitante(int juegosVisitante) {
		this.juegosVisitante = juegosVisitante;
	}

	@Override
	public String toString() {
		return "PartidoTenisMontecarlo [Local=" + Local + ", Visitante=" + Visitante + ", juegosLocal=" + juegosLocal
				+ ", juegosVisitante=" + juegosVisitante + "]";
	}
	
	
}
