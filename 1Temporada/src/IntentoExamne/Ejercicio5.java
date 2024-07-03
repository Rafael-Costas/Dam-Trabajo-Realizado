package IntentoExamne;

public class Ejercicio5 {
	/*
	 * Ejercicio 5A Crea una clase llamada Contador que contenga un único atributo
	 * entero llamado cont. La clase tendrá los siguientes constructores:
	 * Constructor por defecto Constructor con parámetros para inicializar el
	 * contador con un valor no negativo. Si el valor inicial que se recibe es
	 * negativo el contador tomará el valor cero como valor inicial. Además de los
	 * métodos getter y setter, la clase contendrá los métodos: incrementar:
	 * incrementa el contador en una unidad. decrementar: decrementa el contador en
	 * una unidad. El contador nunca podrá tener un valor negativo. Si al
	 * decrementar se alcanza un valor negativo el contador toma el valor cero. Una
	 * vez creada la clase, escribe una clase TestContador para probar la clase.
	 * 
	 */
	int cont=0;
	public Ejercicio5() {
		
	}
	public Ejercicio5(int a) {
		if(a<0) {
			this.cont=0;
		}else {
			this.cont=a;
		}
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public void Aumentar() {
		this.cont++;
	}
	public void Disminuir() {
		if(this.cont>0) {
		this.cont--;
		}
		
		
		
	}
	public static void main(String[] args) {
		Ejercicio5 a = new Ejercicio5();
		Ejercicio5 B = new Ejercicio5(-4);
		Ejercicio5 c = new Ejercicio5(5);
		a.Aumentar();
		B.Disminuir();
	System.out.println(	a.getCont());
	System.out.println(	B.getCont());
		System.out.println(c.getCont());
	}
}
