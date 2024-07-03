package Contador;

public class ContadorTest {

	public static void main(String[] args) {
	Contador cont = new Contador(0);
	HiloDec dec= new HiloDec("HiloDec", cont);
	HiloInc inc = new HiloInc("HiloInc", cont);
	dec.start();
	inc.start();
	}
}
