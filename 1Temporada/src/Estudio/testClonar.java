package Estudio;

public class testClonar {
public static void main(String[] args) throws CloneNotSupportedException {
	

	rectangulo r1= new rectangulo(5, 7,"Banana");
	rectangulo r2 = (rectangulo) r1.clone();
	System.out.println(r2.getNombre());
	r2.incrementaAncho();
	r2.incrementaAncho();
	r2.incrementaAncho();
	r2.setName("Alpharius");
	System.out.println("SOn el mismo???");
	System.out.println(r2.equals(r1));
	rectangulo r3 = new rectangulo(r2);
	
	System.out.println(r3.toString());
	System.out.println(r2.toString());
	System.out.println("Son el mismo???");

	if(r2.equals(r3)) {
		System.out.println("nadie es alpahrius");
	}else {
		System.out.println("Yo soy alpharius");
	}
	
	
	}
}