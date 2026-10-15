import java.util.Scanner;

public class Main {
    static void main(String[] args) {

/*1. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos. */
        System.out.println("Ejercicio 1 ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad1 = scan.nextInt();

        if (edad1 > 18) {
            System.out.println("Eres mayor de edad");
        }

/*2. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.*/
        System.out.println("Ejercicio 2 ");

        scan = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad2 = scan.nextInt();

        if (edad2 < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
        ;

/*3. Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,  3... 20).*/
        System.out.println("Ejercicio 3 ");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

/*4. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2 */
        System.out.println("Ejercicio 4 ");

        for (int i = 2; i <= 200; i = i + 2) {
            System.out.println(i);
        }

/*5. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1.*/
        System.out.println("Ejercicio 5 ");

        for (int i = 2; i <= 200; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
/*6. Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado.*/
        System.out.println("Ejercicio 5 ");

        scan = new Scanner(System.in);
        System.out.println("Introduzca el numero final: ");
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

/*7. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.*/
        System.out.println("Ejercicio 7  ");


        scan = new Scanner(System.in);
        System.out.println("Introduzca la nota");
        int nota = scan.nextInt();

        if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 8) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }

/*8. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial: */

        System.out.println("Ejercicio 8  ");

        scan = new Scanner(System.in);
        System.out.println("Introduzca el numero del factorial ");
        int fac = scan.nextInt();
        int fac2 = 1;

        for (int i = 1; i <= fac; i++) {
            fac2 = fac2 * i;
            System.out.println("El factorial de" + fac + " es " + fac2);
        }

/*9. Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        transcurrido un segundo.*/
        System.out.println("Ejercicio 9  ");

        scan = new Scanner(System.in);
        System.out.println("Introduzca las horas ");
        int hor = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Introduzca los minutos ");
        int minu = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Introduzca los segundos ");
        int seg = scan.nextInt();

       seg = seg + 1;

        if (seg >= 60){
            seg = 0;
            minu = minu + 1;
            if ( minu >= 60){
                minu = 0;
                hor = hor + 1;
            }
        }

        System.out.println("La hora sumando 1 seg es " + hor + "H "+ minu + "M " + seg +"S");

/*10. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.*/
        System.out.println("Ejercicio 10  ");
        int contador = 0;
        int negativo10 = 0;

        while (contador <= 10) {
            scan = new Scanner(System.in);
            System.out.println("Introduzca un numero ");
            int num10 = scan.nextInt();
            if (num10 != 0) {
                contador++;
                if(num10 < 0){
                    negativo10++;
            }

            }
        }

        if (negativo10 > 0){
            System.out.println("Hay algun numero negativo ");
        } else { System.out.println("Todos los numeros son positivos ");
        }


/*11. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos*/

        System.out.println("Ejercicio 11  ");
        int num11 = 0;
        int positivos = 0;
        int negativos = 0;
        int contador11 = 0;

        while (contador11 <= 10) {
            scan = new Scanner(System.in);
            System.out.println("Introduzca un numero ");
            num11 = scan.nextInt();
            if (num11 != 0) {
                contador11++;
                if(num11 < 0){
                    negativos++;
                }else {
                    positivos++;
                };

            }
        }

        System.out.println("Hay " + positivos + " numeros positivos y " + negativos + " numeros negativos");

/*12. Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.*/

        System.out.println("Ejercicio 12  ");
        int num12 = 0;
        int positivos12 = 0;
        int negativos12 = 0;

        do{
            scan = new Scanner(System.in);
            System.out.println("Introduzca un numero ");
            num12 = scan.nextInt();

            if (num12 < 0){
                negativos12 = negativos12 + 1;
            } else if (num12 > 0){
                positivos12 = positivos12 + 1;
            }

        }while (num12 != 0);

        System.out.println("Hay " + positivos12 + " numeros positivos y " + negativos12 + " numeros negativos");

/*13. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números naturales.*/
        System.out.println("Ejercicio 13  ");

        double suma13 = 0;
        double multi13 = 1;
        for (int i = 1; i <= 10 ; i++) {
            suma13 = suma13 + i;
           multi13 = multi13 * i;
        }
        System.out.println("La suma de los 10 primeros numeros naturales es de " + suma13);
        System.out.println("El producto de los 10 primeros numeros naturales es de " + multi13);

/* 14. Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuestos son:
• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos.
                Escribir nombre, salario bruto, tasas y salario neto.*/
        System.out.println("Ejercicio 14  ");

        scan = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas ");
        int horas = Math.abs(scan.nextInt());

        scan = new Scanner(System.in);
        System.out.println("Introduzca el precio por hora ");
        double preciohora = Math.abs(scan.nextInt());
        double cotizar = 0;
        double cotizado = 0;
        double primerimpuesto = 0;
        double segundoimpuesto = 0;


        if (horas <= 35) {
            double normal = preciohora * horas;
            if (normal < 500) {
                System.out.println("Salario bruto: " + normal + "; salario neto: " + normal + "; tasas: a el 25%: " + primerimpuesto + " a el 45%: " + segundoimpuesto );
            } else if (normal >= 500 && normal <= 900) {
                cotizar = normal - 500;
                primerimpuesto = cotizar * 0.25;
                cotizado = normal - primerimpuesto;
                System.out.println("Salario bruto: " + normal + "; salario neto: " + cotizado + "; tasas: a el 25%: " + primerimpuesto + " a el 45%: " + segundoimpuesto  );
            } else if (normal > 900) {
                primerimpuesto = 400 * 0.25;
                segundoimpuesto = (normal - 900) * 0.45;
                cotizado = (normal - ( primerimpuesto + segundoimpuesto));
                System.out.println("Salario bruto: " + normal + "; salario neto: " + cotizado + "; tasas: a el 25%: " + primerimpuesto + " a el 45%: " + segundoimpuesto  );
            }
        } else if (horas > 35) {
            double normal = 35 * preciohora;
            double horasextra = horas - 35;
            double salario2 = horasextra * preciohora * 1.5;
            double salariototal = normal + salario2;
            if (salariototal < 500) {
                System.out.println("Salario bruto: " + salariototal + "; salario neto: " + salariototal + "; tasas: a el 25%: " + primerimpuesto + " a el 45%: " + segundoimpuesto  );
            } else if (salariototal >= 500 && salariototal <= 900) {
                cotizar = salariototal - 500;
                primerimpuesto = cotizar * 0.25;
                cotizado = (salariototal - primerimpuesto);
                System.out.println("Salario bruto: " + salariototal + "; salario neto: " + cotizado + "; tasas: a el 25%: " + primerimpuesto + " a el 45%: " + segundoimpuesto  );
            } else if (salariototal > 900) {
                primerimpuesto = 400 * 0.25;
                segundoimpuesto = (salariototal - 900) * 0.45;
                cotizado = (salariototal - (primerimpuesto + segundoimpuesto));
                System.out.println("Salario bruto: " + salariototal + "; salario neto: " + cotizado+ "; tasas: a el 25%: " + primerimpuesto + " a el 45%: " + segundoimpuesto );
            }

        }
    }
}

