package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Ingrese un día de la semana (Lunes a Viernes)");
		Scanner scanner = new Scanner (System.in);
		String diaIn = scanner.nextLine ();
		String dia = diaIn.toLowerCase();
		System.out.println("Ingrese una hora en formato de 24hrs, sin minutos");
		int hora = scanner.nextInt();
		System.out.println("Ingrese los minutos");
		int minutos = scanner.nextInt();
		scanner.close();
		if(hora>23) {
			System.out.println("Hora incorrecta, favor de utilizar formato de 24 hrs");
		} else if(minutos>59) {
			System.out.println("Minutos incorrectos, favor de ingresar un número del 0 al 59");
		} else {
			switch(dia) {
			case "lunes":
				int minutosrest=6660-(hora*60)-minutos;
				System.out.println("Faltan "+ minutosrest+ " minutos para el fin de semana");
				break;
			case "martes":
				int minutosrest2=5220-(hora*60)-minutos;
				System.out.println("Faltan "+ minutosrest2+ " minutos para el fin de semana");
				break;
			case "miercoles":
				int minutosrest3=3780-(hora*60)-minutos;
				System.out.println("Faltan "+ minutosrest3+ " minutos para el fin de semana");
				break;
			case "jueves":
				int minutosrest4=2340-(hora*60)-minutos;
				System.out.println("Faltan "+ minutosrest4+ " minutos para el fin de semana");
				break;
			case "viernes":
				int minutosrest5=900-(hora*60)-minutos;
				System.out.println("Faltan "+ minutosrest5+ " minutos para el fin de semana");
				break;
			default:
				System.out.println("Día inválido, proporciona un dia de lunes a viernes");
				break;
			}
			
		}
		

	}

}
