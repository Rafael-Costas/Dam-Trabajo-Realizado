package EstudioAnimales;

public abstract class  Animal {
protected String sonido;
protected String alimentos;
protected String habitat;
protected String nombreCientifico;
public String getSonido() {
	return sonido;
}
public void setSonido(String sonido) {
	this.sonido = sonido;
}
public String getAlimentos() {
	return alimentos;
}
public void setAlimentos(String alimentos) {
	this.alimentos = alimentos;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public String getNombreCientifico() {
	return nombreCientifico;
}
public void setNombreCientifico(String nombreCientifico) {
	this.nombreCientifico = nombreCientifico;
}



}
