package Materia;

import java.awt.Color;

public class testfigura {

	public static void main(String[] args) {
	int [] arr = {1,2};
	int[] arr2 =new int [2];
	
		Figura uno = new Figura(Color.red);
		Figura dos = new Figura(Color.gray, arr);
		Figura tres = new Figura(Color.black);
		System.out.println(uno);
		System.out.println(dos);
		System.out.println(tres);
	}
}
