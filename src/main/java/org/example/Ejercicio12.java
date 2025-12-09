package org.example;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            12.	Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y
            muestra la distancia entre ellos.
        */

        //declara variables
        double x1, x2, y1, y2, distancia;

        //pedir datos al usuario
        System.out.println("Calculare la distancia entre dos puntos en el plano cartesiano que tu ingreses.");
        System.out.println("Ingresar el primer punto");
        System.out.println("Ubicacion del primer punto en el eje X: ");
        x1 = input.nextDouble();
        System.out.println("Ubicacion del primer punto en el eje Y: ");
        y1 = input.nextDouble();
        System.out.println("Ingresar el segundo punto");
        System.out.println("Ubicacion del segundo punto en el eje X: ");
        x2 = input.nextDouble();
        System.out.println("Ubicacion del segundo punto en el eje Y: ");
        y2 = input.nextDouble();

        //Calcular distancia
        distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        //Entregar respuesta al usuario
        System.out.println("La distancia entre el punto x1: "+x1+" y1: "+y1+" y el punto x2: "+x2+" y2: "+y2+" es de "+distancia);

        input.close();
    }
}
