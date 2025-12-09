package org.example;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            16.	Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d.
            El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia
            entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que
            tiempo (minutos) alcanzará el vehículo más rápido al otro.
         */

        //declarar variables
        double velocidad1, velocidad2, separacion, tiempo, h, m;

        //pedir datos al usuario
        System.out.println("Ingresa la velocidad de dos vehiculos y la distancia que los separa para calcular el tiempo \nen el que el vehiculo que esta mas atras alcansa al otro.");
        System.out.println("Ingresa la velocidad del vehiculo A (que esta adelnate):");
        velocidad1 = input.nextDouble();
        System.out.println("Ingresa la velocidad del vehiculo B (que esta atras):");
        velocidad2 = input.nextDouble();
        System.out.println("Ingresa la distancia entre ambos vehiculos:");
        separacion = input.nextDouble();

        boolean valido = true;
        while (valido){
            if(velocidad1 > velocidad2){
                System.out.println("La velocidad del vehiculo A no puede ser mayor a la del vehiculo B \npara que puedan alcansarse");
                System.out.println("Ingresa la velocidad del vehiculo A (que esta adelnate):");
                velocidad1 = input.nextDouble();
                System.out.println("Ingresa la velocidad del vehiculo B (que esta atras):");
                velocidad2 = input.nextDouble();
            }else{
                valido = false;
            }
        }

        tiempo = separacion / (velocidad2 - velocidad1);
        h = (int) tiempo;
        m = (tiempo - h) * 60;

        //entregar resultados
        System.out.println("Vehiculo A: "+velocidad1+"\nVehiculo B: "+velocidad2+"\nDistancia: "+separacion+
                "Tiempo que tarda el Vehiculo B en al cansar el Vehiculo B es de "+h+" Horas y "+m+" Minutos");

        input.close();
    }
}
