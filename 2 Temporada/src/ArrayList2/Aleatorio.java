package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Aleatorio {
public static int GeneraValor() {
	
	Random r = new Random();
	return r.nextInt(0, 101);
	
}

public static int generaTamaño() {
	Random r = new Random();
	return r.nextInt(10,21);
}

	public static void main(String[] args) {
		ArrayList<Integer> Arr = new ArrayList<>();
	
		for(int i=0; i<generaTamaño(); i++) {
			Arr.add(GeneraValor());
		}
		System.out.println(Arr.size());
		int suma=0;
		for(Integer n : Arr){
			suma+=n;
		}
	System.out.println("La suma es: "+suma);
	System.out.println("La media es  "+(double)suma/Arr.size());
	System.out.println("El maximos es " +Collections.max(Arr));
	System.out.println("El minimo es "+Collections.min(Arr));
	
	int min=100;
	int max=0;
	for (Integer n : Arr) {
		if(n>max)max=n;
		if(n<min)min=n;
	}
	System.out.println("El numero maximo es " +max);
	System.out.println("El numero minimo es " +min);
	Collections.sort(Arr);
	System.out.println(Arr);
	
	}
}
