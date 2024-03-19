/* Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_6 {
    public static void main(String[]args) {
        char letraMin = cargarLetra();

        while (letraMin >= 'a' && letraMin <= 'z') {
            imprimirTabla();
            letraMin = cargarLetra();
        }
    }
    
    public static char cargarLetra() {
        char letra;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra minúscula:");
            letra = entrada.readLine().charAt(0);
            
            return letra;
        } catch (Exception e) { 
            return ' ';
        }
    }
    

    public static void imprimirTabla() {
        System.out.println("La tabla de multiplicar del 9 es:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 * " + i + " = " + 9 * i);
        }
    }
}