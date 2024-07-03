package Banco;

public class SacarDinero extends Thread{

	private Cuenta c;
	String nom;
	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c=c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<=4; i++) {
			c.retirarDinero(i, this.getName());
		}
	}
}
