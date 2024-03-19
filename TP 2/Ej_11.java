import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_11 {
    public static void main(String[]args) {
        char letra;
        int vocales = 0;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales ++;
                }
                System.out.println("Ingrese una letra:");
                letra = entrada.readLine().charAt(0);
            }
            System.out.println("Ha ingresado " + vocales + " vocales");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}