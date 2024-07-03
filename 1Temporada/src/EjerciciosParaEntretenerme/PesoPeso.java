package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class PesoPeso {

	static double valor;
	static String transformacion;
	public double getLibras() {
		double l=0;
		l=this.valor*2.20462;
		return l;
	}
	public double getLingotes() {
		double l=0;
		l=this.valor/14.59;
		return l;
	}
	
	PesoPeso(double peso, String conversion){
		this.valor=peso;
		this.transformacion=conversion;
	}
	public double getPeso(String a) {
	double b=0;
		switch (a) {
		case "Lb": 
			System.out.println(valor+"estos kilos son "+getLibras()+" libras");
			b=getLibras();
			break;
		case "Li":
			System.out.println(valor+"estos kilos son "+valor/14.59+ " lingotes ");
			b=valor/14.59;
			break;
			
		case "Oz":
			System.out.println(valor+"estos kilos son "+getLibras()*16+" onzas");
			b=getLibras()*16;
			break;
		case "P":
			System.out.println(valor+"estos kilos son "+(getLibras()*16)/0.05+" Peniques");
			b=getLibras()*16/0.05;
			break;
		case "G":
			System.out.println(valor+"estos kilos son "+valor*1000+" Gramos");
		b=valor*1000;
			break;
		case "Q":
			System.out.println(valor+"estos kilos son "+getLibras()*100+" Quintales" );
		b=getLibras()*100;
			break;
		default:
			
			System.out.println("Idiota");
		break;
		
		
		}
		return b;	
	}
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("introduce los kilos");
		valor=src.nextDouble();
	}
}
