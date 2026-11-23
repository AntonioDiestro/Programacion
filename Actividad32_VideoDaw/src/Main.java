import java.util.Scanner;


void main() {

    final String ComprobarCIF = "[A-Z]{1}[0-9]{8}";

        int opcion = 0;

        do {

            IO.println("1. Crear y registrar VideoClub en la franquicia.\n" +
                    "2. Registrar película en videoclub.\n" +
                    "3. Crear y registrar cliente en videoclub.\n" +
                    "4. Alquilar película.\n" +
                    "5. Devolver película.\n" +
                    "6. Dar de baja cliente.\n" +
                    "7. Dar de baja película.\n" +
                    "8. Salir. Termina el programa.");

            Scanner sc = new Scanner(System.in);

            opcion = sc.nextInt(); //Recibimos la eleccion de usuario

            switch (opcion) { //Creamos el switch de eleccion

                case 1:
                    Scanner sc = new Scanner(System.in);
                    sc = new Scanner(System.in);
                    break;



                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:
                    IO.println("Cerrando programa...");

            }

        }while (opcion != 8) ;
    }


