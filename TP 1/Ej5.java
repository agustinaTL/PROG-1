import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej5 {
    public static void main(String[] args){
        String nombre;
        int edad;
        double altura;
        String ocupacion;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese nombre: ");
            nombre = entrada.readLine();
            if(nombre != ""){
                System.out.println("Error. Ingrese texto en el campo");
                nombre = entrada.readLine();
            }

            System.out.println("Ingrese edad: ");
            edad = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese altura: ");
            altura = Double.valueOf(entrada.readLine());

            System.out.println("Ingrese ocupación: ");
            ocupacion = entrada.readLine();

            System.out.println("Los datos ingresados son:");
            System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Altura: " + altura + ", Ocupación: " + ocupacion);

        }
        catch(Exception exc){
            System.out.println(exc);
        }
    
    }
}
