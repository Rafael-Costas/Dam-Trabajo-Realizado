package Objetos;

public class testPajaro {
public static void main(String[] args) {
	
	int años=0;
	Pajaro Loro= new Pajaro(-2, 'z');
	

	Loro.printedad();
	Loro.printcolor();
	Loro.setColor('v');
	System.out.println(Loro.getColor());
	años=Loro.getEdad();
	System.out.println(Loro.toString());
	
}}
