import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_14 {
    public static void main(String[] args) {
        int numero;
        int sumatoria = 0;

        try {
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese un número:");
                numero = Integer.valueOf(entrada.readLine());
                if(numero % 2 == 0) {
                    sumatoria ++;
                }
            }
            System.out.println("Se ingresaron " + sumatoria + " veces números pares");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}