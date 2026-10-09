import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static void main(String[] args) {

 /*   1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
    y luego muestre todos sus valores.*/
    IO.println("Ejercicio1");

    int array1 [] = new int [10];
    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < array1.length; i++){ //i empieza en 1, y va recorriendo todas las posiciones del array mientras i sea menor que la longitud del array, sumando de 1 en 1;
        System.out.println("Introduzca un numero: ");
        array1[i] = scan.nextInt(); // Va dando el valor del scanner a cada posicion del array;
    }

    IO.println(Arrays.toString(array1)); //Vemos el array como un String


    /* 2. Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores.*/

        IO.println("Ejercicio2");

        int array2 [] = new int [10];
        scan = new Scanner(System.in);

        int suma2 = 0; //Iniciar variable suma2

        for(int i = 0; i < array1.length; i++){
            System.out.println("Introduzca un numero: ");
            array2[i] = scan.nextInt(); //Dar el valor del scanner a cada celda del array;
            suma2 += array2[i]; //Añadir a la variable suma el valor de cada posicion del array;
        }
        IO.println("La suma total de los numeros del array es " + suma2);

/*3. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla  */

        IO.println("Ejercicio3");

        int array3 [] = new int [10];
        scan = new Scanner(System.in);

        for(int i = 0; i < array3.length; i++){
            System.out.println("Introduzca un numero: ");
            array3[i] = scan.nextInt(); //Dar el valor del scanner a cada celda del array;
        }
        Arrays.sort(array3);
        IO.println("El numero menor es " + array3[0]);
        IO.println("El numero mayor es " + array3[9]);

/*4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.*/
        IO.println("Ejercicio4");

        int array4 [] = new int [20];
        scan = new Scanner(System.in);
        int positivos = 0, negativos = 0; //Contador positivo y negativo;

        for(int i = 0; i < array4.length; i++){
            System.out.println("Introduzca un numero: ");
            array4[i] = scan.nextInt(); //Dar el valor del scanner a cada celda del array;
            if (array4[i] < 0 ){ //Si es menor que 0, lo sume al contador negativo;
                negativos += array4[i]; //Contador = a la suma de la celda
            }else{ //Si es mayor que 0 lo sume al contador positivo;
                positivos += array4[i]; //Contador = a la suma de la celda
            }
        }
        IO.println("la suma de los positivos es " + positivos);
        IO.println("La suma de los negativos es " + negativos);

/*5. Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.*/

        IO.println("Ejercicio5");

        int array5 [] = new int [20];
        scan = new Scanner(System.in);
        int suma5 = 0;
        int media = 0;

        for(int i = 0; i < array5.length; i++) {
            System.out.println("Introduzca un numero: ");
            array5[i] = scan.nextInt();
            suma5 += array5[i];
        }
        media = suma5 / array5.length;
        IO.println("La media de los numeros del array es " + media);

/*6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.*/
        IO.println("Ejercicio6");

        scan = new Scanner(System.in);
        IO.println("Introduce el valor N");
        int valorn6 = scan.nextInt();
        IO.println("Introduce el valor M");
        int valorm6 = scan.nextInt(); //Pedimos los valores de N y M y los almacenamos

        int array6 [] = new int [valorn6]; //Creamos el array con la longitud n
        Arrays.fill(array6, valorm6); //Rellenamos el array con el valor M
        IO.println(Arrays.toString(array6)); //Imprimimos el array de forma visible




    }
}


