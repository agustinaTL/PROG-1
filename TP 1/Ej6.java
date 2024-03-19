import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej6 {
    public static void main(String[] args){
        char tipoFactura;
        int N;
        String nombre;
        String prod1;
        double importe1;
        String prod2;
        double importe2;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Ingrese el tipo de factura (en mayúscula): ");
            tipoFactura = entrada.readLine().charAt(0);

            System.out.println("Ingrese el número de la factura: ");
            N = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el nombre del cliente: ");
            nombre = entrada.readLine();

            System.out.println("Ingrese el primer producto comprado: ");
            prod1 = entrada.readLine();

            System.out.println("Ingrese el importe del mismo: ");
            importe1 = Double.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo producto comprado: ");
            prod2 = entrada.readLine();

            System.out.println("Ingrese el importe del mismo: ");
            importe2 = Double.valueOf(entrada.readLine());

            System.out.println("La factura completa se ve así: ");
            System.out.println("Factura     " + tipoFactura + "     N " + N);
            System.out.println("Nombre: " + nombre);
            System.out.println("Producto        Importe" );
            System.out.println(prod1 + "        " + importe1);
            System.out.println(prod2 + "        " + importe2);
            System.out.println("Importe total" + "      " + (importe1 + importe2));
        }
        catch (Exception exc){
            System.out.println(exc);
        }
    }
}
