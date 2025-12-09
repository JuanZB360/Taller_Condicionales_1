package org.example;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            17.	Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la hora de llegada a la ciudad B.
         */
        //declaracion de variables
        int hhSalida, mmSalida, ssSalida, hhViaje, mmViaje, ssViaje;
        int horaFinal, minutoFinal, segundoFinal;
        long tiempoViaje;

        //pedir datos al usuario
        System.out.println("Un ciclista parte de una ciudad A a una ciudad B, Ingresa la hora de salida del ciclista de la ciudad A y \ncuanto tiempo tardaria en llegar a la ciudad B");
        System.out.println("Ingresa la hora de salida con minutos y segundos.");
        System.out.println("Ingresa la hora: ");
        hhSalida = input.nextInt();
        System.out.println("Ingresa los minutos: ");
        mmSalida = input.nextInt();
        System.out.println("Ingresa los segundos: ");
        ssSalida = input.nextInt();
        System.out.println("Ingresa cuantas horas, minutos y segundos dura el viaje.");
        System.out.println("Ingresa cuantas hora: ");
        hhViaje = input.nextInt();
        System.out.println("Ingresa cuantos minutos: ");
        mmViaje = input.nextInt();
        System.out.println("Ingresa cuantos segundos: ");
        ssViaje = input.nextInt();

        //calculo de hora
        tiempoViaje = ((long)hhSalida * 3600) + ((long)mmSalida * 60) + ssSalida +((long)hhViaje * 3600) + ((long)mmViaje * 60) + ssViaje;
        long segundosDia = tiempoViaje % 86400;
        int dias = (int) tiempoViaje / 86400;
        horaFinal = (int) (segundosDia / 3600);
        minutoFinal = (int) ((segundosDia % 3600) / 60);
        segundoFinal = (int) (segundosDia % 60);

        //resultado
        System.out.println("La salida fue a las "+hhSalida+" : "+mmSalida+" : "+ssSalida);
        System.out.println("Duracon del Viaje "+hhViaje+" : "+mmViaje+" : "+ssViaje);
        System.out.println("El viaje duro "+dias+"y la Hora de llegada "+horaFinal+" : "+minutoFinal+" : "+segundoFinal);

        input.close();
    }
}
