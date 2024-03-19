import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_1 {
    public static void main (String[]args) {
        // Declarar dos variables enteras, 
        // Realizar un Try catch,
            // Pedir al usuario que ingrese un número por teclado,
            // Realizar un while con la condición "número distinto a 0",
                // Pedir al usuario que ingrese otro número por teclado,
                // Imprimir por pantalla el segundo número ingresado.
                // Pedir al usuario que ingrese un número por teclado.

        int numero, numero_2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());

            while (numero != 0) {
                System.out.println("Ingrese otro número entero:");
                numero_2 = Integer.valueOf(entrada.readLine());

                System.out.println("El segundo número ingresado es: " + numero_2);

                System.out.println("Ingrese un número entero:");
                numero = Integer.valueOf(entrada.readLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}