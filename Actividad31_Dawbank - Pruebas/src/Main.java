import model.Cuentas;
import model.Movimientos;

import java.util.Scanner;


public class Main {

    static Cuentas C1 = new Cuentas("C1","ES3754267835826845737313", "Asier Villalibre");
    static Cuentas C2 = new Cuentas("C2","ES2254151541551512315415", "Iñigo Vicente");
    static Cuentas C3 = new Cuentas("C3","ES1518148456154184184841", "Ivan Martin");
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        IO.print("Introduce el numero de cuenta");
        Cuentas cuenta = C2;
        int seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                cuenta = C1;
                break;

            case 2:
                cuenta = C2;
                break;

            case 3:
                cuenta = C3;
                break;

            default:
                IO.println("Cuenta no válida");
        }

    IO.println("Introduce el numero de cuenta");

    do {

        IO.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n" +
                "2. IBAN. Mostrará el IBAN.\n" +
                "3. Titular. Mostrará el titular.\n" +
                "4. Saldo. Mostrará el saldo disponible.\n" +
                "5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.\n" +
                "6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.\n" +
                "7. Movimientos. Mostrará una lista con el historial de movimientos.\n" +
                "8. Salir. Termina el programa.\n" +
                "9. Cambiar de cuenta\n");



        opcion = sc.nextInt(); //Recibimos la eleccion de usuario

        switch (opcion) { //Creamos el switch de eleccion

            case 1:
                IO.println(cuenta.getCuentas());
                break;

            case 2:
                IO.println(cuenta.getIBAN());
                break;

            case 3:
                IO.println(cuenta.getTitular());
                break;

            case 4:
                IO.println(cuenta.getSaldo());
                break;

            case 5:
                cuenta.Ingresar(cuenta);
                break;

            case 6:
                cuenta.Retirar(cuenta);
                break;

            case 7:
                cuenta.mostrarMovimientos();
                break;

            case 8:
                IO.println("Cerrando programa...");
                break;

            case 9:
                sc = new Scanner(System.in);
                IO.print("Introduce el numero de cuenta");
                seleccion = sc.nextInt();
                switch (seleccion){
                    case 1:
                        cuenta = C1;
                        break;

                    case 2:
                        cuenta = C2;
                        break;

                    case 3:
                        cuenta = C3;
                        break;

                    default:
                        IO.println("Cuenta no válida");
                        break;
                }
                break;
        }

    } while (opcion != 8);

    }




}