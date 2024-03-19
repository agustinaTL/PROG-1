import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_3 {
    public static void main(String[]args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número mayor a 50:");
            numero = Integer.valueOf(entrada.readLine());

            if((numero >= 50) && (numero % 2 == 0) || (numero % 3 == 0)) {
                System.out.println("Su número " + numero + " es múltiplo de 2 o de 3");
            }

        } catch (Exception e) {
            System.out.println("Error, ingrese un número mayor a 50");
        }
    }
}
