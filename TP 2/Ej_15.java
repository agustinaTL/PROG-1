import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_15 {
    public static void main(String[]args) {
        int numero;
        int sumatoria = 0;
        int cantidad = 0;
        int promedio = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());

            while (numero != 0) {
                cantidad++;
                sumatoria += numero;
                promedio = sumatoria / cantidad;
                
                if (numero < minimo) {
                    minimo = numero;
                } else if (numero > maximo) {
                    maximo = numero;
                }
                System.out.println("Ingrese un nuevo número entero:");
                numero = Integer.valueOf(entrada.readLine());
            }

            System.out.println("El promedio de los números ingresados es: " + promedio);
            System.out.println("El menor valor fue " + minimo + ", y el mayor valor fue " + maximo);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}