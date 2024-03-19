/* Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_9 {
    public static final int MAX= 10;

    public static void main(String[]args) {
        int [] arreglo = {0,1,2,3,4,5,6,7,8,9};
        int posicion = 0;
        imprimir_arreglo(arreglo);
        int numero = obtener_numero();
        arreglo_corrimiento_derecha(arreglo, posicion);
        arregloColocarValor(arreglo, numero);
        imprimir_arreglo(arreglo);
    }

    public static void imprimir_arreglo(int [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] => " + arreglo[pos]);
        }
    }

    public static int obtener_numero() {
        int numero = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número para la posición 0: ");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static void arreglo_corrimiento_derecha (int [] arreglo, int posicion) {
        for (int indice = MAX - 1; indice > posicion; indice --) {
            arreglo[indice] = arreglo[indice - 1];
        }
    }

    public static void arregloColocarValor(int [] arreglo, int numero) {
        arreglo[0] = numero;
    }
}
