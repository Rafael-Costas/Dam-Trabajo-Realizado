package Ejercicio4;

import java.util.ArrayList;

import Ejercicio4.Local.tipo2;

public class test {

	public static void main(String[] args) {
		// Me falta una clase lacual borre sin querer a la hora de hacer este paquete
		AparteamentoEstudio estudio = new AparteamentoEstudio(21, 1, "lejos", 1, 1);
		Casa_Rurales casaRurales = new Casa_Rurales(2, 1, "Calle 2", 4, 3, 12, 3, 4);
		Cerrado casaCerradas = new Cerrado(3, 1, "Calle 3", 5, 3, 7, 1, 3, true);
		CasaIndependiente casaIndependiente = new CasaIndependiente(4, 1, "Calle 4", 2, 32, 54);
		ApartamentoFamiliar apartFamiliar = new ApartamentoFamiliar(5, 1, "Calle 5", 43, 23, 32);
		localComercial loComercial = new localComercial(6, 1, "Calle 6", 3, tipo2.INTERNO, "Alcampo");
		Oficina ofc = new Oficina(7, 1, "Calle 7", 32, true, tipo2.CALLE);

		ArrayList<Inmuebles> arr = new ArrayList<>();

		arr.add(casaRurales);
		arr.add(casaCerradas);
		arr.add(casaIndependiente);
		arr.add(apartFamiliar);
		arr.add(loComercial);
		arr.add(ofc);

		/*
		 * Se pide 1/ crear una lista de al menos un objeto de estas siete clases
		 * citadas en la tabla mostrando sus características y el precio de venta de
		 * cada una
		 */
		for (Inmuebles inmuebles : arr) {
			System.out.println(inmuebles);
			System.out.println(inmuebles.calculaPrecio(2));
		}
		// 2/ Muestre el total del valor de los inmuebles vendidos.
		double total = 0;
		for (Inmuebles inmuebles : arr) {
			total += inmuebles.calculaPrecio(1);
		}
		System.out.println("LA suma total es de " + total);

		/*
		 * 3/ Muestre el promedio del valor por metro cuadrado del total de inmuebles
		 * vendidos
		 */
		total = 0;
		for (Inmuebles inmuebles : arr) {
			total += inmuebles.calculaPrecio(1);
		}
		total = total / arr.size();
		System.out.println("El promedio total es de " + total);
		System.out.println("");
		/*5/ En la lista del testeo se mostrará el impuesto de cada uno de los
		inmuebles vendidos
		*/
		System.out.println("Valor con impuestos");
		total=0;
		for (Inmuebles inmuebles : arr) {
			System.out.println(inmuebles.toString());
			System.out.println(inmuebles.calcularImpuestos());
		}
		System.out.println("");

		//6/ Se mostrará el total de dinero a pagar por los impuestos
		total=0;
		for(Inmuebles inmuebles :arr){
			total+=inmuebles.calcularImpuestos();
		}
		System.out.println("El total del precio con impuestos es "+ total);
	}
}
