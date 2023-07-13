package ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {		
		// Crear un HashMap
        HashMap<String, String> traduccion = new HashMap<>();

        // Agregar pares clave-valor
        traduccion.put("fresa", "strawberry");
        traduccion.put("vaso", "glass");
        traduccion.put("amor", "love");
        traduccion.put("amor", "love");
        traduccion.put("ventana", "window");
        traduccion.put("supermercado", "supermarket");
        traduccion.put("tortuga", "turtle");
        traduccion.put("naranja", "orange");
        traduccion.put("mano", "hand");
        traduccion.put("cupido", "cupid");
        traduccion.put("casa", "house");
        traduccion.put("hola", "hello");
        traduccion.put("gato", "cat");
        traduccion.put("perro", "dog");
        
        //Solicitar una palabra en español (clave)
        System.out.println("Ingresa una palabra en español");
		Scanner scanner = new Scanner(System.in);
		String palabra = scanner.nextLine ();
		String clave = palabra.toLowerCase();
		scanner.close();
		
		// Acceder al valor correspondiente en el HashMap
        String valor = traduccion.get(clave);

        // Verificar si se encontró el valor y mostrarlo
        if (valor != null) {
            System.out.println("La traducción de la palabra '" + clave + "' al inglés es: " + valor);
        } else {
            System.out.println("No se encontró la traducción al inglés para la palabra '" + clave + "'");
        }
    }

	}

