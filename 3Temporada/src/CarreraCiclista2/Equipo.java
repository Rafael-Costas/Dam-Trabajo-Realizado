package CarreraCiclista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Equipo {
	protected String nombre;
	protected int totalTiempo;
	String pais;
	private int posicion=0;
	protected ArrayList<Ciclista> listaCiclistas;
	Equipo(String nombre, String pais){
		this.nombre=nombre;
		this.pais=pais;
		totalTiempo=0;
		listaCiclistas = new ArrayList();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public int calcularTotalTiempo() {
		
		for (Ciclista ciclista : listaCiclistas) {
			this.totalTiempo+=ciclista.getTiempoAcumulado();
		}
		System.out.println("Tiempo acumulado es "+ this.totalTiempo);
		return this.totalTiempo;
	}
	
	public void añadirCicilista(Ciclista ciclista) {
		this.listaCiclistas.add(ciclista);
	}
	public void listarCiclista(){
		for (Ciclista ciclista : listaCiclistas) {
			ciclista.toString();
		}
	}
	public void buscarCiclista() {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce el nombre del ciclista");
		String nom= src.next();
		boolean algo = true;
		for (Ciclista ciclista : listaCiclistas) {
			if(nom.equals(ciclista.getNombre())) {
				ciclista.toString();
				algo=false;
			}	
		}
		if(algo) {
			System.out.println("No existe");
		}
	}
	public void ordernarPosiciones() {
		Collections.sort(listaCiclistas, new Comparator<Ciclista>() {
            @Override
            public int compare(Ciclista p1, Ciclista p2) {
                return p1.getTiempoAcumulado() - p2.getTiempoAcumulado();
            }
        });
		ListIterator<Ciclista> itr = listaCiclistas.listIterator();
		while(itr.hasNext()) {
			itr.next().setPosicionGeneral(itr.nextIndex());
		}
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", totalTiempo=" + totalTiempo + ", pais=" + pais + ", posicion=" + posicion
				+ ", listaCiclistas=" + listaCiclistas + "]";
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public ArrayList<Ciclista> getListaCiclistas() {
		return listaCiclistas;
	}

	public void setListaCiclistas(ArrayList<Ciclista> listaCiclistas) {
		this.listaCiclistas = listaCiclistas;
	}
	
	/*public void ponerPosicion() {
		for (int i=0; i<listaCiclistas.size(); i++) {
			listaCiclistas.get(i).setPosicionGeneral(i+1);
		}
	}*/
	
	
	
}
