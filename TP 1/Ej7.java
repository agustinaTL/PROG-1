import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej7 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un primer valor (número entero): ");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese un segundo valor (número entero): ");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese un tercer valor (número entero): ");
            numero3 = Integer.valueOf(entrada.readLine());

            int calculoNumeros = (numero1 / numero2) - numero3;

            System.out.println("El resultado de dividir el primero por el segundo y a esto restarle el tercero es : "
                    + calculoNumeros);
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
}
