/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_10 {
    public static final int MAX = 10;
    public static final int MIN = 0;
    
    public static void main(String[]args) {
        int [] arreglo = {0,1,2,3,4,5,6,7,8,9};
        imprimirArreglo(arreglo);
        int numero = obtenerNumero();
        int posicion = buscarPosicion(arreglo, numero);
        
        if (posicion < MAX && posicion == numero) {
            corrimientoIzquierda(arreglo, posicion);
            eliminarPosicion(arreglo, posicion);
            imprimirArreglo(arreglo);
        }
    }

    public static void imprimirArreglo(int [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] => " + arreglo[pos]);
        }
    }
    public static int obtenerNumero() {
        int numero = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número: ");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int buscarPosicion (int [] arreglo, int numero) {
        int posicion = 0;
        while (posicion < MAX && posicion < numero) {
            posicion++;
        }
        return posicion;
    }

    public static void corrimientoIzquierda(int [] arreglo, int posicion) {
        for (int indice = MIN; indice < MAX - 1; indice++) {
            arreglo[indice] = arreglo[indice + 1];
        }
    }

    public static void eliminarPosicion(int [] arreglo, int posicion) {
        arreglo[posicion] = 0;
    }
}
