package org.example;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            13.	Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
            PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se puede
            calcular?
         */

        //declaracion de la variables
        double num, raizCuadrada, raizCubica;

        //pedir datos
        System.out.println("cualcular raiz cuadrada y cubica de un numero.");
        System.out.println("Ingresa el numero:");
        num = input.nextDouble();

        //calulos
        raizCuadrada = Math.sqrt(num);
        raizCubica = Math.cbrt(num);

        //entrega del resultado
        System.out.println("Del numero que ingresaste "+num+" la Raiz Cuadrada es "+raizCuadrada+" y Cubica "+raizCubica);

        input.close();
    }
}
