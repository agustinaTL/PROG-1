import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej9 {
    public static void main(String[] args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());

            double numDivididoDos = numero / 2;
            double numDivididoTres = numero / 3;
            double numDivididoCuatro = numero / 4;

            System.out.println("El cociente del número divido 2 es: " + numDivididoDos);
            System.out.println("El cociente del número divido 3 es: " + numDivididoTres);
            System.out.println("El cociente del número divido 4 es: " + numDivididoCuatro);

        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
}
