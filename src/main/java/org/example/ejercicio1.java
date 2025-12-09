package org.example;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        /*
            2.	Calcular el perímetro y área de un rectángulo dada su base y su altura.
        */
        //Declaracion de variables para pedir la longitud de los lados del triangulo que desea el usuario
        double base, altura, hipotenusa, area, perimetro;
        Scanner input = new Scanner(System.in);

        //solicutud al usuario para que ingrese los datos
        System.out.println(" ahora calcularemos el perimetro y area de un triangulo rectangulo \nIngresa la longitud de la base: ");
        base = input.nextDouble();
        System.out.println("Ingresa la longitud de la altura: ");
        altura = input.nextDouble();

        //operaciones matematicas para el perimetro
        hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
        perimetro = base + altura + hipotenusa;

        //operaciones matematicas para sacar el area de un triandgulo con la formula de Herón
        area = (base * altura)/2;

        System.out.println("El perimetro de tu triangulo rectangulo es de "+perimetro+" y el area es de "+area+" ¡Excelente no!");

        input.close();
    }
}
