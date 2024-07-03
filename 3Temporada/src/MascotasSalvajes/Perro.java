package MascotasSalvajes;

public class Perro extends canido{

	

	Perro(String nom, String hab, String ali, String sonido){
		this.alimentos = ali;
		this.nombre = nom;
		this.habitat = hab;
		this.sonido = sonido;
	}
	@Override
	protected String getNombreCientifico() {
		
		return "Canis lupus familiaris";
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
		return "Doméstico";
	}
}
