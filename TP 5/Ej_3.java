/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado. */

import java.util.Random;

public class Ej_3 {
    public static int MAX = 10;
    public static int MINVALUE = 1;
    public static int MAXVALUE = 10;

    public static void main(String[]args) {
        int [] arrenteros = new int [MAX];
        
        cargarArreglo(arrenteros);
        mostrarArreglo(arrenteros);

        int promedio = calcularPromedio(arrenteros);
        System.out.println("El promedio del arreglo es: " + promedio);

        int contador = contarEnArreglo(arrenteros, promedio);
        System.out.println("La cantidad de elementos que superan al promedio son: " + contador);
    }

    public static void cargarArreglo (int [] arrenteros) {
        Random r = new Random();

        for (int pos = 0; pos < MAX; pos++) {
            arrenteros[pos] = (r.nextInt(MAXVALUE - MINVALUE+1) + MINVALUE);
        }
    }
    public static void mostrarArreglo (int [] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arrenteros [" + pos + "] -> " + arrenteros[pos]);
        }
    }

    public static int calcularPromedio (int [] arrenteros) {
        int suma = 0;

        for (int pos = 0; pos < MAX; pos++) {
            suma += arrenteros[pos];
        }
        return suma / MAX;
    }

    public static int contarEnArreglo (int [] arrenteros, int promedio) {
        int contador = 0;

        for (int i = 0; i < MAX; i++) {
            if (arrenteros[i] > promedio) {
                contador++;
            }
        }
        return contador;
    }
}