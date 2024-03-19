import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_17 {
    public static void main(String[]args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número del 2 al 9:");
            numero = Integer.valueOf(entrada.readLine());

            if (numero > 1 && numero < 10) {
                System.out.println("La cuenta regresiva del número " + numero + " es:");
                
                for (int i = numero; i >= 0; i--) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}