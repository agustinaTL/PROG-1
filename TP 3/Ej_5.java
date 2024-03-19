/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal (MAIN) y cuando
termina imprimir por pantalla “terminó”. */


public class Ej_5 {
    
    public static final int MAX = 4;
    public static void main(String[]args) {
        iterador();
        termino();
    }
    
    public static void iterador() {
        int numero = 1;
        for (int i = numero; i <= MAX; i++) {
            imprimir(i);
        }
    }

    public static void imprimir(int i) {
        System.out.println("El número es: " + i);
    }

    public static void termino() {
        System.out.println("Terminó"); 
    }
}