import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_6 {
    public static void main(String[] args) {
        int numero;
        final int min = 1;
        final int max = 100;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número:");
            numero = Integer.valueOf(entrada.readLine());

            while (numero > min && numero < max) {
                if (numero % 2 == 0 && numero % 3 == 0) {
                    System.out.println("El número " + numero + " es múltiplo de 2 y de 3");
                } else {
                    System.out.println("El número " + numero + " no es múltiplo de 2 y de 3");
                }
                System.out.println("Ingrese otro número:");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}