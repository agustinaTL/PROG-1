import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ej4 {
    public static void main(String [] args){
        int cantidad;

        try{
            System.out.println("Ingrese la cantidad de valores enteros que incorporará por teclado: ");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            cantidad = Integer.valueOf(entrada.readLine());
            
            // Se crea un arreglo de int para almacenar los números ingresados:

            int [] numeros = new int [cantidad];

            // Se utiliza un bucle for para recorrer el arreglo y leer los números ingresados por el usuario:

            for(int i = 0; i < cantidad; i++){
                System.out.println("Ingrese el número " + (i + 1) + " : ");
                numeros[i] = Integer.valueOf(entrada.readLine());
            }

            // Se utiliza otro bucle for para recorrer el arreglo en orden inverso 
            // e imprimir los números ingresados:

            System.out.println("Los números ingresados en orden inverso se leen: ");
            for(int i = cantidad - 1; i >= 0; i--){
                System.out.println(numeros[i]);
            }

            // También podemos usar un bucle while para recorrer el arreglo en orden inverso:
            /*
            int i = cantidad - 1;

            System.out.println("Los números ingresados en orden inverso son: ");
            while (i >= 0) {
                System.out.println(numeros[i]);
                i--;
            }


            System.out.println ("Ingrese un valor entero: ");
            entero = Integer.valueOf(entrada.readLine());
            
            System.out.println ("Ingrese una cadena de caracteres: ");
            cadenaCaracteres = entrada.readLine();

            System.out.println ("Ingrese un valor con decimal (float): ");
            valorFlotante = Float.valueOf(entrada.readLine());

            System.out.println ("Ingrese un valor con decimal (double): ");
            valorDouble = Double.valueOf(entrada.readLine());

            System.out.println ("Ingrese un caracter: ");
            unCaracter = entrada.readLine().charAt(0);
            */
            
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        
    }
}
