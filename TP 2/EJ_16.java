import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ_16 {
    public static void main(String[]args) {
        char caracter;
        int cantidad_a = 0;
        int max_a = 0;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
            for (int i = 0; i < 15; i++) {
                System.out.println("Ingrese un carácter:");
                caracter = entrada.readLine().charAt(0);
                
                if (caracter == 'a') {
                    cantidad_a ++;

                    if (cantidad_a > max_a) {
                        max_a = cantidad_a;
                    }
                } else {
                    cantidad_a = 0;
                }
            }
            System.out.println("La mayor cantidad de 'a' seguidas que se ingresaron fueron: " + max_a);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}