public class Parcial {

    final static int MAX=20,SEPARADOR=0,X=3;
    public static void main (String[] args){
// PUNTO 1
    int[] arregloImagen={0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,33,0,5,98,0};
    mostrarArreglo(arregloImagen);
    procesar(arregloImagen);
    mostrarArreglo(arregloImagen);
    }
    
    public static void procesar(int[] arregloImagen) {
    int inicio=0,fin=-1;
    while (inicio<MAX){
        inicio=buscarIni(arregloImagen, fin+1);
        if (inicio<MAX){
            fin=buscarFin(arregloImagen,inicio);
            if (fin-inicio+1>X && sonTodosIguales(arregloImagen,inicio,fin)){
                comprimir(arregloImagen, inicio,fin);
                fin=inicio+2;
            }
        }
    }
    }

    public static void comprimir(int[] arregloImagen, int inicio, int fin) {
    int tamanio=fin-inicio+1;
    while (inicio<fin-1){
        correrAIzquierda(arregloImagen,inicio);
        fin--;
    }
    arregloImagen[inicio]=-1*(tamanio);
    }

    public static void correrAIzquierda(int[] arr, int pos) {
    for (int i = pos; i < MAX - 1; i++)
    arr[i] = arr[i + 1];
    }
    
    public static boolean sonTodosIguales(int[] arregloImagen, int inicio, int fin) {
    while (inicio<fin && arregloImagen[inicio]==arregloImagen[inicio+1]){
    inicio++;
    }
    return (inicio==fin);
    }

    public static int buscarIni(int[] arrEnteros, int ini) {
    while (ini<MAX && arrEnteros[ini]==SEPARADOR)
    ini++;
    return ini;
    }
    public static int buscarFin(int[] arrEnteros, int ini) {
    while (ini<MAX && arrEnteros[ini]!=SEPARADOR)
    ini++;
    return ini-1;
    }

    public static void mostrarArreglo(int[] arr){
    for (int i=0;i<MAX;i++)

    System.out.print(arr[i] + "|");
    System.out.println("");
    }
}