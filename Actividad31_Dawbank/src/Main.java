import java.util.Scanner;


public class Main {
    static void main(String[] args) {

        int opcion = 0;

        do {

            IO.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n" +
                    "2. IBAN. Mostrará el IBAN.\n" +
                    "3. Titular. Mostrará el titular.\n" +
                    "4. Saldo. Mostrará el saldo disponible.\n" +
                    "5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.\n" +
                    "6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.\n" +
                    "7. Movimientos. Mostrará una lista con el historial de movimientos.\n" +
                    "8. Salir. Termina el programa.\n");

            Scanner sc = new Scanner(System.in);

            opcion = sc.nextInt(); //Recibimos la eleccion de usuario

            switch (opcion) { //Creamos el switch de eleccion

                case 1:
                    IO.println(getIBAN());

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:
                    IO.println("Cerrando programa...");

            }

        }while (opcion != 8) ;
    }
}