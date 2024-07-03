package EstudioAnimales;

public class Lobo extends Cánido {
	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombreCientifico;
@Override
public String getNombreCientifico() {
	// TODO Auto-generated method stub
	return "Lobotus";
}

@Override
public String getHabitat() {
	// TODO Auto-generated method stub
	return "Bosque";
}
@Override
public String getAlimentos() {
	// TODO Auto-generated method stub
	return "Tu carne";
}
@Override
public String getSonido() {
	// TODO Auto-generated method stub
	return "Auuuuuuuuuu";
}

public Lobo() {
	// TODO Auto-generated constructor stub
}
}
