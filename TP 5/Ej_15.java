/*Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
el caso de eliminar secuencias se debe hacer corrimiento.
Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros. */

import java.util.Random;

public class Ej_15 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidadNumero = 0.4;

    public static void main(String[] args) {
        
        int arr[] = new int[MAX];
        cargarArregloAleatorioSecuenciasInt(arr);
        imprimirArregloSecuenciasInt(arr);
        int ini= obtenerInicioSecuencia(arr, MINVALOR);
        int fin= obtenerFinSecuencia(arr, ini);
        System.out.println("La primer secuencia empieza en: " + ini + " y termina en: " + fin);
    }

    public static void cargarArregloAleatorioSecuenciasInt(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > probabilidadNumero) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimirArregloSecuenciasInt(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerFinSecuencia(int[] arr, int ini) {
        while (ini < MAX && arr[ini] != 0)
            ini++;
        return ini - 1;
    }

    public static int obtenerInicioSecuencia(int[] arr, int ini) {
        while (ini < MAX && arr[ini] == 0) {
            ini++;
        }
        return ini;
    }
}
