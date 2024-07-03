package Ejercicio2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class test {

	public static void main(String[] args) {
		Jugador Cristiano = new Jugador();
		Jugador Messi = new Jugador("Messi", "Algo", 7, 3, 2, 1);
		Portero Casilla = new Portero();
		Portero Mortadelo = new Portero("Mortadelo", "cerca", 6, 2, 1, 7, 0, 9);
		Portero Filemon = new Portero("Filemon", "Lejos", 1, 2, 3, 4, 2, 1);
		ArrayList<Jugador> abc = null;
		abc.add(Filemon);
		abc.add(Cristiano);
		abc.add(Messi);
		abc.add(Filemon);
		abc.add(Mortadelo);
		abc.add(Casilla);
		
		Cristiano.imprimir();
		Messi.imprimir();
		Casilla.imprimir();
		Mortadelo.imprimir();
		Filemon.imprimir();
	}
}
