package PingPong;


public class TestCola {
public static void main(String[] args) {
	Cola cola = new Cola();
	Productor p = new Productor(cola, 7);
	Consumidor c = new Consumidor(cola, -55);
	c.start();
	p.start();
}
}
