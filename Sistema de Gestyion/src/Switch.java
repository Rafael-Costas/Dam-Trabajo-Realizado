import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Introduzca un dia  de la semana");
		String diaSemana=JOptionPane.showInputDialog("Dia de la semana");
		diaSemana=diaSemana.toLowerCase();
		switch(diaSemana){
		
		case "lunes", "Martes":
			System.out.println("Es lunes, curras");
			break;
		case "martes":
			System.out.println("Es martes, curras");
			break;
		case "miercoles":
			System.out.println("Es miercoles, curras");
			break;
		case "jueves":
			System.out.println("Es jueves, curras");
			break;
		case "viernes":
			System.out.println("Es viernes, curras");
			break;
		case "sabado":
			System.out.println("Es sabado, LIBREEEEEEEEEEEEEEEE");
			break;
		case "domingo":
			System.out.println("Es domingo, LIBREEEEEEEEEEEEEEEEEEE");
			break;
			default:
				System.out.println("TE EQUIVOCASTEEEEEEEEEEEEEEEEEEEEEEEEEE");
				break;
		
		}
	}
}
