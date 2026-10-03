import java.util.Scanner;

public class prueba {
    static void main(String[] args) {

        int operacion = 0;

        do{
            System.out.println(" Operaciones " +
                    "1. Sumar \n" +
                    "2. Restar; \n" +
                    "3. Multiplicar; \n" +
                    "4. Dividir (incluir manejo de división por 0); \n" +
                    "5. Salir ");

            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce la operacion ");
            operacion = scan.nextInt();

            if (operacion == 5){
                break;
            }

            scan = new Scanner(System.in);
            System.out.println("el primer numero: ");
            double numero1 = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.println("el segundo numero: ");
            double numero2 = scan.nextInt();

            switch (operacion) {

                case 1:
                    double suma = numero1 + numero2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    double rest = numero1 - numero2;
                    System.out.println("La resta es: " + rest);
                    break;
                case 3:
                    double multi = numero1 * numero2;
                    System.out.println("La multiplicacion es: " + multi);
                    break;
                case 4:
                    double div = numero1 / numero2;
                    System.out.println("La division es: " + div);
                    break;
            }
        }while (operacion != 5);
    }
}




