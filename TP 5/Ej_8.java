/* Implementar un método que realice un corrimiento a izquierda en
un arreglo ordenado de tamaño MAX=10 a partir de una posición. */

public class Ej_8 {
    public static final int MAX = 10;
    public static final int MIN = 0;

    public static void main(String[]args) {
        int [] arreglo = {0,1,2,3,4,5,6,7,8,9};
        int posicion = 2;

        imprimir_arreglo(arreglo);
        System.out.println("Arreglo con corrimiento a la izquierda:");
        arreglo_corrimiento_izquierda(arreglo, posicion);
        imprimir_arreglo(arreglo);
    }

    public static void imprimir_arreglo(int [] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Arreglo [" + pos + "] => " + arreglo[pos]);
        }
    }

    public static void arreglo_corrimiento_izquierda(int [] arreglo, int posicion) {
        for (int indice = MIN; indice < posicion; indice ++) {
            arreglo[indice] = arreglo[indice + 1];
        }
    }
}
