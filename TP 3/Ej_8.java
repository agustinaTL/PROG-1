/*  Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por pantalla el
resultado de la operación matemática básica considerando el valor
del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ej_8 {
    public static void main(String[] args) {
        double numero_1 = ingresarNumero();
        double numero_2 = ingresarNumero();
        char letra = ingresarCaracter();
        imprimirOperacion(numero_1, numero_2, letra);
    }

    public static double ingresarNumero() {

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            double numero = Double.valueOf(entrada.readLine());
            return numero;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return 0;
    }

    public static char ingresarCaracter() {

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter:");
            char letra =  entrada.readLine().charAt(0);
            return letra;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return ' ';
    }

    public static void imprimirOperacion(double numero_1, double numero_2, char letra) {
        
        try {
            switch (letra) {
                case 'a': System.out.println("El resultado de la suma es: " + (numero_1 + numero_2)); break;
                case 'b': System.out.println("El resultado de la resta es: " + (numero_1 - numero_2)); break;
                case 'c': System.out.println("El resultado de la multiplicación es: " + (numero_1 * numero_2)); break;
                case 'd': System.out.println("El resultado de la división es: " + (numero_1 / numero_2)); break;
                              
                default: System.out.println("La letra ingresada no es válida. Ingrese a,b,c,d:");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}