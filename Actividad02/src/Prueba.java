import java.util.Scanner;

public class Prueba {
    static void main(String[] args) {
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

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas ");
        int horas = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Introduzca el precio por hora ");
        int preciohora = scan.nextInt();
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

