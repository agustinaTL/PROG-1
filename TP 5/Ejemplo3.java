//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, 
// encuentre la posición de un
//número entero ingresado por el usuario. Si existe, muestre esa posición por pantalla, 
// o indique que no existe.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo3 {
    public static int MAX = 10;

    public static void main(String[]args) {
        int [] arrenteros = new int [MAX];
        int pos,numero;

        try {
            cargarArreglo (arrenteros);
            imprimirArreglo (arrenteros);

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número:");
            numero = Integer.valueOf(entrada.readLine());

            pos = obtenerPosArreglo(arrenteros,numero);
            if (pos < MAX) {
                System.out.println(numero + " está en la posición " + pos);
            } else {
                System.out.println(numero + " no existe en el arreglo");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }   
    }

    public static void cargarArreglo (int [] arrenteros) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            for (int pos = 0; pos < MAX; pos++) {
                System.out.println("Ingrese un número para la posición " + pos + ":");
                arrenteros[pos] = Integer.valueOf(entrada.readLine());
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void imprimirArreglo (int [] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] => " + arrenteros[pos]);
        }
    }

    public static int obtenerPosArreglo(int [] arrenteros, int numero) {
        int posicion = 0;
        while ((posicion < MAX) && (arrenteros[posicion] != numero)) {
        posicion++;
        }
        return posicion;
    }
}