package Objetos;

import java.util.Scanner;

public class Israili {
private double papas;
private double chocos;

Israili(double p, double c){
	this.chocos=c;
	this.papas=p;
}

public  void addChocos(int c) {
	chocos+=c;
}
public  void addPapas(int p) {
	papas+=p;
}

public void showChocos() {
	System.out.println("Te quedan "+this.chocos);
}
public void showPapas() {
	System.out.println("Te quedan "+this.papas);
}

@Override
public String toString() {
	return "Israili [papas=" + papas + ", chocos=" + chocos + "]";
}

public  double gastos() {
	int personas=0;

	do {
		if(papas>=1 && chocos>=0.5) {
			papas-=1;
			chocos-=0.5;
			
			personas+=3;
			
		}
	}while(papas>=1 && chocos>=0.5);
	return personas;
	
}


public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	System.out.println("Cuantos papas hay");
	double p= src.nextDouble();
	System.out.println("Cuantos chocos hay");
	double c = src.nextDouble();
	
	Israili a= new Israili(p,c);
	
	a.showChocos();
	a.showPapas();
	System.out.println("Han comido "+a.gastos()+" personas");
	System.out.println(a.toString());
}
}
