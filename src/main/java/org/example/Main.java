package org.example;

import java.util.ArrayList;
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

        input.close();

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

        input.close();

        /*
            8.	Un vendedor recibe un sueldo base mas un 10% extra por comisión
            de sus ventas, el vendedor desea saber cuanto dinero obtendrá por
            concepto de comisiones por las tres ventas que realiza en el mes y
            el total que recibirá en el mes tomando en cuenta su sueldo base y
            comisiones.
         */

        double sueldoBase = 1600000;
        ArrayList<Double> ventas = new ArrayList<>();
        double venta, comicion = 0, total;

        //pedir datos al usuarios
        boolean confirmacion = true;
        int i = 0;

        while (confirmacion){
            System.out.println("Ingresa el valor de la venta "+ (i+1) +" :");
            venta = input.nextDouble();
            ventas.add(venta);

            System.out.println("Deseas agregar otra venta 'si' o 'no' : ");
            String nuevoIngreso = input.nextLine();
            if (nuevoIngreso.equals("no")){
                confirmacion = false;
            }
        }

        //operaciones para entregar resultados
        for(Double ven:ventas){
            comicion = comicion + ven;
        }

        System.out.println("tus ventas son de "+comicion);
        comicion=comicion*0.10;
        System.out.println("la comicion por tu ventas es de "+comicion);
        System.out.println("y tu sueldo base es de "+sueldoBase);

        input.close();


        /*
            9.	Una tienda ofrece un descuento del 15% sobre el total de la compra y
            un cliente desea saber cuanto deberá pagar finalmente por su compra.
         */

        //declaracion de variables
        double descuento, valorCompra;

        //pedir datos al usuario
        System.out.println("Hola "+nombre+" acabas de realizar una compra \ny te haran un descuento del 15% sobre el costo total \nyo te ayudare a calcular el valor de tu descuento.");
        System.out.println("¿Cuanto es el valor de tu compra?");
        valorCompra = input.nextDouble();

        //realizar la operacion para calcular el descuento
        descuento = valorCompra * 0.15;

        //Entregar la respuesta al usuario
        System.out.println("El descuento que recibiras por tu compra es de "+descuento);

        input.close();

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
        System.out.println(nombre+" calculare la nota final que tendras en la materia de algoritmos \n segun el promedio de las tres calificaciones parciales \nla nota del examen final y del trabajo final");
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

        /*
            11.	Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia,
            de modo que el resultado sea siempre positivo).
        */

        //declaracion de variables
        int n1, n2, dif;

        //pedir datos al usuario
        System.out.println(nombre+" Encontrare el valor absoluto de la diferencia entre dos numeros que ingreses: ");
        System.out.println("Ingrese valor 1: ");
        n1 = input.nextInt();
        System.out.println("Ingrese valor 2");
        n2 = input.nextInt();

        //calcular valor absoluto de la diferencia entre los dos numeros
        dif = Math.abs(n1 - n2);

        //entregar resultado
        System.out.println("El numero 1 es "+n1+" el numero 2 es "+n2+" y la diferencia absoluta entre los dos numeros \nes "+dif);







    }
}