package Contador;

public class HiloInc extends Thread {

		private Contador contador;
		public HiloInc(String n, Contador c) {
			setName(n);
			contador=c;
		}
	public void run() {
		for(int j=0; j<300; j++) {
			synchronized (contador) {
				
			
			contador.incrementa();
			System.out.println(getName()+" contador vale" + contador.getValor());
			try {
				sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		}
		}
}
