package org.example;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            20.	Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después de pedirnos cuantas monedas tenemos
            (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).
         */
        //declarar variables
        int dosEuros, unEuro, cuncuentaCentimos, veinteCentimos, diezCentimos, sumaCentimos, totalCentimos, totalEuros;

        System.out.println("Ingresa la cantidad de dinero que tienes: ");
        System.out.println("Cuantas monedas de 2 Euros tienes:");
        dosEuros = input.nextInt();
        System.out.println("Cuantas monedas de 1 Euro tienes:");
        unEuro = input.nextInt();
        System.out.println("Cuantas monedas de 50 Centimos tienes:");
        cuncuentaCentimos = input.nextInt();
        System.out.println("Cuantas monedas de 20 Centimos tienes:");
        veinteCentimos = input.nextInt();
        System.out.println("Cuantas monedas de 10 Centimos tienes:");
        diezCentimos = input.nextInt();

        //Calcular la cantidad de dinero
        sumaCentimos = (dosEuros * 200) + (unEuro + 100) +(cuncuentaCentimos * 50) + (veinteCentimos * 20) + (diezCentimos * 10);
        totalEuros = sumaCentimos / 100;
        totalCentimos = sumaCentimos % 100;

        //Respuesta
        System.out.println("la cantidad de dinero que tienes es de "+totalEuros+" Euros con "+totalCentimos+" Centimos.");

        input.close();
    }
}
