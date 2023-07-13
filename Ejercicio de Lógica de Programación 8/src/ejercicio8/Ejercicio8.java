package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
		    System.out.print("Ingresa el #" + (i + 1) + ": ");
		    numeros[i] = scanner.nextInt();
		}
		scanner.close();
		
		// Este paso es para ordenar los números primos al inicio del array
        int[] numerosOrdenados = ordenarPrimosAlInicio(numeros);

        // Este ciclo es para mostrar el array resultante
        System.out.println("Array con números primos al inicio:");
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println("pos[" + i + "] = " + numerosOrdenados[i]);
        }
        
	}


// Función para verificar si un número es primo
public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i <= numero/2; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}

//Función para ordenar los números primos al inicio del array
public static int[] ordenarPrimosAlInicio(int[] numeros) {
    int[] numerosOrdenados = new int[numeros.length];
    int primerIndice = 0;
    int ultimoIndice = numeros.length - 1;

    // Colocar los números primos al inicio del array
    for (int numero : numeros) {
        if (esPrimo(numero)) {
            numerosOrdenados[primerIndice] = numero;
            primerIndice++;
        } else {
            numerosOrdenados[ultimoIndice] = numero;
            ultimoIndice--;
        }
    }

    return numerosOrdenados;
}

}
