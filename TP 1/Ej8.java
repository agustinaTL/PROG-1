public class Ej8{
    public static void main(String[] args){
        System.out.println("Falso o verdadero es: " + (false || true));
        System.out.println("Falso o falso es: " + (false || false));
        System.out.println("Verdadero o verdadero es: " + (true || true));

        System.out.println("Falso y verdadero es: " + (false && true));
        System.out.println("Falso y falso es :" + (false && false));
        System.out.println("Verdadero y verdadero es: " + (true && true));
    }
}