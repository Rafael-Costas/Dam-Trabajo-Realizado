package AlgoRaro;

public class terstConsola {

	public static void main(String[] args) {
		Persona Jose = new Persona("Jose", "lamo", "1122334455", "Calle falsa");
		Persona Maria = new Persona("Maria", "azucar", "54354332", "Calle verdadera");
		Persona Dante = new Persona("Dante", "Danto", "432542543", "Calle de atras");
	
		ListaPersonas persona = new ListaPersonas();
		persona.añadirPersona(Dante);
		persona.añadirPersona(Maria);
		persona.añadirPersona(Jose);
		persona.listar();
		persona.borrarLista();
		persona.listar();
		persona.añadirPersona(Dante);
		persona.listar();
		persona.eliminarPersona(0);
		persona.listar();
		persona.eliminarPersona(0);

	}
}
