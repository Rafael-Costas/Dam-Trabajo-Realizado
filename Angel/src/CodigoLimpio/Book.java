package CodigoLimpio;

import java.sql.Date;
import java.util.Arrays;


public class Book {
	String ISBN;
	String title;
	String[] autores;
	String editorial;
	Edition[] editions; 
	
	public Book(String ISBN) {
		this.ISBN=ISBN;
	}
	
	int countAuthors() {
		return autores.length;
	}
	void addNewEdition(Edition a) {
		Edition[] newArray = Arrays.copyOf(editions, editions.length+1);
		newArray[editions.length] = a;
		editions = newArray;
		
		
	}
}

class Edition{
	int id;
	String name;
	Date data;
	
	public Edition(String name, Date data, int id) {
		this.name = name;
		this.data = data;
		this.id = id;
		
		
		
		
	}
	
}


