import Model.Genero;
import Model.Pelicula;

import java.util.Scanner;


void main() {

    int contadorvideoclubs = 0;

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
                    sc = new Scanner(System.in);
                    IO.println("Introduce el CIF");
                    String CIF = sc.nextLine();
                    sc = new Scanner(System.in);
                    IO.println("Introduce la Direccion");
                    String Direccion = sc.nextLine();

                    break;
                case 2:
                    sc = new Scanner(System.in);
                    IO.println("Introduce el ID");
                    int Id = sc.nextInt();
                    sc = new Scanner(System.in);
                    IO.println("Introduce el titulo");
                    String titulo = sc.nextLine();
                    titulo = titulo.toUpperCase();
                    IO.println("Introduce el Genero (Terror, Aventura");
                    String generoTexto = sc.nextLine();
                    Genero Genero = Model.Genero.valueOf(generoTexto.toUpperCase());
                    VideoDaw.PeliculasRegistradas[VideoDaw.contadorpelis] = new Pelicula(Id,titulo,Genero);

                    break;

                case 3:
                    sc = new Scanner(System.in);
                    IO.println("Introduce el ID");
                    Id = sc.nextInt();
                    for (int i=0; i < VideoDaw.PeliculasRegistradas.length; i++ ){
                        if (VideoDaw.PeliculasRegistradas.length[i] == Id){
                        };

                    };

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



