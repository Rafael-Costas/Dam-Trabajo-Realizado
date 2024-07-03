package Objetos;

public class Persona {
private String nombre;
private int edad ;
private String dni;
private double peso;
private double altura;
private char sexo;

public Persona(){
	this.nombre="";
	this.edad=0;
	this.peso=0;
	this.altura=0;
	this.sexo='H';
}
public Persona(String nombre, int edad, char sexo) {
this.nombre=nombre;
this.edad=edad;
this.sexo=sexo;
this.altura=0;
this.peso=0;
}
public Persona(String nombre, int edad, char sexo, double altura, double peseo) {
this.nombre=nombre;
this.edad=edad;
this.sexo=sexo;
this.altura=altura;
this.peso=peseo;

}
public void CalcularIMC() {
	
}


}
