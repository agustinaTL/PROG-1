//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, imprima por pantalla el promedio de la suma de sus valores.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo2 {
    public static int MAX = 10;

    public static void main(String[]args) {
        int [] arrenteros = new int [MAX];
        int promedio;
        
        cargarArreglo (arrenteros);
        promedio = promedioArreglo (arrenteros);
        System.out.println("El promedio del arreglo es: " + promedio);
    }

    public static void cargarArreglo (int [] arrenteros) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            for (int pos = 0; pos < MAX; pos++) {
                System.out.println("Ingrese un número en la posición " + pos + ":");
                arrenteros[pos] = Integer.valueOf(entrada.readLine());
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static int promedioArreglo (int [] arrenteros) {
        int suma = 0;
        for (int pos = 0; pos < MAX; pos++) {
            suma += arrenteros[pos];
        }
        return suma / MAX;
    }
}
