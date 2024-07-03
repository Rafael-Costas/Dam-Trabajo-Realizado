package MascotasSalvajes;

public class Leon extends Felino{

	@Override
	protected String getNombreCientifico() {
		// TODO Auto-generated method stub
		return "Panthera leo";
	}
	
	Leon(String nom, String hab, String ali, String sonido){
		this.alimentos = ali;
		this.nombre = nom;
		this.habitat = hab;
		this.sonido = sonido;
	}

	@Override
	public String getSonido() {
		// TODO Auto-generated method stub
		return "Rugido";
	}
	
	@Override
	public String getAlimentos() {
		// TODO Auto-generated method stub
		return "Carnivoro";
	}
	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return "Sabana";
	}
}
