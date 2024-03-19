/*Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_7 {
    public static void main(String[]args) {
        int numero = cargarNumero();
        while (numero != 0) {
            System.out.println("La suma de los primeros 200 números naturales es: " + imprimirSuma());
            numero = cargarNumero();
        }
    }    

    public static int cargarNumero() {
        int num;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            num = Integer.valueOf(entrada.readLine());

            return num;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return 0;
    }

    public static int imprimirSuma() {
        int sumatoria = 0;

        for (int i = 1; i <= 200; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }
}