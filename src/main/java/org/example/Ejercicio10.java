package org.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            10.	Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación
            se compone de los siguientes porcentajes:
            •	55% del promedio de sus tres calificaciones parciales.
            •	30% de la calificación del examen final.
            •	15% de la calificación de un trabajo final.
            El programa debe solicitar las tres notas obtenidas por el estudiante y según la nota debe mostrar lo
            siguiente de
            0 – 3 deficiente
            3.1 – 4 suficiente
            4.1 – 5 sobresaliente
         */

        //declaracion de variables
        double cali1, cali2, cali3, examenFinal, trabajoFinal, notaFinal;
        String desempeno;

        //solicitar datos
        System.out.println("Calculare la nota final que tendras en la materia de algoritmos \n segun el promedio de las tres calificaciones parciales \nla nota del examen final y del trabajo final");
        System.out.println("calificacion 1: ");
        cali1 = input.nextDouble();
        System.out.println("calificacion 2: ");
        cali2= input.nextDouble();
        System.out.println("calificacion 3: ");
        cali3 = input.nextDouble();
        System.out.println("Nota del Examen Final: ");
        examenFinal = input.nextDouble();
        System.out.println("Nota Trabajo Final: ");
        trabajoFinal = input.nextDouble();

        //calculo de nota final
        notaFinal = (((cali1+cali2+cali3)/3)*0.55)+(examenFinal*0.30)+(trabajoFinal*0.15);

        if(notaFinal<=3.0){
            desempeno = "Deficiente.";
        } else if (notaFinal<=4.0) {
            desempeno = "Suficiente.";
        }else{
            desempeno = "SobreSaliente.";
        }

        //Entrega del resultado
        System.out.println("Tu nota final es "+notaFinal+" Tu desempeño ha sido "+desempeno);

        input.close();
    }
}
