package Juego1;

public class TestTIrada {

	public static void main(String[] args) {
		Tirada uno = new Tirada("george");
		Tirada dos = new Tirada("airoman");
		uno.start();
		dos.start();
		
		try {
			uno.join();
			dos.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		
	}
}
