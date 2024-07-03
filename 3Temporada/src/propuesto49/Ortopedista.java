package propuesto49;

public class Ortopedista extends Medico{

	enum tipologia {pediatria, maxilofacial};
	tipologia tipo;
	Ortopedista(String nombre, tipologia tipo) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
	}
	public tipologia getTipo() {
		return tipo;
	}
	public void setTipo(tipologia tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Ortopedista [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	
}
