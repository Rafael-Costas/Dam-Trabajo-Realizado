import javax.swing.JOptionPane;

public class Array_Dimensional {

	public static void main(String[] args) {
		boolean [][] combinacionaes = {{true, true, true}, {false,true,false}, { false,true,true}};
		for(int i=0; i<combinacionaes.length; i++) {
			for(int j=0; j<combinacionaes.length; j++) {
				System.out.print(combinacionaes[i][j]+" ");
			}
			System.out.println();
		}
		String color="";
		String modelo="";
		
		
	
		
		
	
		int indiceColor=3;
		int indicemodelo=3;
		do {
			JOptionPane.showMessageDialog(null, "Introduzca el modelo");
			modelo=JOptionPane.showInputDialog("Modelo");
			modelo=modelo.toLowerCase();
		
		switch(modelo) {
		
		case"ibiza":
			indicemodelo=0;
			break;
		case"cordoba":
			indicemodelo=1;
			break;
		case"toledo":
			indicemodelo=2;
			break;
			default:
				JOptionPane.showMessageDialog(null, "Modelo Incorrecto");
			break;
		}
		}while(indicemodelo==3);

		
		do {
			JOptionPane.showMessageDialog(null, "Introduzca el Color");
			color=JOptionPane.showInputDialog("Color");
			color.toLowerCase();
			switch(color) {
		case "amarillo":
			indiceColor=0;
			break;
		case "blanco":
			indiceColor=1;
			break;
		case "rojo":
			indiceColor=2;
			break;
			default:
				System.out.println("Color incorrecto;");
				break;
		}
	}while(indiceColor==3);
		System.out.println(combinacionaes[indicemodelo][indiceColor]);
	
	
	}
}
