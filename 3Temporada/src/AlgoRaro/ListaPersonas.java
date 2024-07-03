package AlgoRaro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas implements Serializable {

	ArrayList<Persona> listaPersona;
	public ListaPersonas() {
		listaPersona = new ArrayList<>();
	}
	public void añadirPersona(Persona p) {
		listaPersona.add(p);
	}
	public void eliminarPersona(int i) {
		if(i<listaPersona.size())
		listaPersona.remove(i);
		else
			System.out.println("Numero no valido");
	}
	public void borrarLista() {
		listaPersona.removeAll(listaPersona);
	}	
	
	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}
	public void setListaPersona(ArrayList<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}
	public void listar() {
		int cont=0;
		for (Persona persona : listaPersona) {
			System.out.println("Index "+cont+" "+persona.toString());
			cont ++;
		}
	}
}
