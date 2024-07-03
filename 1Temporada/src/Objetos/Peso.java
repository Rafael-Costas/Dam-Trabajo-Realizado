package Objetos;

public class Peso {


	double valor; //valor del peso en kg
	

	
	public  double getValor(double v, String medida) {
		
		double aux=0;
		switch(medida) {
			case "Libra":
				//convertir valor a libras y guardarlo en aux
				aux= v/0.453;
				break;
			case "Lingote":
				//convertir valor a lingotes y guardarlo en aux
				aux= v/14.59;
				break;
			case "Onza":
				//convertir valor a onzas y guardarlo en aux
				aux= v/0.02835;
				break;
			case "Penique":
				//convertir valor a peniques y guardarlo en aux
				aux=v/0.00155;
				break;
			case "Kilo" :
				//SOLO DEVOLVEMOS EL VALOR PUES YA ESTA EN KILOS
				 aux=v;
				break;
			case "Gramo":
				//MULTIPLICO POR MIL PARA CONVERTIR A GRAMOS y lo GUAROD en aux
				 aux=v/0.001;
				break;
			case "Quintal":
				//convertir valor a quintales y guardarlo en aux
				aux=v/43.3;
				break;
			default:
				System.out.println("NO EXISTE ESA UNIDAD DE MEDIDA");
				}
			return aux;
			}
	Peso(double v, String medida){
		
		this.valor= ( getValor(v, medida));
		
	}
	

	
	@Override
	public String toString() {
		return "Peso [valor=" + valor + "]";
	}
	
	
}