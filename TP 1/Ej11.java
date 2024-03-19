import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej11 {
    public static void main(String[] args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numero = Integer.valueOf(entrada.readLine());

            // a. si es múltiplo de 6 y de 7
            if (numero % 6 == 0 && numero % 7 == 0) {
                System.out.println("El número ingresado " + numero + " es múltiplo de 6 y de 7.");
            } else {
                System.out.println("El número ingresado " + numero + " no es múltiplo de 6 y de 7.");
            }

            // b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30
            if (numero > 30 && numero % 2 == 0) {
                System.out.println("El número ingresado " + numero + " es mayor a 30 y múltiplo de 2.");
            } else if (numero <= 30) {
                System.out.println("El número ingresado " + numero + " es menor o igual a 30.");
            }

            // c. si el cociente de la división de dicho número por 5 es mayor
            // que 10
            if (numero / 5 > 10) {
                System.out.println("El cociente de la división del número " + numero + " por 5 es mayor que 10");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
}
