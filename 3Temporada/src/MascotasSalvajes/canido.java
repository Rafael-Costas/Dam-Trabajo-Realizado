package MascotasSalvajes;

public abstract class canido extends Animal{

	@Override
	abstract protected String getNombreCientifico() ;

	public void SoyUnCanido() {
		System.out.println("Soy un canido");
	}
}
