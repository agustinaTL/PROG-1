/* Hacer un programa que dado un arreglo de caracteres de tamaño
10 que se encuentra cargado, invierta el orden del contenido. Este
intercambio no se debe realizar de manera explícita, hay que
hacer un método que incluya una iteración de intercambio. */

import java.util.Random;

public class Ej_5 {
    public static final int MAX = 10;

    public static void main(String[]args) {
        char [] arregloChar = new char [MAX];

        cargarArreglo(arregloChar);
        mostrarArreglo(arregloChar);
        arregloChar =  invertirArreglo(arregloChar);
        mostrarArreglo(arregloChar);
    }

    public static void mostrarArreglo(char [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] -> " + arreglo[pos]);
        }
        System.out.println();
    }

    public static void cargarArreglo(char [] arregloChar) {
        Random r = new Random();
        
        for (int pos = 0; pos < MAX; pos++) {
            arregloChar[pos] = (char)(r.nextInt(26) + 'a');
        }
    }

    public static char[] invertirArreglo(char [] arregloChar) {
        char[] arregloInvertido = new char[MAX];
        int indiceInsert = 0;
        for (int pos = 9; pos >= 0; pos--) {
            arregloInvertido[indiceInsert] = arregloChar[pos];        
            indiceInsert ++;
        }
        return arregloInvertido;
    }
}
