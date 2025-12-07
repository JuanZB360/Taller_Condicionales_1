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

        /*
            2.	Calcular el perímetro y área de un rectángulo dada su base y su altura.
        */
        //Declaracion de variables para pedir la longitud de los lados del triangulo que desea el usuario
        double base, altura, hipotenusa, area, perimetro;

        //solicutud al usuario para que ingrese los datos
        System.out.println(nombre+" ahora calcularemos el perimetro y area de un triangulo rectangulo \nIngresa la longitud de la base: ");
        base = input.nextDouble();
        System.out.println("Ingresa la longitud de la altura: ");
        altura = input.nextDouble();

        //operaciones matematicas para el perimetro
        hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
        perimetro = base + altura + hipotenusa;

        //operaciones matematicas para sacar el area de un triandgulo con la formula de Herón
        area = (base * altura)/2;

        System.out.println("Hola "+nombre+" el perimetro de tu triangulo rectangulo es de "+perimetro+" y el area es de "+area+" ¡Excelente no!");

        input.close();

        /*
            3.	Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
        */
        //Declaracion de variables
        double catetoA, catetoB, hipo;

        //Solicitud de informacion al usuario
        System.out.println("Hola "+nombre+" ahora te ayudare a hallar la hipotenusa del triangulo rectangulo que tienes " +
                "\n ahora ingresa la longitud del cateto A: ");
        catetoA = input.nextDouble();
        System.out.println("Ingresa la longitud del cateto B: ");
        catetoB = input.nextDouble();

        //Calculos matematicos teorema de pitagoras
        hipo = Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));


        //Resultado
        System.out.println("Ya esta listo el resultado "+nombre+" la longitud de la hipotenusa del triangulo que tienes \nes de "+hipo);

        input.close();


         /*
            4.	Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
        */
        //declaracion de variables
        double num1, num2, sum, res, div, mul;

        //solicitud de datos al usuario
        System.out.println("¡¡hola "+nombre+" ahora relizare por ti las operaciones matematicas basicas a dos numeros que tu ingreses!!");
        System.out.println("Ingresa el primer numero: ");
        num1 = input.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        num2 = input.nextDouble();

        //operaciones matematicas
        sum = num1+num2;
        res = num1-num2;
        mul = num1*num2;
        div = num1/num2;

        //mostrar resultados
        System.out.println("SUMA \n"+num1+" + "+num2+" = "+sum+"\nRESTA\n"+num1+" - "+num2+" = "+res+
                "\nMULTIPLICACION\n"+num1+" * "+num2+" = "+mul+"\nDIVISION\n"+num1+" / "+num2+" = "+div);

        input.close();

        /*
            5.	Escribir un programa que convierta un valor dado en grados Fahrenheit
            a grados Celsius. Recordar que la fórmula para la conversión es:
	        C = (F-32)*5/9
        */

        //Declaro las variables
        float celcius, Fahrenheit;

        //solicitar datos al usuario
        System.out.println(nombre+" convertire los grados Fahrenheit a celcius: ");
        System.out.println("Ingrsa los grados Fahrenheit:");
        Fahrenheit = input.nextFloat();

        //convierto a celcius
        celcius = (Fahrenheit-32)*5/9;

        //Respuesta del la conversion
        System.out.println(nombre+" Increible los grados "+Fahrenheit+" Fahrenheit equivalen \na "+celcius+" Celcius, increible!");

        input.close();

        /*
            6.	Calcular la media de tres números pedidos por teclado.
         */
        //Declaracion de las variables
        double numero1, numero2, media;

        //pedir los datos al usuario
        System.out.println("Hola "+nombre+" ahora calculare la media \nde dos numeros que tu desees!");
        System.out.println("Ingresa el primer numero: ");
        numero1 = input.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = input.nextDouble();

        //calcular la media
        media = (numero1 + numero2) / 2;

        //entrega del resultado
        System.out.println("Interesante "+nombre+" la media de los numeros \nque ingresaste es "+media+" super no!?");

        /*
            7.	Realiza un programa que reciba una cantidad
            de minutos y muestre por pantalla a cuantas horas
            y minutos corresponde. Por ejemplo: 1000 minutos
            son 16 horas y 40 minutos.
         */

        //decalaracion de las variables
        double minutos, horaConDecimal, minutosConDecimal;
        int hora, minutosTotales;

        //pedir datos al usuario
        System.out.println(nombre+" ingresa la cantidad de minutos que quieres convertir a horas:");
        minutos = input.nextDouble();

        //Operaciones para convertir de minutos a horas

        horaConDecimal = minutos / 60;
        hora = (int) horaConDecimal;
        minutosConDecimal = (horaConDecimal - hora) * 60;
        minutosTotales = (int) minutosConDecimal;

        //Entraga de Resultado
        System.out.println("los "+minutos+" que ingresaste equivalen \na "+hora+" con "+minutosTotales+" minutos");


    }
}