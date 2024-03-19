import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1_b{
    public static void main(String[]args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());

            if(numero >= 100) {
                System.out.println("Grande");
            }
            else{
                System.out.println("Chico");
            }
        } catch (Exception e) {
            System.out.println("Error. Ingrese un número entero:");
        }
    }
}