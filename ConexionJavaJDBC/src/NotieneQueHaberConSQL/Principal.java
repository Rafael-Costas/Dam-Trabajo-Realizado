package NotieneQueHaberConSQL;

public class Principal {

	public static void Semana(String dia) {
		switch (dia) {
		case "Lunes": {
			System.out.println("Empieza el tormento");
			break;
		}
		case "Martes": {
			System.out.println("Continua el tormento");
			break;
		}
		case "Miercoles": {
			System.out.println("La luz ya se ve cerca");
			break;
		}
		case "Jueves": {
			System.out.println("POR FIN ES JUEVES");
			break;
		}
		case "Viernes": {
			System.out.println("El cuerpo pide fiesta y lo sabe");
			break;
		}
		case "Sabado": {
			System.out.println("FIEEEEEEEEEEEEESTA");
			break;
		}
		case "Domingo": {
			System.out.println("Se viene el lunes");
			break;
		}
		default:
		 System.out.println("Mal escrito");
		}
	}
}
