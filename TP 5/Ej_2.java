/* Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola. */

import java.util.Random;

public class Ej_2 {
    public static int MAX = 10;
    public static int MINVALUE = 1;
    public static int MAXVALUE = 10;

    public static void main(String[]args) {
        int [] arrenteros = new int [MAX];
        int promedio;

        cargarArreglo(arrenteros);
        mostrarArreglo(arrenteros);
        promedio = calcularPromedio(arrenteros);

        System.out.println("El promedio del arreglo es: " + promedio);
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
}
