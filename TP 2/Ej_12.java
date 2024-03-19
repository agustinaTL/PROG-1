import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_12 {
    public static void main(String[]args) {
        char letra;
        char letraMenor = 'z';
        char letraMayor = 'a';
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra minúscula:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {

                if (letra < letraMenor) {
                    letraMenor = letra;
                }

                if (letra > letraMayor) {
                    letraMayor = letra;
                }
                System.out.println("Ingrese otra letra minúscula:");
                letra = entrada.readLine().charAt(0);
            }
            System.out.println("La menor letra ingresada es:" + letraMenor + " y la mayor es: " + letraMayor);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}