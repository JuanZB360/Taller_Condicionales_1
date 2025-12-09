package org.example;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            19.	Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
         */
        //decalracion de variables
        String r1, r2, r3, r4, r5;
        int puntos = 0;

        //evaluacion
        System.out.println("Responde las siguientes preguntas:");
        System.out.println("- ¿Cuál es el propósito principal de una variable en la programación?\n" +
                "a) Ejecutar una secuencia de instrucciones repetidamente. \nb) Almacenar un valor de forma temporal en la memoria para su posterior uso o modificación. \nc) Definir un bloque de código reusable para realizar una tarea específica. \nd) Realizar comparaciones entre dos valores diferentes.");
        r1 = input.nextLine();
        System.out.println("- ¿Cuál de las siguientes es la sintaxis correcta para declarar e inicializar una variable entera (int) llamada edad con el valor $25$ en Java? \na) edad = 25 \nb) int edad \nc) int edad = 25 \nd) edad int = 25;");
        r2 =input.nextLine();
        System.out.println("- ¿Qué tipo de dato primitivo en Java se usa exclusivamente para almacenar valores que son verdaderos (true) o falsos (false)?\n" +
                "a) int \nb) char \nc) String \nd) boolean");
        r3 = input.nextLine();
        System.out.println("- Un condicional (como el if o if-else en Java) es una estructura de control que se utiliza para:\n" +
                "a) Realizar cálculos matemáticos complejos. \nb) Definir un conjunto de valores fijos que no pueden cambiar. \nc) Ejecutar un bloque de código solo si una condición booleana específica resulta ser verdadera. \nd) Declarar múltiples variables de forma abreviada.");
        r4 = input.nextLine();
        System.out.println("- Dada la variable int puntos = 15;, ¿cuál es el resultado final de evaluar la siguiente condición: (puntos > 20) || (puntos != 10)?\n" +
                "a) true \nb) false \nc) Error de sintaxis \nd) 25");
        r5 = input.nextLine();

        //calcular nota b c d c a
        if (r1.equals("b")) {
            puntos = puntos + 5;
        }else if(r1.equals("a") || r1.equals("c") || r1.equals("d")){
            puntos = puntos - 1;
        }
        if (r2.equals("c")) {
            puntos = puntos + 5;
        }else if(r2.equals("a") || r2.equals("b") || r2.equals("d")){
            puntos = puntos - 1;
        }
        if (r3.equals("d")) {
            puntos = puntos + 5;
        }else if(r3.equals("a") || r3.equals("c") || r3.equals("b")){
            puntos = puntos - 1;
        }
        if (r4.equals("c")) {
            puntos = puntos + 5;
        }else if(r4.equals("a") || r4.equals("b") || r4.equals("d")){
            puntos = puntos - 1;
        }
        if (r5.equals("a")) {
            puntos = puntos + 5;
        }else if(r5.equals("b") || r5.equals("c") || r5.equals("d")){
            puntos = puntos - 1;
        }

        System.out.println("Resultado: "+puntos+" Puntos de 25");

        input.close();
    }
}
