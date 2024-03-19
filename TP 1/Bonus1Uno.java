import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonus1Uno {
    public static void main(String[] args) {
        String dni, fechaCompra, horaCompra;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el DNI del cliente: ");
            dni = String.valueOf(entrada.readLine());

            System.out.println("Ingrese la fecha de la compra: ");
            fechaCompra = String.valueOf(entrada.readLine());

            System.out.println("Ingrese la hora de la compra: ");
            horaCompra = String.valueOf(entrada.readLine());

            System.out.println("------------------------------------------------------");
            System.out.println(fechaCompra + " - " + horaCompra + " Ticket Nro. 3455674");
            System.out.println("CUIT: 99-34567833-9");
            System.out.println("Cajero: Luis Mercado Caja: 8");
            System.out.println("DNI: " + dni + " 'El precio lo pone el cliente' ");
            System.out.println("------------------------------------------------------");

            // 04/04/23 - 18:55 Ticket Nro. 3455674
            // CUIT: 99-34567833-9
            // Cajero: Luis Mercado Caja: 8
            // DNI: 33.333.333 “El precio lo pone el cliente”

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
