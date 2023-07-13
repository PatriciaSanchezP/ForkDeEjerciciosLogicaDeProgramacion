package ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio10 {

	public static void main(String[] args) {
		HashMap<String, String> traduccion = new HashMap<>();

        // Agregar pares clave-valor
        traduccion.put("fresa", "strawberry");
        traduccion.put("vaso", "glass");
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
        traduccion.put("pantalla", "screen");
        traduccion.put("carro", "car");
        traduccion.put("muñeca", "doll");
        traduccion.put("planta", "plant");
        traduccion.put("espejo", "mirror");
        traduccion.put("hueso", "bone");
        traduccion.put("pantalon", "jean");
        
        //Creación de un random para tomar 5 claves al azar 
        Random random = new Random();
        List<String> palabrasList = new ArrayList<>(traduccion.keySet());
        int totalPalabras = palabrasList.size();

        String[] palabrasArray = new String[5];
        Set<Integer> indicesSeleccionados = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int indiceAleatorio;
            do {
                indiceAleatorio = random.nextInt(totalPalabras);
            } while (indicesSeleccionados.contains(indiceAleatorio));

            indicesSeleccionados.add(indiceAleatorio);
            palabrasArray[i] = palabrasList.get(indiceAleatorio);
        }
        
        int contador=1;
        for (String palabra : palabrasArray) {
            System.out.println("Palabra " + contador + ": " + palabra);
            contador++;
        }
        
        System.out.println();
        
        //Se pide al usuario que ingrese la traducción a las palabras aleatorias anteriores
        Scanner scanner = new Scanner (System.in);
		String[] palabrasIng = new String[5];
		for (int i = 0; i < palabrasIng.length; i++) {
		    System.out.print("Ingresa la traducción al inglés de la palabra " + (i + 1) + ": ");
		    palabrasIng[i] = scanner.nextLine();
		}
		scanner.close();
		
		//Se crea una condicional para contar el número de respuestas correctas e incorrectas por medio de la comparación de las dos palabras con el método equals
		int correctas=0;
		int incorrectas=0;
		for (int i=0; i<palabrasIng.length; i++) {
			 if (traduccion.get(palabrasArray[i]).equals(palabrasIng[i])) {
	                correctas++;
	            } else {
	                incorrectas++;
	            }
	
		}
		//Se imprimen los resultados
		System.out.println("Obtuviste: " + correctas + " respuestas correctas y " + incorrectas + " respuestas incorrectas.");
		
        

	}

}
