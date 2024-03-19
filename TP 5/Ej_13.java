/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_13 {
    public static int MAX = 10;
    public static void main(String[] args) {
        int [] arreglo = {10, 9,8,7,6,5,4,3,2,1} ;
        int pos = 0;
        imprimirArreglo(arreglo);
        int numero = obtenerNuevoNumero();
        pos = obtenerPosicionNumero(arreglo, numero);
        corrimientoDerecha(arreglo, pos);
        System.out.println("");
        imprimirArreglo(arreglo);
    }

    public static void imprimirArreglo(int [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arr[" + pos + "]=>: " + arreglo[pos]);
        }
    }

    public static int obtenerNuevoNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el número que quiere ingresar en el arreglo: ");
            numero= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int obtenerPosicionNumero(int[]arreglo, int numero){
        int pos = 0; 
        for (int i = 0; i < MAX; i++){
            if (arreglo[i]==numero){
                 pos = i;
                 return pos;
            }
        }
        return pos;
    }
 
    public static void corrimientoDerecha(int[]arreglo, int pos){
        int indice= MAX-1;
        for (indice = MAX - 1; indice > pos; indice--){
            arreglo[indice] = arreglo[indice-1];
        }

    }

}