/* Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también. */

import java.util.Random;

public class Ej_4 {
    public static final int MAX = 10;
    public static void main(String[]args) {
        char [] arreglo = new char [MAX];

        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
        char elemento = 'a';
        
        boolean existe = false;
        for (int pos = 0; pos < MAX; pos++) {
            char elemEncontrado = arreglo[pos];
            if (elemEncontrado == elemento) {
                System.out.println("El elemento " + elemento + " se encuentra en la posición " + pos);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo");
        }
    }

    public static void cargarArreglo (char [] arreglo) {
        Random r = new Random();
        
        for (int pos = 0; pos < MAX; pos++) {
            arreglo[pos] = (char)(r.nextInt(26) + 'a');
        }
    }

    public static void mostrarArreglo(char [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] -> " + arreglo[pos]);
        }
    }
}