import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        IO.println("Ejercicio 1");
        int billete5 = 0;
        int billete10 = 0;
        int billete20 = 0;
        int billete50 = 0;
        int billete100 = 0;
        int billete200 = 0;
        int billete500 = 0;
        int dinero = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca la cantidad: ");
        int cantidad = scan.nextInt();

        for (dinero = 0; dinero + 500 <= cantidad; dinero += 500) {
            billete500 = billete500 + 1;
        } for (; dinero + 200 <= cantidad; dinero += 200) {
            billete200 = billete200 + 1;
        }for (; dinero + 100 <= cantidad; dinero += 100) {
            billete100 = billete100 + 1;
        } for (; dinero + 50 <= cantidad; dinero += 50) {
            billete50 = billete50 + 1;
        }for (; dinero + 20 <= cantidad; dinero += 20) {
            billete20 = billete20 + 1;
        }for (; dinero + 10 <= cantidad; dinero += 10) {
            billete10 = billete10 + 1;
        }for (; dinero + 5 <= cantidad; dinero += 5) {
            billete5 = billete5 + 1;
        }

        System.out.println("Se ha utilizado:\n" +
                "        billete de 5 = " + billete5 +"\n" +
                "        billete de 10 = " + billete10 +"\n" +
                "        billete de 20 = " + billete20 +"\n" +
                "        billete de 50 = " + billete50 +"\n" +
                "        billete de 100 = " + billete100 +"\n" +
                "        billete de 200 = " + billete200 +"\n" +
                "        billete de 500 = " + billete500 +"\n" );

      /*2. Realiza un programa que muestre un menú de opciones como el siguiente:
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir (incluir manejo de división por 0)
        5. Salir
        El menú debe de repetirse hasta que se escoja la opción 5 (Salir)*/
        IO.println("Segundo ejercicio");

        int operacion = 0;
        do {
        System.out.println(" Operaciones \n"+
        "1. Sumar \n" +
        "2. Restar; \n" +
        "3. Multiplicar; \n" +
        "4. Dividir (incluir manejo de división por 0); \n" +
        "5. Salir ");

        scan = new Scanner(System.in);
        System.out.println("Introduce la operacion ");
        operacion = scan.nextInt();

            switch (operacion) {
                case 1:
                    scan = new Scanner(System.in);
                    System.out.println("el primer numero: ");
                    double numero1 = scan.nextInt();
                    scan = new Scanner(System.in);
                    System.out.println("el segundo numero: ");
                    double numero2 = scan.nextInt();
                    double suma = numero1 + numero2;
                    System.out.println("La suma es: " + suma);
                    break;

                case 2:
                    scan = new Scanner(System.in);
                    System.out.println("el primer numero: ");
                    numero1 = scan.nextInt();
                    scan = new Scanner(System.in);
                    System.out.println("el segundo numero: ");
                    numero2 = scan.nextInt();
                    double rest = numero1 - numero2;
                    System.out.println("La resta es: " + rest);
                    break;

                case 3:
                    scan = new Scanner(System.in);
                    System.out.println("el primer numero: ");
                    numero1 = scan.nextInt();
                    scan = new Scanner(System.in);
                    System.out.println("el segundo numero: ");
                    numero2 = scan.nextInt();
                    double multi = numero1 * numero2;
                    System.out.println("La multiplicacion es: " + multi);
                    break;

                case 4:
                    scan = new Scanner(System.in);
                    System.out.println("el primer numero: ");
                    numero1 = scan.nextInt();
                    scan = new Scanner(System.in);
                    System.out.println("el segundo numero: ");
                    numero2 = scan.nextInt();
                    double div = numero1 / numero2;
                    System.out.println("La division es: " + div);
                    break;

                case 5:
                    break;
            }
        }while(operacion != 5);
        }
    }