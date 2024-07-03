package Partido;

public class PartidoBaloncestoEuroLiga implements PartidoBaloncesto{

	String equipoLocal;

	 String equipoVisitante;

	 int cestasEquipoLocal;

	 int cestasEquipoVisitante;

	@Override
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal= nombreEquipo;
		
	}

	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		this.equipoVisitante= nombreEquipo;
		
	}
	
	@Override
	public void setCestasEquipoLocal(int marcador) {
		this.cestasEquipoLocal=cestasEquipoLocal;
		
	}
	
	@Override
	public void setCestasEquipoVisitante(int marcador) {
		this.cestasEquipoVisitante=cestasEquipoVisitante;
		
	}

	@Override
	public String toString() {
		return "PartidoBaloncestoEuroLiga [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", cestasEquipoLocal=" + cestasEquipoLocal + ", cestasEquipoVisitante=" + cestasEquipoVisitante + "]";
	}
	
	
}
