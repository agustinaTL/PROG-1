import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_20 {
    public static void main(String[]args){
        int numero;
        char caracter;
        String textoLibre;
        int num_1, num_2, num_3, num_4, num_5;
        int num_6, num_7;
        double multiplicado;
        double raizCuadrada;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero positivo:");
            numero = Integer.valueOf(entrada.readLine());

            while (numero != 0) {
                
                System.out.println("Ingrese un carácter:");
                caracter = entrada.readLine().charAt(0);

                if (caracter == 'a') {
                    System.out.println("Ingrese un texto libremente:");
                    textoLibre = entrada.readLine();
                    System.out.println("El texto que ha ingresado es: " + textoLibre);

                } else if (caracter == 'b') {
                    System.out.println("Ingrese 5 números positivos:");
                    num_1 = Integer.valueOf(entrada.readLine());
                    num_2 = Integer.valueOf(entrada.readLine());
                    num_3 = Integer.valueOf(entrada.readLine());
                    num_4 = Integer.valueOf(entrada.readLine());
                    num_5 = Integer.valueOf(entrada.readLine());

                    if (num_1 < num_2 && num_2 < num_3 && num_3 < num_4 && num_4 < num_5) {
                        System.out.println("Los números positivos se ingresaron en orden ascendente");
                    } 

                } else if (caracter == 'c') {
                    System.out.println("Ingrese dos números enteros negativos:");
                    num_6 = Integer.valueOf(entrada.readLine());
                    num_7 = Integer.valueOf(entrada.readLine());

                    multiplicado = num_6 * num_7;
                    raizCuadrada = Math.sqrt(multiplicado);

                    System.out.println("La raíz cuadrada de la multiplicación de " + num_6 + " y " + num_7 + " es: " + raizCuadrada);

                } else {
                    System.out.println("Ha ocurrido un error. Ingrese un carácter:");
                    caracter = entrada.readLine().charAt(0);
                }
                
                System.out.println("Ingrese un número entero positivo:");
                numero = Integer.valueOf(entrada.readLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}