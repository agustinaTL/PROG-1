import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_9 {
    public static void main(String[]args) {
        char caracter;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un carácter:");
            caracter = entrada.readLine().charAt(0);

            while (caracter >= '0' && caracter <= '9' || caracter >= 'a' && caracter <= 'z') {
                if (caracter >= '0' && caracter <= '9') {
                    System.out.println("El carácter ingresado: " + caracter + " es un dígito");
                } else if (caracter >= 'a' && caracter <= 'z' && caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println("El carácter ingresado: " + caracter + " es una letra minúscula, vocal.");
                } else if (caracter >= 'a' && caracter <= 'z') {
                    System.out.println("El carácter ingresado: " + caracter + " es una letra minúscula, consonante.");
                }
                System.out.println("Ingrese un carácter:");
                caracter = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}