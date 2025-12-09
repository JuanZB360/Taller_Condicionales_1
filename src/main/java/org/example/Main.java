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

        input.close();

        /*
            12.	Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y
            muestra la distancia entre ellos.
        */

        //declara variables
        double x1, x2, y1, y2, distancia;

        //pedir datos al usuario
        System.out.println(nombre+" calculare la distancia entre dos puntos en el plano cartesiano que tu ingreses.");
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

        /*
            13.	Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
            PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se puede
            calcular?
         */

        //declaracion de la variables
        double num, raizCuadrada, raizCubica;

        //pedir datos
        System.out.println("cualcular raiz cuadrada y cubica de un numero.");
        System.out.println("Ingresa el numero:");
        num = input.nextDouble();

        //calulos
        raizCuadrada = Math.sqrt(num);
        raizCubica = Math.cbrt(num);

        //entrega del resultado
        System.out.println("Del numero que ingresaste "+num+" la Raiz Cuadrada es "+raizCuadrada+" y Cubica "+raizCubica);

        input.close();

        /*
            14.	Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. Ejemplo,
            si se introduce 23 que muestre 32.
         */

        //declaracion de variables
        int numNormal, primernum, segundonum, numAlRevez;

        //pedri datos
        System.out.println("Ingresa un numero de dos cifras");

        numNormal = input.nextInt();
        boolean valido = true;
        while (valido){
            if (numNormal > 0 && numNormal < 100){
                valido = false;
            } else {
                System.out.println("El numero es invalido debe tener dos cifras \nIngresa otro numero");
                numNormal = input.nextInt();
            }
        }

        segundonum = numNormal % 10;
        primernum = numNormal / 10;

        numAlRevez = (segundonum * 10) + segundonum;

        input.close();

        /*
            15.	Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que
            intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
         */

        //declarar variables
        int var1, var2, var3;

        //perdir datos al usuario
        System.out.println(nombre+" Ingresaras dos varolores que se almacenaran en las variables A y B, el programa " +
                "\ncambiara los valores y la variable A tendra el valor de B y la variable B tendra el valor de A.");
        System.out.println("Ingresa variable A:");
        var1 = input.nextInt();
        System.out.println("Ingresa variable B:");
        var2 = input.nextInt();

        //operacion de intercambio
        System.out.println("variable A: "+var1+"\nvariable B: "+var2);
        var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println("Intercambio de variables \nvariable A: "+var1+"\nvariable B: "+var2);

        input.close();

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

        valido = true;
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






    }
}