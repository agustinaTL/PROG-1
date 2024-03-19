import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_10 {
    public static void main(String[]args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número:");
            numero = Integer.valueOf(entrada.readLine());
            int sumatoria = 0;

            while (numero >= 1 && numero <= 10) {
                sumatoria += numero;
                System.out.println("Ingrese un número:");
                numero = Integer.valueOf(entrada.readLine());
            }
            System.out.println("La suma de los números ingresados es: " + sumatoria);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}