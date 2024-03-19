/* Implementar un método que realice un corrimiento a derecha en
un arreglo ordenado de tamaño MAX=10 a partir de una posición. */

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_7_2 {
    public static final int MAX = 10;
    public static final int MAXVALUE = 10;
    public static final int MINVALUE = 1;

    public static void main(String[]args) {
        int [] arreglo = new int [MAX];
        cargar_arreglo_aleatorio_int(arreglo);
        imprimir_arreglo(arreglo);
        System.out.println("Arreglo con corrimiento a derecha: ");
        int posicion = obtener_posicion();
        arreglo_corrimiento_derecha(arreglo, posicion);
        imprimir_arreglo(arreglo);
    }

    public static void cargar_arreglo_aleatorio_int(int [] arreglo) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arreglo[pos] = (r.nextInt((MAXVALUE - MINVALUE + 1) - MINVALUE));
        }
    }

    public static void imprimir_arreglo(int [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] => " + arreglo[pos]);
        }
    }

    public static int obtener_posicion() {
        int posicion = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número de posición: ");
            posicion = Integer.valueOf(entrada.readLine());

        } catch (Exception e) {
            System.out.println(e);
        }
        return posicion;
    }

    public static void arreglo_corrimiento_derecha(int [] arreglo, int posicion) {
        if (posicion < MAX) {
            for (int indice = MAX - 1; indice >= posicion; indice--) {
                arreglo[indice] = arreglo[indice - 1];
            }
        }
    }
}