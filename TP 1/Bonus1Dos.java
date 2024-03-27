Ejercicio sin IF:

package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ejercicio7 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    final int MONTO_MENOR_MARTES=13000;
    final int MONTO_JUEVES=25000;
    
    try{
      System.out.println("Ingrese el día de la semana"); //se ingresa el primer número
		int dia = Integer.valueOf(reader.readLine());
      
      System.out.println("Ingrese el total número");
		int total = Integer.valueOf(reader.readLine());
      
      boolean seAplicaDescuento=(((dia==1)&&(total>MONTO_MENOR_MARTES))||((dia==2)&&(total>MONTO_JUEVES)));
     System.out.println("El descuento es aplicable "+seAplicaDescuento);
     
    }
    catch(Exception exc){
      System.out.println("Error en los valores ingresados "+exc);
    }
  }
}

Ejercicio con IF:

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Bonus1Dos {
    public static void main(String[] args) {
        boolean dia;
        int compraUno, compraDos, compraTres, compraCuatro;
        int importeTotal;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Si el día de compra es martes ingrese 'true', si es jueves ingrese 'false': ");
            dia = Boolean.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe de la primer compra: ");
            compraUno = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe de la segunda compra: ");
            compraDos = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe de la tercer compra: ");
            compraTres = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe de la cuarta compra: ");
            compraCuatro = Integer.valueOf(entrada.readLine());

            importeTotal = compraUno + compraDos + compraTres + compraCuatro;

            if (dia && importeTotal > 13000) {
                System.out.println("Tiene un descuento del 5%");
            } else if (dia && importeTotal >= 20000) {
                System.out.println("Tiene un descuento del 7.5%"); // NO ME LO ESTÁ TOMANDO
            } else if (!dia && importeTotal > 25000) {
                System.out.println("Tiene un descuento del 10% con un reintegro de $3.000");
            } else {
                System.out.println("No tiene descuento");
            }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
