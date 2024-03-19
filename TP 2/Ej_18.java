import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_18 {
    public static void main(String[]args) {
        int numero;
        int numero_2;
        int numero_3;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número:");
            numero = Integer.valueOf(entrada.readLine());

            while (numero != 0) {
                System.out.println("Ingrese otro número:");
                numero_2 = Integer.valueOf(entrada.readLine());

                System.out.println("Ingrese otro número más:");
                numero_3 = Integer.valueOf(entrada.readLine());

                System.out.println("El resultado de la división entre " + numero_2 + " y " + numero_3 + " es: " + numero_2 / numero_3);
                
                System.out.println("Ingrese un número:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}