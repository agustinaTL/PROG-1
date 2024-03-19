/*  Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima. */

import java.util.Random;

public class Ej_6 {
    public static final int MAX = 10;
    public static final int MAXVALUE = MAX;
    public static final int MINVALUE = 1;

    public static void main(String[]args) {
        int [] arrenteros = new int [MAX];

        cargarArreglo(arrenteros);
        mostrarArreglo(arrenteros);
        int pares = paresArreglo(arrenteros);
        System.out.println("El arreglo tiene " + pares + " números pares");
    }
    public static void cargarArreglo(int [] arrenteros) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arrenteros[pos] = (r.nextInt((MAXVALUE - MINVALUE+1) + MINVALUE));
        }
    }
    public static void mostrarArreglo(int [] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] -> " + arrenteros[pos]);
        }
    }
    public static int paresArreglo (int [] arrenteros) {
        int cantidad = 0;
        for (int pos = 0; pos < MAX; pos++) {
            if (arrenteros[pos] % 2 == 0) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
