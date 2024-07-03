package EjerciciosParaEntretenerme;

public class Entero {
/*	Constructor por defecto que inicializa a 0 el número interno.
	Constructor que inicializa el número interno.
	Método aniade que permite sumarle un número al valor interno.
	Método resta que resta un número al valor interno.
	Método getValor. Devuelve el valor interno.
	Método getDoble. Devuelve el doble del valor interno.
	Método getTriple. Devuelve el triple del valor interno.
	Método setNumero. Inicializa de nuevo el valor interno.*/
	
	
	//Genero LA VARIABLE
	int num;
	
	//Dos contructores, unos con el dato default y el otro el cual te pide un dato
	Entero(){
		this.num=0;
	}
	Entero(int numero){
		num=numero;
	}
	
	//Dos metodos, uno sumara y el otro restara 
	public void suma(int numero) {
		this.num+=numero;
	}
	public void resta(int numero) {
		this.num-=numero;
	}
	
	//Muestra el valor del objeto el cual le pides 
	public int getValor() {
		return this.num;
	}
	
	//Dos metodos los cuales te muestra uno el doble y otro el triple
	public void getDoble() {
		System.out.println("El doble es "+this.num*2);
	}
	public void getTriple() {
		System.out.println("El Triple es "+this.num*3);
	}
	
	//Cambia el numero por otro
	public void setNumero(int numero) {
		this.num=numero;
	}
	
	//Muestra la variable del objeto
	@Override
	public String toString() {
		return "Entero [num=" + num + "]";
	}
	
	
}
