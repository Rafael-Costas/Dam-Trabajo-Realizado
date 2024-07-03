package Monedas;



	public class Moneda {

	String[] Vlado= {"cara","cruz"};
	String[] Vvalor= {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos",
	"20 céntimos", "50 céntimos", "1 euro" , "2 euros" };

	String valor;
	String lado;

	Moneda(String v,String l){
	this.valor=v;
	this.lado=l;
	}

	Moneda(){
	this.valor=generaValor();
	this.lado=generaLado();
	}

	public String generaLado() {

	int valor=(int) Math.random()*2;
	System.out.println(valor);
	return Vlado[valor];

	}

	public String generaValor() {
	int valor= (int) (Math.random()*8);
	System.out.println(valor);
	if(valor<1)
	return Vvalor[valor];
	return lado;

	}

	/**
	* @return the valor
	*/
	public String getValor() {
	return valor;
	}

	/**
	* @return the lado
	*/
	public String getLado() {
	return lado;
	}




	}