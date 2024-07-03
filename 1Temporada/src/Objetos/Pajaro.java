package Objetos;

public class Pajaro {

	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad
	// *** métodos de la clase ****

	public void setedad(int e) {
		
		edad = e;
	}

	public void printedad() {
		System.out.println(edad);
	}

	public void setColor(char color) {
		this.color = color;
	}
	public Pajaro(int num, char a){
		this.color=a;
		if(num >=0) {
		this.edad=num;}else {
			System.out.println("Lo fetos no cuentan como vida");
		}
	}
	
	

public void printcolor(){
	switch(color){
	//Los pájaros son verdes, amarillos, grises, negros o blancos
	//No existen pájaros de otros colores
	case 'v': System.out.println("verde");break;
	case 'a': System.out.println("amarillo");break;
	case 'g': System.out.println("gris");break;
	case 'n': System.out.println("negro");break;
	case 'b': System.out.println("blanco");break;
	case 'z': System.out.println("Zaragoza");break;
	default: System.out.println("color no establecido");
	}}



public char getColor() {
	return color;
}



public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public String toString() {
	return "Pajaro [color=" + color + ", edad=" + edad + "]";
}



}