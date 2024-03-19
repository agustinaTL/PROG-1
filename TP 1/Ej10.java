import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej10 {
    public static void main(String[] args){
        int numeroUno, numeroDos;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el primer valor entero:");
            numeroUno = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo valor entero:");
            numeroDos = Integer.valueOf(entrada.readLine());

            if(numeroUno > numeroDos){
            System.out.println("El primer número " + numeroUno + " es mayor al segundo número " + numeroDos);
            } else{
            System.out.println("El primer número es menor al segundo.");
            }

            if(numeroUno % 2 == 0 && numeroDos % 2 == 0){
            System.out.println("Ambos números ingresados son múltiplos de 2.");
            } else{
            System.out.println("Al menos un número ingresado no es múltiplo de 2.");
            }

        }
        catch(Exception exc){
            System.out.println(exc);
        }
        


    }
}
