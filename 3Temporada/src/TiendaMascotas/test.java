package TiendaMascotas;

import java.util.ArrayList;

import TiendaMascotas.GatoPeloCorto.gpc;
import TiendaMascotas.GatoSinPelo.gsl;

import TiendaMascotas.GatosPeloLargo.gpl;
import TiendaMascotas.PerroGrande.raz;
import TiendaMascotas.PerroMediano.raza;
import TiendaMascotas.PerroPequeño.PP;

public class test {
	public static void main(String[] args) {
		GatosPeloLargo andres = new GatosPeloLargo("andres", 0, "marron", gpl.Angora);
		GatoSinPelo misu = new GatoSinPelo("Misu", 3, "Blanco",gsl.elfo);
		GatoPeloCorto coco = new GatoPeloCorto("Coco", 5, "Naranja", gpc.Británico);
		PerroGrande odin = new PerroGrande("Odin", 3, "Negro", raz.Doberman);
		PerroMediano mel = new PerroMediano("Mel", 2, "Negro", raza.Galgo);
		PerroPequeño  nana = new PerroPequeño("nana", 6, "Negro", PP.chihuahua);
		Perro dogo = new Perro("Jose", 2, "Multi");
		Gato gato = new Gato("andrew", 2, "Multi");
		Mascota ser = new Mascota("Federeico", 4, "a");
		
		ArrayList<Mascota> Arr = new  ArrayList<Mascota>();
		Arr.add(mel);
		Arr.add(andres);
		Arr.add(misu);
		Arr.add(coco);
		Arr.add(odin);
		Arr.add(nana);
		Arr.add(dogo);
		Arr.add(gato);
		Arr.add(ser);
		
		
		for (Mascota mascota : Arr) {
			System.out.println(mascota);
			mascota.sonido();
		}
	}
}
