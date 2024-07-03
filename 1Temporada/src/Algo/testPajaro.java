package Algo;

public class testPajaro {

	public static void main(String[] args) {
		Pajaro Checo = new Pajaro();
		Checo.setEdad(20);
		Checo.setcolor('r');
		Checo.cantar();
		Checo.volar();
		Checo.printEdad();
		System.out.println(Checo.toString());
		
	}
}
