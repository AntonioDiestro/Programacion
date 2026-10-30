import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;


public class Main {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        IO.println("Introduce la cantidad de numeros a almacenar");
        int longitudarray = sc.nextInt();

        double array[] = new double[longitudarray]; //Creamos el array con la longitud elegida
        int eleccion = 0;   //Inicializamos la variable eleccion

        do{

        IO.println("Selecciona una opcion \n" +
                "1 - Modificar colección: \n" +
                "2 - Estadísticas de la colección: \n" + //Mostramos menu de opciones
                "3 - Ampliar el valor de la colección \n" +
                "4 - Salir.");


        eleccion = sc.nextInt(); //Recibimos la eleccion de usuario

        switch (eleccion) { //Creamos el switch de eleccion

            case 1:
                IO.println("Selecciona una opcion \n" +
                        "1 - Insertar numero \n" +
                        "2 - Borrar numero \n" +
                        "3 - Modificar valor \n");
                int eleccion1 = sc.nextInt();
                if (eleccion1 == 1) {                                                        //Ponemos los diferentes if
                    IO.println("Elige la poscion del numero (contando la posicion 0)");
                    int posicion1 = sc.nextInt();                                            //Posicion del numero
                    IO.println("Elige el numero a introducir");
                    int numero1 = sc.nextInt();                                             //Numero que queremos
                    for (int i = 0; i < array.length; i++) {                                //Recorremos array
                        array[posicion1] = numero1;                                         //Ponemos el numero en la posicion
                    }
                    System.out.println(Arrays.toString(array));                             //Pintamos array
                    break;                                                                  //Rompemos el bucle
                }

                else if (eleccion1 == 2) {
                    IO.println("Elige la posicion del numero a eliminar (contando la posicion 0)");
                    int eliminar1 = sc.nextInt();
                    for (int i = 0; i < array.length; i++) {
                        array[eliminar1] = 0.0;                                           //Sustituimos el numero por 0 (numero por defecto)
                    }
                    System.out.println(Arrays.toString(array));
                    break;
                }

                else if (eleccion1 == 3) {
                    IO.println("Elige el numero a modificar");
                    int modificar1 = sc.nextInt();
                    IO.println("Elige la poscion del numero (contando la posicion 0)");
                    int posicionmod1 = sc.nextInt();
                    for (int i = 0; i < array.length; i++) {
                        array[posicionmod1] = modificar1;                                   //Sustituimos el numero por el elegido
                    }
                    System.out.println(Arrays.toString(array));
                    break;
                }
                else{
                    IO.println("Opcion no encontrada");
                    break;
                }

            case 2:
                IO.println("Selecciona una opcion \n" +
                        "1 - Media de los valores no nulos \n" +
                        "2 - Suma de todos los valores \n" + //Menu de opciones
                        "3 - Maximo de la coleccion \n" +
                        "4 - Minimo de la coleccion.");
                int eleccion2 = sc.nextInt();
                if (eleccion2 == 1) {
                    double suma = 0.0;
                    int contador = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] >= 1.0){
                        suma += array[i];                                   //Sumamos todos los numeros del array
                        contador++;                                 //Contamos los no nulos para no incluirlos en la media
                        }
                    }
                    double media = suma / contador; //Division del total entre los no nulos
                    IO.println("La media de los numeros es " + media);
                    break;
                }

                else if (eleccion2 == 2) {
                    double suma = 0.0;
                    for (int i = 0; i < array.length; i++) {
                        suma += array[i];                               //Sumamos todos los numeros del array
                    }
                    IO.println("La suma de los numeros es " + suma);
                    break;
                }

                else if (eleccion2 == 3) {
                    Arrays.sort(array);         //Ordenamos array
                    IO.println("El numero maximo es " + array[longitudarray - 1]); //Sacamos el mayor
                    break;
                }

                else if (eleccion2 == 4) {
                    Arrays.sort(array);
                    IO.println("El numero minimo es " + array[0]);
                    break;
                }

                else{
                    IO.println("Opcion no encontrada");
                    break;
                }

            case 3:

                IO.println("Introduza la nueva longitud del arrray");
                int nuevalongitud = sc.nextInt();

                if (nuevalongitud > array.length){ // Impedimos que reduzca el array

                    double nuevoarray[] = new double[nuevalongitud];
                    for (int i = 0; i < array.length; i++) {
                        nuevoarray[i] += array[i]; //Copiamos el anterior en el nuevo
                    }
                    array = nuevoarray; //Reemplazamos el array para quedarnos con el nomnbre anterior, para poder volver a ampliar
                    System.out.println(Arrays.toString(array));
                    break;
                }

                else {
                    IO.println("La nueva longitud debe ser mayor a la anterior"); //Por si introduce un numero menor
                    break;
                }
            case 4:
                IO.println("Cerrando programa...");
            default:
                IO.println("Introduzca un numero valido"); //Por si nos pone un numero distinto al permitido
                break;
            }


        }while (eleccion != 4); //Para cerrar programa si es igual a 4
    }
}