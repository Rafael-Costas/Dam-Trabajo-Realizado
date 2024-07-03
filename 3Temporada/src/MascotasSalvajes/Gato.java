package MascotasSalvajes;

public class Gato extends Felino{

	
	Gato(String nom, String hab, String ali, String sonido){
		this.alimentos = ali;
		this.nombre = nom;
		this.habitat = hab;
		this.sonido = sonido;
	}
	
	@Override
	public String getSonido() {
		// TODO Auto-generated method stub
		return "MIAU";
	}
	
	@Override
	public String getAlimentos() {
		// TODO Auto-generated method stub
		return "Ratones";
	}
	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return "Doméstico";
	}

	@Override
	protected String getNombreCientifico() {
		// TODO Auto-generated method stub
		return "Gatito";
	}
	
	

}
