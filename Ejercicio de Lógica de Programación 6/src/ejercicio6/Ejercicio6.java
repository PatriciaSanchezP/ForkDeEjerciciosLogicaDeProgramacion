package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		System.out.println("Ingrese una palabra");
		Scanner scanner = new Scanner (System.in);
		String palabra = scanner.nextLine ();
		scanner.close();
		
		String reverse = "";
		for(int i= palabra.length() - 1; i>=0; i--) {
			reverse = reverse + palabra.charAt(i);

		}
		System.out.println(reverse);

	}

}
