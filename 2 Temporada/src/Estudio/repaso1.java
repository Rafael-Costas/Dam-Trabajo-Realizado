package Estudio;

import java.util.Arrays;
import java.util.Random;

public class repaso1 {
public static void burbuja(int [] Arr) {
		
		int aux;  
		for(int i=Arr.length; i>0; i--) {
			for(int j=0; j<i-1;j++) {
				if(Arr[j]>Arr[j+1]) {
					aux =Arr[j+1];
					Arr[j+1]=Arr[j];
					Arr[j]=aux;
				}
			}
		}
	}
	
	public static int Random() {
		Random  r= new Random();
		
		return r.nextInt(-51, 51);
	}
	public static void main(String[] args) {
		Random r = new Random();
		
		int [] Arr = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		for(int i=0; i<Arr.length; i++) {
			Arr[i]= Random(); 
		}
		for(int i=0; i<Arr.length; i++) {
			cuadrado[i]= (int) Math.pow(Arr[i], 2); 
			cubo[i]= (int) Math.pow(Arr[i], 3); 
		}
		burbuja(Arr);
		burbuja(cuadrado);
		burbuja(cubo);
	
	for(int i=0; i<Arr.length; i++) {
		System.out.println(Arr[i]+ " - " + cuadrado[i]+" - "+ cubo[i]);
	}
		
	}
}
