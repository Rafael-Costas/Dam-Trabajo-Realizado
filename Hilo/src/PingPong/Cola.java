package PingPong;

public class Cola extends Thread {


private int numero;
private boolean disponible = false;
// inicialmente cola vacia

public synchronized int get() {
	while(disponible==false) {
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
		 System.out.println("Ping");
	}
	
	

		disponible=false;
		notifyAll();
	return numero;
}

public synchronized void put(int valor) {
     while(disponible==true) {
    	 try {
    		 wait();
    	 }catch(InterruptedException e) {}
     
     }
   System.out.println("Pong");
   
     numero=valor;
     disponible=true;
     notifyAll();
}

@Override
public String toString() {
	return "Cola [numero=" + numero + ", disponible=" + disponible + "]";
}

}