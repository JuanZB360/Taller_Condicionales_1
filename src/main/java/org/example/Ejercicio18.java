package org.example;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            18.	Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
         */

        //declarar variables
        String nombreCompleto;

        System.out.println("Ingresa tu nombre completo");
        nombreCompleto = input.nextLine();

        for (int j = 0; j < nombreCompleto.length(); j++) {
            String letra = "" + nombreCompleto.charAt(j);
            if (letra.equals(" ")) {
                System.out.println(nombreCompleto.charAt(j+1));
            }
        }

        input.close();
    }
}
