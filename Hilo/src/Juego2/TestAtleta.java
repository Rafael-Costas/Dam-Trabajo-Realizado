package Juego2;

public class TestAtleta {

	public static void main(String[] args) {
		Atleta atleta; 
		for(int i=0; i<3; i++) {
			atleta= new Atleta(i+1, "i"+i, i, "ESPAÑA");
			//atleta.run();
			new Thread(atleta).start();
		}
	}
}
