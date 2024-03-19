import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_8 {
    public static void main(String[]args) {
        int numero;
        int otroNumero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());

            while (numero != 0) {
                System.out.println("Ingrese otro número entero:");
                otroNumero = Integer.valueOf(entrada.readLine());
                System.out.println("El número ingresado es: " + otroNumero);
                System.out.println("Ingrese un número entero:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}