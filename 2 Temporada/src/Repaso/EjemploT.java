package Repaso;

import java.util.StringTokenizer;

public class EjemploT {

	
	public static void main(String[] args) {
		StringTokenizer str;
		str = new StringTokenizer("UNO DOS TRES PERICO Y_ANDRES");
		System.out.println("la cadena str tiene "+str.countTokens()+" Elementos");
		while(str.hasMoreTokens())System.out.println(str.nextToken());
	}
}
