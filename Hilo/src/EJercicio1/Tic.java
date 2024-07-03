package EJercicio1;

public class Tic extends Thread{

	String tic;
	Tic(String tic){
		this.tic=tic;
	}
	@Override
	public void run() {
		
	while(true) {
		try {
			System.out.println(this.tic);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
