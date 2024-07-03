package ProdCons;

public class Productor extends Thread{

	private Cola cola;
	private int n;
	public Productor (Cola c, int n) {
		cola = c; 
		this.n=n;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			cola.put(i);
			System.out.println(i+"=> PRoducto : = "+n+", produce: "+i);
		try {
			sleep(200);
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}
