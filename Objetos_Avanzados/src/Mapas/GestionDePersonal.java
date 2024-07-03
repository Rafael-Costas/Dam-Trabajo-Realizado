package Mapas;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionDePersonal {
static HashMap<Integer, String> gp = new HashMap<Integer, String >();
	
public static void poblarmap() {
	
	gp.put(921, "Cindy Nero");
	gp.put(700, "César Vázquez");
	gp.put(219, "Víctor Tilla");
	gp.put(537, "Alan Brito");
	gp.put(605, "Esteban Quito ");
	gp.put(537, "Jose Luis");
}
	public static void main(String[] args) {
		
		
		System.out.println("Gestion de personal");
		Scanner src= new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("Seleciona una opcion");
		System.out.println("1 - listar");
		System.out.println("2 - añadir");
		System.out.println("3 - modificar");
		System.out.println("4 - borrar");
		System.out.println("5 - salir ");
		System.out.println("6 - poblar map");
		boolean salir=true;
		int opc=0;
		String nombre;
		int num;
		do {
		System.out.println("Escribe tu opcion");
		opc =Integer.parseInt(src.nextLine());
		//opc=src.nextInt();
		
		switch (opc) {
		
		case 1:

			System.out.println("Todos el personal que tenemos es ");
			for(Map.Entry ayudita : gp.entrySet()) {
				System.out.println(ayudita);
			}
		break ;
		case 2:
			System.out.println("Introduce que codigo  quieres añadir");
			
			num=Integer.parseInt(src.nextLine());
			if(gp.containsKey(num)) {
				System.out.println("Este codigo ya existe");
			}else {
			System.out.println("Introduce que nombre  quieres añadir");
			 nombre =src.nextLine();
			gp.put(num, nombre);
			}
			break ;
		case 3:
			System.out.println("Introduce que codigo quieres modificar");
			 num=Integer.parseInt(src.nextLine());
			if(gp.containsKey(num)){
				System.out.println("Su codigo está dentro, introduzca el nombre que quiere poner");
				 nombre =src.nextLine();
				gp.put(num, nombre);
			}else {
				System.out.println("Se ha equivocado de codigo");
			}
			
		break;
		case 4:
			System.out.println("introduce el codigo que quieres eliminar");
			 num=Integer.parseInt(src.nextLine());;
			if(gp.containsKey(num)){
				System.out.println("Estás seguro de que lo quieres borrar?");
				System.out.println("introduce 1 si quieres confirmar");
				int res = Integer.parseInt(src.nextLine());
				if(res==1) {
				System.out.println("Su codigo es eleminado");
			
				gp.remove(num);
				}else {
					System.out.println("Buena decision");
				}
			}else {
				System.out.println("No encontramos lo que quieres eliminar");
			}
		break;
		case 5:
			System.out.println("nos volveremos a encontrar");
		salir=false;
		break;
		case 6:
		System.out.println("Añadiendo usuarios de ejemplo");
			poblarmap();
			break;
		}
		}while(salir);
		
	}
}
