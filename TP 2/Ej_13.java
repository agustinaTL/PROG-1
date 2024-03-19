import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_13 {
    public static void main(String[]args) {
        char letra;
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {
                System.out.println("Ingrese un número entero:");
                numero = Integer.valueOf(entrada.readLine());

                if (numero >= 1 && numero <= 5) {
                    System.out.println("Tabla de multiplicar del " + numero + ":");
                    System.out.println(numero + " multiplicado por 1 = " + numero * 1);
                    System.out.println(numero + " multiplicado por 2 = " + numero * 2);
                    System.out.println(numero + " multiplicado por 3 = " + numero * 3);
                    System.out.println(numero + " multiplicado por 4 = " + numero * 4);
                    System.out.println(numero + " multiplicado por 5 = " + numero * 5);
                    System.out.println(numero + " multiplicado por 6 = " + numero * 6);
                    System.out.println(numero + " multiplicado por 7 = " + numero * 7);
                    System.out.println(numero + " multiplicado por 8 = " + numero * 8);
                    System.out.println(numero + " multiplicado por 9 = " + numero * 9);
                    System.out.println(numero + " multiplicado por 10 = " + numero * 10);
                }
                System.out.println("Ingrese una letra:");
                letra = entrada.readLine().charAt(0);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}