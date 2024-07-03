package Examen_24_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5B {

	public static void main(String[] args) {
		/*
		 * Programa que permita con un menú y usando una lista dinámica: a/ poblar la
		 * lista con la información de varias personas (como mínimo 5) b/ añadir una
		 * persona b/ Mostrar la información de todas las personas c/ ordenar la lista
		 * por apellido en orden alfabético d/ ordenar la lista por edad e/ eliminar una
		 * persona (introduciendo el dni) Use la clase auxiliar Persona.java
		 */
		ArrayList<Persona> Arr1= new  ArrayList<Persona>();
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce los siguientes numeros para realizar las siguientes tareas");
		System.out.println("1 para añadir a gente aleatorio");
		System.out.println("2 para añadir a alguien por tu cuenta");
		System.out.println("3 para mostrar la informacion ");
		System.out.println("4 para ordenar la lista por order alfabetico");
		System.out.println("5 ordenar la lista por edad");
		System.out.println("6 para elminar la persona");
		System.out.println("Introduce 0 para salir");
		int opc;
		do {
			 opc= src.nextInt();
			 switch (opc) {
			case 1: 
				System.out.println("Se añadirá gente aleatoria");
				Persona Jaimito = new Persona("5422121B",  "Gonzalez",  "Jaimito", "Masculino",  50,  32.3);
				Persona Jaimito2 = new Persona("321321c",  "Costas",  "Jose", "Masculino",  30,  33.3);
				Persona Jaimito3 = new Persona("5246352F",  "Alonso",  "Pepito", "masculino",  43,  66.3);
				Persona Jaimito4 = new Persona("3213112d",  "Perez",  "Juanito", "Mujer",  43,  72.3);
				Persona Jaimito5 = new Persona("3213213c",  "Jose",  "Ricardo", "Masculino",  32,  80.3);
				
				Arr1.add(Jaimito);
				Arr1.add(Jaimito2);
				Arr1.add(Jaimito3);
				Arr1.add(Jaimito4);
				Arr1.add(Jaimito5);
				
			break;
			
			case 2:
				System.out.println("Introduce los diferentes valores que te iremos pidiendo");
			 System.out.println("DNI");
			 String dni=src.next();
			 System.out.println("Apellido");
			 String apellido=src.next();
			 System.out.println("Nombre");
			 String nombre=src.next();
			 System.out.println("Genero");
			 String genero=src.next();
			 System.out.println("Edad");
			 int edad=src.nextInt();
			 System.out.println("Peso");
			 double peso =src.nextDouble();
			 
			 Persona Añadida = new Persona(dni, apellido, nombre, genero, edad, peso);
			 Arr1.add(Añadida);
			 System.out.println("Su persona a sido añadida");
			 break;
			
			
			case 3:
				System.out.println("te vamos a mostrar toda la informacion");
				for (Persona persona : Arr1) {
					System.out.println(persona);
				}
				break;
				
				
			case 4:
				System.out.println("Vamos a ordenar la lista for order alfabetico");
				

			 
break;			 
			case 6:
				System.out.println("introduce el dni");
				String DNI=src.next();
			
						for (Persona persona : Arr1) {
						
						}
					
				break;
			 }
			 
		}while(opc!=0);
	}
}
