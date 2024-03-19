import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_4 {
    public static void main(String []args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entre 0 y 999:");
            numero = Integer.valueOf(entrada.readLine());

            if((numero >= 0) && (numero <= 9)) {
                System.out.println("Su número tiene 1 dígito");
            } else if((numero >= 10) && (numero <= 99)) {
                System.out.println("Su número tiene 2 dígitos");
            }else {
                System.out.println("Su número " + numero + " tiene 3 dígitos");
            }

        } catch (Exception e) {
            System.out.println("Error, ingrese un un número entre 0 y 999");
        }
    }
}