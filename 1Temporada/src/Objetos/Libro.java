package Objetos;

public class Libro {

	int paginas;
	int capitulos;
	Autor autor;
	String Titulo;
	int Marcapagina;
	
	Libro(){
		
	}
	Libro(int Paginas, int Capitulos, Autor Autor, String titulo){
		this.paginas=Paginas;
		this.capitulos=Capitulos;
		this.autor=Autor;
		this.Titulo=titulo;
		
	}
	public void leer() {
		System.out.println("Muy bien estas haciendo algo por alguna vez");
	}
	public void Restante(int leido) {
		int restante=this.paginas-leido;
		if(restante>0) {
			System.out.println("Te queda por leer "+restante);
		}else {
			System.out.println("Ale aparcado");
		}
	
	}
	public void MarcaPaginas(int pagina) {
		this.Marcapagina=pagina;
		System.out.println("Te has quedado en la pagina"+ this.Marcapagina);
	}
	
}
