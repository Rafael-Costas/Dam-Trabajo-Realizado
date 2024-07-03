package Ejercicio4_2;

import java.util.ArrayList;


import Ejercicio4_2.Local.tipo;

public class Test {

	public static void main(String[] args) {
		Casas_Rurales casaRurales = new Casas_Rurales(2, 1, "Calle 2", 4, 3, 12, 3, 4);
		Cerrado casaCerradas = new Cerrado(3, 1, "Calle 3", 5, 3, 7, 1, 3, true);
		CasaIndependiente casaIndependiente = new CasaIndependiente(4, 1, "Calle 4", 2, 32, 54);
		ApartamentoFamiliar apartFamiliar = new ApartamentoFamiliar(5, 1, "Calle 5", 43, 23, 32);
		localComercial loComercial= new localComercial(6, 1, "Calle 6", 3, tipo.INTERNO, "Alcampo");
		Oficina ofc= new Oficina(7, 1, "Calle 7", 32, true, tipo.CALLE);
		
		ArrayList<Inmuebles> arr = new ArrayList<>();
	
		arr.add(casaRurales);
		arr.add(casaCerradas);
		arr.add(casaIndependiente);
		arr.add(apartFamiliar);
		arr.add(loComercial);
		arr.add(ofc);
		
		for (Inmuebles inmuebles : arr) {
			System.out.println(inmuebles);
			System.out.println(inmuebles.calculaPrecio(0) );
		}
		
	}
}
