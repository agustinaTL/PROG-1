import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_2 {
    public static void main(String[]args){
        int numeroMes;
        int anio;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número de mes del 1 al 12:");
            numeroMes = Integer.valueOf(entrada.readLine());

            if((numeroMes == 1) || (numeroMes == 3) || (numeroMes == 5) || (numeroMes == 7) || (numeroMes == 8) || (numeroMes == 10) || (numeroMes == 12)) {
                System.out.println("Su mes tiene 31 días");
            } else if((numeroMes == 4) || (numeroMes == 6) || (numeroMes == 9) || (numeroMes == 11)) {
                System.out.println("Su mes tiene 30 días");
            } else {
                System.out.println("Ingrese un número de año:");
                anio = Integer.valueOf(entrada.readLine());
                if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                    System.out.println("En el año " + anio  + " su mes Febrero tiene 29 días");
                } else {
                    System.out.println("En el año " + anio  + " su mes Febrero tiene 28 días");
                }
            }
        } catch (Exception e) {
            System.out.println("Error. Ingrese un número de mes del 1 al 12");
        }
    }
}