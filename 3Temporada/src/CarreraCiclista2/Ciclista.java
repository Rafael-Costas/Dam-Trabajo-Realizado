package CarreraCiclista2;

public abstract class  Ciclista {

	protected int identificador;
	protected String nombre;
	protected int tiempoAcumulado=0;
	protected int posicionGeneral=0;
	
	
	
	public Ciclista(int identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	public void buscarCiclista() {
		
	}
	public int getPosicionGeneral() {
		return posicionGeneral;
	}
	public void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}
	@Override
	public String toString() {
		return "Ciclista [identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
				+ tiempoAcumulado + ", posicionGeneral=" + posicionGeneral + "]";
	}
	
}
