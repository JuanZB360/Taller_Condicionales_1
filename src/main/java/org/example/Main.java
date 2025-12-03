package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            1.	Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
        */

        //declaracion de las variables de nombre y scanner para que el usuario ingrese la informacion
        String nombre;
        Scanner input = new Scanner(System.in);

        //solicitar al usuario que ingrese informacion
        System.out.println("Hola, ¿Como te llamas?");
        nombre = input.nextLine();

        //Resultado del ejercicio saludo con los datos ingresados por el usuario
        System.out.println("¡Hola "+nombre+" Bienvenido!");

        input.close();


    }
}