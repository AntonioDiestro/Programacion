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
        int cantidad = Math.abs(scan.nextInt());

        for (dinero = 0; dinero + 500 <= cantidad; dinero += 500) {
            billete500++;
        }for (; dinero + 200 <= cantidad; dinero += 200) {
            billete200++;
        }for (; dinero + 100 <= cantidad; dinero += 100) {
            billete100++;
        }for (; dinero + 50 <= cantidad; dinero += 50) {
            billete50++;
        }for (; dinero + 20 <= cantidad; dinero += 20) {
            billete20++;
        }for (; dinero + 10 <= cantidad; dinero += 10) {
            billete10++;
        }for (; dinero + 5 <= cantidad; dinero += 5) {
            billete5++;
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

        do{
            System.out.println(" Operaciones \n" +
                        "1. Sumar \n" +
                        "2. Restar; \n" +
                        "3. Multiplicar; \n" +
                        "4. Dividir (incluir manejo de división por 0); \n" +
                        "5. Salir ");

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la operacion ");
            String operacion = sc.nextLine();

            if (operacion == 5){
                break;
            }

            System.out.println("el primer numero: ");
            Double numero1 = sc.nextDouble();
            System.out.println("el segundo numero: ");
            Double numero2 = sc.nextDouble();

            switch (operacion) {

                case "1":
                    System.out.println("La suma es: " + (numero1 + numero2));
                        break;
                case "2":
                    System.out.println("La resta es: " + (numero1 - numero2));
                        break;
                case "3":
                    System.out.println("La multiplicacion es: " + (numero1 * numero2));
                        break;
                case "4":
                    System.out.println("La division es: " + (numero1 / numero2));
                        break;
                }
        }while ("operacion".equals("5"));
        }
    }