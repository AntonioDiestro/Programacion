import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

/*   1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.*/

        IO.println("Ejercicio1");

        int array1[] = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) { //i empieza en 1, y va recorriendo todas las posiciones del array mientras i sea menor que la longitud del array, sumando de 1 en 1;
            System.out.println("Introduzca un numero: ");
            array1[i] = scan.nextInt(); // Va dando el valor del scanner a cada posicion del array;
        }

        IO.println(Arrays.toString(array1)); //Vemos el array como un String


/* 2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores.*/


        IO.println("Ejercicio2");

        int array2[] = new int[10];
        scan = new Scanner(System.in);

        int suma2 = 0; //Iniciar variable suma2

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca un numero: ");
            array2[i] = scan.nextInt(); //Dar el valor del scanner a cada celda del array;
            suma2 += array2[i]; //Añadir a la variable suma el valor de cada posicion del array;
        }
        IO.println("La suma total de los numeros del array es " + suma2);

/*3. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar
el máximo y mínimo y mostrarlos por pantalla  */

        IO.println("Ejercicio3");

        double array3[] = new double[10];
        scan = new Scanner(System.in);
        double maximo3 = - Double.MAX_VALUE;
        double minimo3 = Double.MAX_VALUE;
        double max3 = 0.0;
        double min3 = 0.0;

        for (int i = 0; i < array3.length; i++) {
            System.out.println("Introduzca un numero: ");
            array3[i] = scan.nextInt(); //Dar el valor del scanner a cada celda del array;
            max3 = Math.max(array3[i], maximo3);
            min3 = Math.max(array3[i], minimo3);
        }
        Arrays.sort(array3);
        IO.println("El numero menor es " + min3);
        IO.println("El numero mayor es " + max3);

/*4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado
la suma de todos los valores positivos y negativos.*/
        IO.println("Ejercicio4");

        int array4[] = new int[20];
        scan = new Scanner(System.in);
        int positivos = 0, negativos = 0; //Contador positivo y negativo;

        for (int i = 0; i < array4.length; i++) {
            System.out.println("Introduzca un numero: ");
            array4[i] = scan.nextInt(); //Dar el valor del scanner a cada celda del array;
            if (array4[i] < 0) { //Si es menor que 0, lo sume al contador negativo;
                negativos += array4[i]; //Contador = a la suma de la celda
            } else { //Si es mayor que 0 lo sume al contador positivo;
                positivos += array4[i]; //Contador = a la suma de la celda
            }
        }
        IO.println("la suma de los positivos es " + positivos);
        IO.println("La suma de los negativos es " + negativos);

/*5. Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular
y mostrar la media: (suma de valores) / n.º de valores.*/

        IO.println("Ejercicio5");

        double array5[] = new double[20];
        scan = new Scanner(System.in);
        double suma5 = 0;
        double media = 0;

        for (int i = 0; i < array5.length; i++) {
            System.out.println("Introduzca un numero: ");
            array5[i] = scan.nextDouble();
            suma5 += array5[i];
        }
        media = suma5 / array5.length;
        IO.println("La media de los numeros del array es " + media);

/*6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones
y lo muestre por pantalla.*/
        IO.println("Ejercicio6");

        scan = new Scanner(System.in);
        IO.println("Introduce el valor N");
        int valorn6 = scan.nextInt();
        IO.println("Introduce el valor M");
        int valorm6 = scan.nextInt(); //Pedimos los valores de N y M y los almacenamos

        int array6[] = new int[valorn6]; //Creamos el array con la longitud n
        Arrays.fill(array6, valorm6); //Rellenamos el array con el valor M
        IO.println(Arrays.toString(array6)); //Imprimimos el array de forma visible

/*7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q,
y lo muestre por pantalla.*/
        IO.println("Ejercicio7");

        scan = new Scanner(System.in);
        IO.println("Introduce el valor P");
        int valorp7 = scan.nextInt();
        scan = new Scanner(System.in);
        IO.println("Introduce el valor Q");
        int valorq7 = scan.nextInt();

        int array7[] = new int[Math.abs((valorq7 - valorp7) + 1)]; //La longitud sera la diferencia mas 1 para que coja todos los numeros
        for (int i = 0; i < array7.length; i++) {//For para que recorra todas las posiciones del array
            if (valorq7 > valorp7) {
                array7[i] = valorp7 + i; //Que empieze a dar numeros en el numero p y sume de uno en uno
            }else{
                array7[i] = valorq7 + i;
            }
        }
        System.out.println(Arrays.toString(array7));//Imprimimos array

/*8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando Math.random(), y luego
le pida al usuario un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R. */
        IO.println("Ejercicio8");

        double array8[] = new double[100];
        for (int i = 0; i < array8.length; i++) { //
            array8[i] = Math.random(); //
        }
        scan = new Scanner(System.in);
        IO.println("Introduce el numero");

        double numeror8 = scan.nextInt();
        int contador8 = 0;

        for (int i = 0; i < array8.length; i++) {
            if (array8[i] >= numeror8) {
                contador8++;
            }
        }
        IO.println(("Hay " + contador8 + " numeros superiores a " + numeror8));

/*9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10
(utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.*/
        IO.println("Ejercicio9");

        scan = new Scanner(System.in);
        IO.println("Introduce el valor N");
        int valorn9 = scan.nextInt();

        int array9[] = new int [100];
        for (int  i = 0; i < array9.length; i++) {
            array9[i] = (int) (1 + Math.random() * 10);
            if(array9[i] == valorn9){
                IO.println("El numero se encuentra en la posicion " + i);

            }
        }

/*10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima,
así como cuántas personas miden por encima y por debajo de la media.*/
        IO.println("Ejercicio10");

        scan = new Scanner(System.in);
        IO.println("Introduce el valor N");
        int alturas10 = scan.nextInt();

        Double array10[] = new Double[alturas10];
        double suma10 = 0;
        int masmedia10 = 0;
        int menosmedia10 = 0;
        int enlamedia10 = 0;

        for (int i = 0; i < array10.length; i++) {
            IO.println("Introduzca una altura");
            array10[i] = scan.nextDouble();
            suma10 += array10[i];
        }

        double media10 = suma10 / alturas10;
        Arrays.sort(array10);
        double minima10 = array10[0];
        double maxima10 = array10[alturas10 - 1];

        for (int i = 0; i < array10.length; i++) {
            if (array10[i] > media10) {
                masmedia10++;
            } else if (array10[i] < media10) {
                menosmedia10++;
            } else {
                enlamedia10++;
            }
        }

        IO.println("La media de las alturas es " + media10 + "\n" +
                "La altura maxima es " + maxima10 + "\n" +
                "La altura minima es " + minima10 + "\n" +
                "Hay " + menosmedia10 + " personas por debajo de la media \n" +
                "Hay " + masmedia10 + " personas por encima de la media \n" +
                "Hay " + enlamedia10 + " personas justo en la media");





/*11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/
        IO.println("Ejercicio11");

        int array111[] = new int [100];
        int array112[] = new int [100];

        for (int i = 0; i < array111.length; i++) { //Rellenamos el primer array con un for
            array111[i] = i + 1; //Le decimos que empieze en 1, y que sume de 1 en 1
        }
        for (int a = 99; a >= 0; a--) {// Empieza en la pos 99 y va bajando hasta llegar a 0
            array112[99 - a] = array111[a];// Restamos [a] a 99 para ir a la primera posicion, como en el segundo array no se resta empieza por arriba;
        } //Cada vez se va restando a 99 un numero menos hasta llegar a solo 99

        IO.println(Arrays.toString(array111));
        IO.println(Arrays.toString(array112));

/*12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
con distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
que el usuario elija la opción ‘c’ que terminará el programa.
*/

        int array12 [] = new int [10];
        for (int i = 0; i < array12.length; i++) {
            array12[i] = i + 1;
        }

        scan = new Scanner(System.in);
        String opcion = " ";

        do{
            IO.println( "Introduce una opcion: \n" +
                    "a) Mostrar valores por pantalla \n" +
                    "b) Cambio de valor y/o posicion array \n" +
                    "c) Salir");
            opcion = scan.next();

            switch (opcion) {

                case "a":
                    IO.println(Arrays.toString(array12));
                    break;
                case "b":
                    scan = new Scanner(System.in);
                    IO.println("Introduce una posicion");
                    int p12 = scan.nextInt();
                    IO.println("Introduce un valor");
                    int v12 = scan.nextInt();
                    IO.println("Array antes " + Arrays.toString(array12));
                    array12[p12] = v12;
                    IO.println("Array despues " + Arrays.toString(array12));
                    break;
                case "c":
                    IO.println("Saliendo...");
                    break;

                default:
                    break;
            }
        }while (!opcion.equals("c"));

/*13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un
  arrray y luego mostrarla. Una secuencia aritmética es una serie de números que
  comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
  e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
  programa solicitará al usuario V, I además de N (n.º de valores a crear).*/

        scan = new Scanner(System.in);
        IO.println("Introduce el valor inicial");
        int v13 = scan.nextInt();
        IO.println("Introduce el incremento");
        int i13 = scan.nextInt();
        IO.println("Introduce el nº de valores");
        int n13 = scan.nextInt();

        int inicial13 = v13;

        int array13[] = new int [n13];
        for( int i = 0; i < array13.length; i++ ){
            array13[i] = inicial13;
            inicial13 += i13;
        }
        IO.println(Arrays.toString(array13));

/*14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
        valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
        muestre por pantalla.*/

        int array14[] = new int [55];
        int posicion14 = 0; // Creamos un contador de posiciones para que avance de uno en uno.

        for( int i = 1; i < 11; i++){ // Creamos un for que recorra los numeros del 1 al 10, para ponerlos en el array
            for( int d = 0; d < i; d++ ){//  // Le decimos que d = 0, y que cuando sea igual a i, sume 1, i sera el numero a poner por lo
                array14[posicion14] = i; //     que cada numero se repetira su numero de veces, lo añadimos en la posicion del array
                posicion14++; // Sumamos uno al contador de posicion,
            }
        }

        IO.println(Arrays.toString(array14));
    }
}
