package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	



	public static void main(String[] args) {
		/*
		 * Ingrese un texto de al menos 8 palabras e indique qué tres letras han
		 * aparecido en el texto más veces, indicando las mismas
		 */
		
		
		/*
		 * te adelanto de que esta MUY MAL a si que miralo por arriba
		 */
		
		int q=0;
		int w=0;
		int e=0;
		int r=0;
		int t=0;
		int y=0;
		int u=0;
		int i=0;
		int o=0;
		int p=0;
		int ñ=0;
		int l=0;
		int k=0;
		int j=0;
		int h=0;
		int g=0;
		int f=0;
		int d=0;
		int s=0;
		int a=0;
		int z=0;
		int x=0;
		int c=0;
		int v=0;
		int b=0;
		int m=0;
		int n=0;
	Scanner src = new Scanner(System.in);
	System.out.println("Introduce una frase de al menos 8 palabras");
	String frase = src.nextLine();
	System.out.println(frase.split(" ").length);
	
	if(frase.split(" ").length<8) {
		do {
			System.out.println("tienen que ser como minimo 8 palabras");
			frase += " "+src.nextLine();
		}while(frase.split(" ").length<8);
	
}



	String [] Arr = frase.split(" ");
	for(int ia=0; ia<Arr.length; ia++) {
		for(int za=0; za<Arr[ia].length(); za++){
			if(Arr[ia].charAt(za)=='q') {
				q++;
			}
			if(Arr[ia].charAt(za)=='w') {
				w++;
			}
			if(Arr[ia].charAt(za)=='e') {
				e++;
			}
			if(Arr[ia].charAt(za)=='r') {
				r++;
			}
			if(Arr[ia].charAt(za)=='t') {
				t++;
			}
			if(Arr[ia].charAt(za)=='y') {
				y++;
			}
			if(Arr[ia].charAt(za)=='u') {
				u++;
			}
			
			if(Arr[ia].charAt(za)=='i') {
				i++;
			}
			if(Arr[ia].charAt(za)=='o') {
				o++;
			}
			if(Arr[ia].charAt(za)=='p') {
				p++;
			}
			if(Arr[ia].charAt(za)=='a') {
				a++;
			}
			if(Arr[ia].charAt(za)=='s') {
				s++;
			}
			if(Arr[ia].charAt(za)=='d') {
				d++;
			}
			if(Arr[ia].charAt(za)=='f') {
				f++;
			}
			if(Arr[ia].charAt(za)=='g') {
				g++;
			}
			if(Arr[ia].charAt(za)=='h') {
				h++;
			}
			if(Arr[ia].charAt(za)=='j') {
				j++;
			}
			if(Arr[ia].charAt(za)=='k') {
				k++;
			}
			if(Arr[ia].charAt(za)=='l') {
				l++;
			}
			if(Arr[ia].charAt(za)=='ñ') {
				ñ++;
			}
			if(Arr[ia].charAt(za)=='z') {
				z++;
			}
			if(Arr[ia].charAt(za)=='x') {
				x++;
			}
			if(Arr[ia].charAt(za)=='c') {
				c++;
			}
			if(Arr[ia].charAt(za)=='v') {
				v++;
			}
			if(Arr[ia].charAt(za)=='b') {
				b++;
			}
			if(Arr[ia].charAt(za)=='n') {
				n++;
			}
			if(Arr[ia].charAt(za)=='m') {
				m++;
			}
		}
	}
	
	int [] res= {q,w,e,r,t,y,u,i,o,p,ñ,l,k,j,h,g,f,d,s,a,m,n,b,v,c,x,z} ;
	Arrays.sort(res);
	
	System.out.println("La tercera letra que más veces aparece es " +res[res.length-3]);
	System.out.println("La segunda letra que más veces aparece es " +res[res.length-2]);
	System.out.println("La primera letra que más veces aparece es " +res[res.length-1]);
	}
}
