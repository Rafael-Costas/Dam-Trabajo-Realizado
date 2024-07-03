package MascotasSalvajes;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		Leon simba = new Leon("Simba", null, null, null);
		Gato jose = new Gato("Jose", null, null, null);
		Perro Eduardo = new Perro("Eduardo", null, null, null);
		Lobo Poncho = new Lobo("Poncho", null, null, null);
		ArrayList<Animal> Arr = new ArrayList<>();
		Arr.add(simba);
		Arr.add(jose);
		Arr.add(Eduardo);
		Arr.add(Poncho);
		
		for (Animal animal : Arr) {
			System.out.print(animal.getNombre()+", ");
			System.out.print(animal.getSonido()+", ");
			System.out.print(animal.getHabitat()+", ");
			System.out.print(animal.getAlimentos());
			if(animal instanceof Gato)
			((Felino) animal).SoyUnFelino();
			
			if(animal instanceof canido)
				((canido) animal).SoyUnCanido();
			
		}
	}
}
