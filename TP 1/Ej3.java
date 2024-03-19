import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej3 {
    public static void main(String[] args){
        final int numero;

        try{
            System.out.println("Ingrese valor entero por teclado: ");
        
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            numero = Integer.valueOf(entrada.readLine());

            System.out.println("El valor ingresado es: " + numero);

        }
        catch(Exception exc){
            System.out.println(exc);
        }
        

    }
}
