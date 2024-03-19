import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej12 {
    public static void main(String[] args) {
        int numeroUno, numeroDos;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número entero:");
            numeroUno = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese un segundo número entero:");
            numeroDos = Integer.valueOf(entrada.readLine());

            int numUnoAux = numeroUno;
            int numUnoIncrementado = ++numUnoAux;

            int numDosAux = numeroDos;
            int numDosDecrementado = --numDosAux;

            System.out.println("El valor original del primer número fue : " + numeroUno +
                    ", y dicho valor incrementado es: " + numUnoIncrementado);
            System.out.println("El valor original del primer número fue : " + numeroDos +
                    ", y dicho valor decrementado es: " + numDosDecrementado);
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
}
