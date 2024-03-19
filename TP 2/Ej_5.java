import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_5 {
    public static void main(String[]args) {
        int hora;
        int temperatura;
        char letra;

        try {
            // a. Si la hora está entre las 0 y las 5, pida ingresar la
            // temperatura y si la misma es menor a 20 grados imprima
            // “Encender la calefacción”. Si es mayor a 25, imprima
            // “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
            // “Calefacción encendida, no abra las ventanas!!!”

            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número de hora:");
            hora = Integer.valueOf(entrada.readLine());
            
            if(hora >= 0 && hora <= 5) {
                System.out.println("Ingrese la temperatura:");
                temperatura = Integer.valueOf(entrada.readLine());

                if (temperatura < 20) {
                    System.out.println("Encender la calefacción");
                } else if (temperatura > 25) {
                        System.out.println("Apagar calefacción");
                } else if (temperatura >= 20 && temperatura <= 25) {
                    System.out.println("Calefacción encendida, no abra las ventanas!!!");
                }
            }

            // b. Si la hora está entre las 6 y las 11, pida un carácter letra
            // minúscula y si es vocal imprima por la consola la cantidad de
            // vocales que tiene la palabra que corresponde con la hora.
            // Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
            // cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
            // tiene 2 consonantes

            if (hora >= 6 && hora <= 11) {
                System.out.println("Ingrese un carácter letra minúscula:");
                letra = entrada.readLine().charAt(0);

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    switch (hora) {
                        case 6: case 8: case 10: case 11: System.out.println("La hora tiene 2 vocales"); break;
                        default : System.out.println("La hora tiene 3 vocales"); break;
                    }
                } else {
                    System.out.println("La hora tiene 2 consonantes");
                }
            }

            // c. Si la hora está entre las 12 y 17 y es par, imprima el
            // promedio entre la hora ingresada y el límite inferior del
            // rango. Si la hora es impar debe imprimir el promedio entre la
            // hora ingresada y el límite superior del rango.

            if (hora >= 12 && hora <= 17 && hora % 2 == 0) {
                System.out.println("El promedio entre la hora y el límite inferior del rango es: " + ((hora + 12) / 2));
            } else if (hora >= 12 && hora <= 17 && hora % 2 != 0) {
                System.out.println("El promedio entre la hora y el límite superior del rango es: " + ((hora + 17) / 2));
            }

            //  Si la hora está entre las 18 y 23, pida ingresar una clave
            // numérica, si coincide con la clave almacenada previamente
            // en una constante, pida ingresar una segunda clave de
            // verificación (un valor entre 100 y 999). Para esta segunda
            // clave (que solo la conoce el usuario) se debe verificar que el
            // dígito de mayor peso (centena) es múltiplo del dígito de
            // mayor peso de la clave almacenada. Si todo esto se cumple
            // debería mostrar por la consola el mensaje “Clave correcta”.
            // Ejemplo: clave almacenada 364, clave ingresada 364,
            // segunda clave ingresada 698.

            final int claveNumAlmacenada = 364;
            int claveNumIngresada;
            int segundaClaveIngresada;

            if (hora >= 18 && hora <= 23) {
                System.out.println("Ingrese una clave numérica:");
                claveNumIngresada = Integer.valueOf(entrada.readLine());

                if (claveNumIngresada == claveNumAlmacenada) {
                    System.out.println("Ingrese una segunda clave (valor entre 100 y 999):");
                    segundaClaveIngresada = Integer.valueOf(entrada.readLine());

                    if ((segundaClaveIngresada / 100) % (claveNumAlmacenada / 100) == 0) {
                        System.out.println("Clave correcta");
                    }
                }
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}