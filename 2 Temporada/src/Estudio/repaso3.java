package Estudio;

import java.util.Arrays;
import java.util.Random;

public class repaso3 {

	public static int Random() {
		Random  r= new Random();
		
		return r.nextInt(0, 100);
	}
	
	public static void main(String[] args) {
	
		int [] Arr = new int [20];
		int im=0;
		int pa=0;
		for(int i=0; i<Arr.length; i++) {
			Arr[i]=Random();
			if(Arr[i]%2==0)
				pa++;
			else
				im++;
		}
		int [] par= new int [pa];
		int [] impar= new int [im];
		pa=0;
		im=0;
		for(int i=0; i<Arr.length; i++) {
			
			if(Arr[i]%2==0) {
				par[pa]=Arr[i];
				pa++;
			}
			else {
			impar[im]=Arr[i];
				im++;
			}
			}
		System.out.println(Arrays.toString(Arr));
		System.out.println(Arrays.toString(par));
		System.out.println(Arrays.toString(impar));
		System.out.println("  ");
		
		int cont=0;
			for(int z=0; z<par.length; z++) {
				Arr[cont]=par[z];
				cont++;
			}
			
			for(int z=0; z<impar.length; z++) {
				Arr[cont]=impar[z];
				cont++;
			}
			System.out.println("Ahora solucionado");
			System.out.println(Arrays.toString(Arr));
			System.out.println(Arrays.toString(par));
			System.out.println(Arrays.toString(impar));
		
	}
}
