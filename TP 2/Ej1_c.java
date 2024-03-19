import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1_c {
    public static void main(String[]args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero del 1 al 7 inclusive:");
            numero = Integer.valueOf(entrada.readLine());

            switch (numero){
                case 1: System.out.println("Es lunes"); break;
                case 2: System.out.println("Es martes"); break;
                case 3: System.out.println("Es miércoles"); break;
                case 4: System.out.println("Es jueves"); break;
                case 5: System.out.println("Es viernes"); break;
                case 6: System.out.println("Es sábado"); break;
                case 7: System.out.println("Es domingo"); break;
                default: System.out.println("No es un día de la semana");
            }
        } catch (Exception e) {
            System.out.println("Error. No es un número entero. Intente nuevamente.");
        }
    }
}