/* Implementar un método que realice un corrimiento a derecha en
un arreglo ordenado de tamaño MAX=10 a partir de una posición. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_7 {
    public static final int MAX = 10;
    public static void main(String[]args) {
        int [] arrenteros = {3, 4, 6, 8, 9, 11, 14, 17, 18, 19};
        int posicion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número de posición:");
            posicion = Integer.valueOf(entrada.readLine());
            
            for (int indice = MAX - 1; indice >= posicion; indice--) {
                arrenteros[indice] = arrenteros[indice - 1];
            }
            arrenteros[posicion] = 56;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        mostrarArreglo(arrenteros);
    }
    public static void mostrarArreglo(int [] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] -> " + arrenteros[pos]);
        }
        System.out.println();
    }
}
