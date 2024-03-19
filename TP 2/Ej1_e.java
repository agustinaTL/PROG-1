import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1_e {
    public static void main(String[] args){
        int numero1;
        int numero2;
        int numero3;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese otro número");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese otro número");
            numero3 = Integer.valueOf(entrada.readLine());

            if((numero1 < numero2) && (numero2 < numero3)) {
                System.out.println("Creciente");
            } else if((numero1 > numero2) && (numero2 > numero3)) {
                    System.out.println("Decreciente");
                } else {
                    System.out.println("Error");
                }
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}