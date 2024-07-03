package MascotasSalvajes;

public class Lobo extends canido {

	@Override
	protected String getNombreCientifico() {
		// TODO Auto-generated method stub
		return "Canis lupus";
	}

	Lobo(String nom, String hab, String ali, String sonido){
		this.alimentos = ali;
		this.nombre = nom;
		this.habitat = hab;
		this.sonido = sonido;
	}
	@Override
	public String getSonido() {
		// TODO Auto-generated method stub
		return "Ladrido";
	}
	
	@Override
	public String getAlimentos() {
		// TODO Auto-generated method stub
		return "Carnivoro";
	}
	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return "Bosque";
	}
}
