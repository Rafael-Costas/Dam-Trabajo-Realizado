package propuesto49;

public class Pediatra extends Medico{

	enum tipologia{Neurologo, Psicologo};
	tipologia tipo;
	 Pediatra(String nombre, tipologia tipo)   {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}
	public tipologia getTipo() {
		return tipo;
	}
	public void setTipo(tipologia tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Pediatra [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	
}
