package org.example;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            15.	Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que
            intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
         */

        //declarar variables
        int var1, var2, var3;

        //perdir datos al usuario
        System.out.println("Ingresaras dos varolores que se almacenaran en las variables A y B, el programa " +
                "\ncambiara los valores y la variable A tendra el valor de B y la variable B tendra el valor de A.");
        System.out.println("Ingresa variable A:");
        var1 = input.nextInt();
        System.out.println("Ingresa variable B:");
        var2 = input.nextInt();

        //operacion de intercambio
        System.out.println("variable A: "+var1+"\nvariable B: "+var2);
        var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println("Intercambio de variables \nvariable A: "+var1+"\nvariable B: "+var2);

        input.close();
    }
}
