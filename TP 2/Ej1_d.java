import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1_d {
    public static void main(String[]args) {
        char letra;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra:");
            letra = entrada.readLine().charAt(0);

            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u': System.out.println("Su letra " + letra + " es una vocal"); break;
                case 'A', 'E', 'I', 'O', 'U': System.out.println("Su letra " + letra + " es una vocal"); break;
                default: System.out.println("Su letra " + letra + " es una consonante");
            }
        }
        catch (Exception e) {
            System.out.println("No es una letra. Intente nuevamente");
        }
    }
}
