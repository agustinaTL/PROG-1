import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1_a{
    public static void main(String[]args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());
    
            if(numero >= 0) {
                System.out.println("Su número " + numero + " es positivo");
            }
            else {
                System.out.println("Su número " + numero + " es negativo");
            } 
        } catch (Exception e) {
            System.out.println("Error. Vuelva a intentarlo");
        }
    }
}