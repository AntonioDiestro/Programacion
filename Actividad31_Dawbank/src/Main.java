import model.Cuentas;
import model.Movimiento;
import model.Movimientos;

import java.util.Scanner;


public class Main {

    static Cuentas C1 = new Cuentas("C1","ES3754267835826845737313", "Asier Villalibre");
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
                    IO.println(C1.getCuentas());
                    break;

                case 2:
                    IO.println(C1.getIBAN());
                    break;

                case 3:
                    IO.println(C1.getTitular());
                    break;

                case 4:
                    IO.println(C1.getSaldo());
                    break;

                case 5:

                    sc = new Scanner(System.in);
                    IO.println("Introduce el numero de la cuenta");
                    String Cuentaingreso = sc.nextLine();

                    IO.println("Introduce la cantidad a ingresar");
                    int Cantingreso = sc.nextInt();

                    Movimientos M1 = new Movimientos(Cuentaingreso, Cantingreso);
                    Cuentas.Saldo += Cantingreso;
                    break;

                case 6:

                case 7:

                case 8:
                    IO.println("Cerrando programa...");

            }

        }while (opcion != 8) ;
    }




}