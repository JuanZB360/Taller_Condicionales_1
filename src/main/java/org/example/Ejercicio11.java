package org.example;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            11.	Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia,
            de modo que el resultado sea siempre positivo).
        */

        //declaracion de variables
        int n1, n2, dif;

        //pedir datos al usuario
        System.out.println("Encontrare el valor absoluto de la diferencia entre dos numeros que ingreses: ");
        System.out.println("Ingrese valor 1: ");
        n1 = input.nextInt();
        System.out.println("Ingrese valor 2");
        n2 = input.nextInt();

        //calcular valor absoluto de la diferencia entre los dos numeros
        dif = Math.abs(n1 - n2);

        //entregar resultado
        System.out.println("El numero 1 es "+n1+" el numero 2 es "+n2+" y la diferencia absoluta entre los dos numeros \nes "+dif);

        input.close();
    }
}
