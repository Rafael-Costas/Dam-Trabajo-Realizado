package EJercicio1;

public class Tac extends Thread{
String tac;
 	Tac(String tac){
 		this.tac=tac;
 	}
 	@Override
 		public void run() {
 			// TODO Auto-generated method stub
 		while(true) {
 			try {
 				System.out.println(this.tac);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			
 		}
 		}
}
