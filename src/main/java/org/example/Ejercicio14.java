package org.example;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            14.	Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. Ejemplo,
            si se introduce 23 que muestre 32.
         */

        //declaracion de variables
        int numNormal, primernum, segundonum, numAlRevez;

        //pedri datos
        System.out.println("Ingresa un numero de dos cifras");

        numNormal = input.nextInt();
        boolean valido = true;
        while (valido){
            if (numNormal > 0 && numNormal < 100){
                valido = false;
            } else {
                System.out.println("El numero es invalido debe tener dos cifras \nIngresa otro numero");
                numNormal = input.nextInt();
            }
        }

        segundonum = numNormal % 10;
        primernum = numNormal / 10;

        numAlRevez = (segundonum * 10) + segundonum;

        input.close();
    }

}
