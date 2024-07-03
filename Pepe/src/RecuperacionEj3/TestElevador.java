package RecuperacionEj3;


public class TestElevador {
	public static void main(String[] args) {
		Elevador elevador= new Elevador();
		for(int i=0; i<20; i++) {
			 Paquetes c= new Paquetes("Paquete numero "+i, elevador);
		}
	}
}
