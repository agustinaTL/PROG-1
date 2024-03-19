import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_7 {
    public static void main(String[]args) {
        char  caracter;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter:");
            caracter = entrada.readLine().charAt(0);

            while (caracter != '*') {
                if (caracter >= '0' && caracter <= '9') {
                    System.out.println("El caracter ingresado: " + caracter + " es un dígito");
                } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println("El caracter ingresado: " + caracter + " es una vocal minúscula");
                } else {
                    System.out.println("El caracter ingresado: " + caracter + " es una consonante");
                }
                System.out.println("Ingrese otro caracter:");
                caracter = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e);
        }
    }
}
