package Algo;

public class Pajaro {

	public void setEdad(int e) {
		edad=e;
	}
	public void printEdad() {
		System.out.println(edad);
	}
	public void setcolor(char c) {
		color=c;
	}
	private char color;
	private int edad;
	public void volar() {
		System.out.println("y volo");
		
	}
	public void cantar() {
		System.out.println("PIPIPIPIPIPI");
	}
	@Override
	public String toString() {
		return "Pajaro [color=" + color + ", edad=" + edad + "]";
	}
	
}
