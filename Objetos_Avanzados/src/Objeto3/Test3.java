package Objeto3;

import java.util.ArrayList;

public class Test3 {
	public static ArrayList<SeleccionFutbol> Integrantes = new ArrayList<SeleccionFutbol>();
	public static void main(String[] args) {
		
	
	
	Entrenador cholo = new Entrenador(7, "Diego", "Simeone", 50, "284EZ89");
	Futbolista grisman = new Futbolista(2, "Toño", "Grizman", 28, 12, "interior derecho");
	Masajista manolo= new Masajista(56, "Manuel", "Bombo", 44, "LIcenciado en Sonido", 28);
	Integrantes.add(cholo);
	Integrantes.add(grisman);
	Integrantes.add(manolo);
	for (SeleccionFutbol sf : Integrantes) {
		System.out.println(sf);
	}
	//buvle donde cada objeto llame solo a sus metodos especificos
	
	for (SeleccionFutbol sf : Integrantes) {
	System.out.println(	sf.toString());
		if(sf instanceof Entrenador){
			((Entrenador) sf).dirigirPartido();
			((Entrenador) sf).dirigirEntrenamiento();
		}
		if(sf instanceof Futbolista){
		((Futbolista) sf).jugarPartido();
		((Futbolista) sf).entrenar();
		}
		if(sf instanceof Masajista){
			((Masajista) sf).darMasaje();
		}}
		
}
}