/* Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_1 {
    public static int MAX = 15;

    public static void main(String[]args) {
        int [] arrenteros = new int [MAX];
        cargarArreglo(arrenteros);
        mostrarArreglo(arrenteros);
    }

    public static void cargarArreglo (int [] arrenteros) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;

        try {
            for (int pos = 0; pos < MAX; pos++) {
               System.out.println("Ingrese un número entre 1 y 12 para la posición " + pos + " :");
               numero = Integer.valueOf(entrada.readLine());

               if (numero >= 1 && numero <= 12) {
                arrenteros[pos] = numero;
               } else {
                System.out.println("Error: Ingrese un número entre 1 y 12 para la posición " + pos + " :");
                numero = Integer.valueOf(entrada.readLine());
                arrenteros[pos] = numero;
               }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void mostrarArreglo (int [] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arrenteros [" + pos + "] -> " + arrenteros[pos]);
        }
    }
}
