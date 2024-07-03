package Objetos;

import java.util.Scanner;

public class Peso2 {

	double valor; //valor del peso en kg
	
	Peso2(double v, String medida){
	
		this.valor= (v / getValor(medida));
		
	}
	
	public double getValor(String medida) {
		
		double aux=0d;
		switch(medida) {
			case "Libra":
				//convertir valor a libras y guardarlo en aux
				aux= 0.453;
				break;
			case "Lingote":
				//convertir valor a lingotes y guardarlo en aux
				aux= 14.59;
				break;
			case "Onza":
				//convertir valor a onzas y guardarlo en aux
				aux= 0.02835;
				break;
			case "Penique":
				//convertir valor a peniques y guardarlo en aux
				aux=0.00155;
				break;
			case "Kilo" :
				//SOLO DEVOLVEMOS EL VALOR PUES YA ESTA EN KILOS
				 aux=1;
				break;
			case "Gramo":
				//MULTIPLICO POR MIL PARA CONVERTIR A GRAMOS y lo GUAROD en aux
				 aux=0.001;
				break;
			case "Quintal":
				//convertir valor a quintales y guardarlo en aux
				aux=43.3;
				break;
			default:
				System.out.println("NO EXISTE ESA UNIDAD DE MEDIDA");
				}
			return aux;
			}

	
	@Override
	public String toString() {
		return "Peso [valor=" + valor + "]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m;
		double v;
		int cont=1;

		while (cont==1) {
			System.out.println("valor??: ");
			v = sc.nextDouble();
			System.out.println("que unidad es???: ");
			m = sc.next();

			Peso2 dos = new Peso2(v, m);

			
			System.out.println(dos.toString() + " en kilos");
			System.out.println(dos.valor);
			System.out.println("Quieres Continuar?");
			System.out.println("1 para continuar, otro numero para parar");
			cont= sc.nextInt();
			
		}
	}
	
	
}