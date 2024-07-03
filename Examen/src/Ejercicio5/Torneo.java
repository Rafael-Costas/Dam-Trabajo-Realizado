package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

public class Torneo {
	private int posicion=0;
	private String nombre;
	protected String pais;
	private ArrayList<Equipo> ListarEquipo;
	private ArrayList<Ciclista> clasificacion;
	
	public Torneo (String nombre, String pais) {
		this.nombre=nombre;
		this.pais=pais;
		this.ListarEquipo=new ArrayList<>();
		this.clasificacion= new ArrayList<>();
	}
	
	
	//clasf equipos
	public void clasificaionPorEquipos() {
		
	}
	
	public void listarEquipos() {
		for (Equipo equ : ListarEquipo) {
			System.out.println(equ.toString());
		}
	}
	public void añadirEquipos(Equipo equipo) {
		this.ListarEquipo.add(equipo);
	}
	
	public void ordernarPosiciones() {
		Collections.sort(ListarEquipo, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo p1, Equipo p2) {
                return p1.calcularTotalTiempo() - p2.calcularTotalTiempo();
            }
        });
		ListIterator<Equipo> itr = ListarEquipo.listIterator();
		while(itr.hasNext()) {
			itr.next().setPosicion (itr.nextIndex());  
		}
	}
	public void buscarEquipo() {
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce el nombre del Equipo");
		String nom= src.next();
		boolean algo = true;
		
		
		for (Equipo equipo : ListarEquipo) {
			if(nom.equals(equipo.getNombre())) {
				equipo.toString();
				algo=false;
			}	
		}
		if(algo) {
			System.out.println("No existe");
		}
	}
	//clasf ciclistas

	public void clasfCiclista() {
		for (Equipo equipo : ListarEquipo) {
			for(int i=0; i<equipo.getListaCiclistas().size(); i++)
			clasificacion.add( equipo.getListaCiclistas().get(i));
		}
		Collections.sort(clasificacion, new Comparator<Ciclista>() {
            @Override
            public int compare(Ciclista p1, Ciclista p2) {
                return (int) (p1.getTiempoAcumulado() - p2.getTiempoAcumulado());
            }
        });
		ListIterator<Ciclista> itr = clasificacion.listIterator();
		while(itr.hasNext()) {
			itr.next().setPosicionGeneral(itr.nextIndex());
		}
	}


	@Override
	public String toString() {
		return "Torneo [posicion=" + posicion + ", nombre=" + nombre + ", pais=" + pais + ", ListarEquipo="
				+ ListarEquipo + ", clasificacion=" + clasificacion + "]";
	}
	
	public void imprimirClasificacion() {
		ListIterator<Ciclista> iter= clasificacion.listIterator();
		System.out.println(iter.toString());
	}
	
	
	
}
