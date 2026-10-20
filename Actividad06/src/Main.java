import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

/*1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.*/
        IO.println("Ejercicio1");

        int arrayE1[][] = new int [5][5];
        int numeroE1 = 1;

        for (int i = 0; i < arrayE1.length; i++) {
            for (int j = 0; j < arrayE1[i].length; j++){
                arrayE1[i][j] = numeroE1;
                numeroE1++;
            }
        }

        for (int numerosE1[] : arrayE1){
            IO.println(Arrays.toString(numerosE1));
        }

/*2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.*/
        IO.println("Ejercicio2");

        int arrayE2[][] = new int [10][10];

        for (int i = 0; i < arrayE2.length; i++) {
            for (int j = 0; j < arrayE2[i].length; j++){
                arrayE2[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int numerosE2[] : arrayE2){
            IO.println(Arrays.toString(numerosE2));
        }

/*3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        menores que cero y cuántos son igual a cero. */
        IO.println("Ejercicio 3");

        Scanner scan = new Scanner(System.in);
        IO.println("Introduzca N");
        int N = scan.nextInt();
        IO.println("Introduzca M");
        int M = scan.nextInt();

        int[][] arrayE3 = new int[N][M];

        int mayor0E3 = 0;
        int menor0E3 = 0;
        int igual0E3 = 0;


        for (int i = 0; i < arrayE3.length; i++) {
            for (int j = 0; j < arrayE3[i].length; j++) {
                IO.println("Introduce un número");
                arrayE3[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arrayE3.length; i++) {
            for (int j = 0; j < arrayE3[i].length; j++) {

                IO.println(arrayE3[i][j]);

                if (arrayE3[i][j] == 0) {
                    igual0E3++;
                } else if (arrayE3[i][j] < 0) {
                    menor0E3++;
                } else {
                    mayor0E3++;
                }
            }
        }

        IO.println("Hay " + mayor0E3 + " números mayores que 0");
        IO.println("Hay " + igual0E3 + " números iguales a 0");
        IO.println("Hay " + menor0E3 + " números menores que 0");

/*4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.*/
        IO.println("Ejercicio 4");


        int alumnos = 4;
        int asignaturas = 5;
        double[][] arrayE4 = new double[alumnos][asignaturas];
        double[][] estadisticas = new double[alumnos][3];


        for (int i = 0; i < arrayE4.length; i++) {
            for (int j = 0; j < arrayE4[i].length; j++) {
                scan = new Scanner(System.in);
                IO.println("Introduce la nota de la asignatura " + (j + 1) + ": ");
                arrayE4[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < arrayE4.length; i++) {
            estadisticas[i][0] = Double.MAX_VALUE;
            estadisticas[i][1] = Double.MAX_VALUE;
            estadisticas[i][2] = 0.0;
            for (int j = 0; j < arrayE4[i].length; j++) {
                estadisticas[i][0] = Math.min(estadisticas[i][0], arrayE4[i][j]);
                estadisticas[i][1] = Math.min(estadisticas[i][1], arrayE4[i][j]);
                estadisticas[i][2] = estadisticas[i][2];
            }
            estadisticas[i][2] = estadisticas[i][2] / arrayE4[i].length;
        }


/*5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
matriz. Luego se mostrará por pantalla el sueldo medio de cada género.*/

        scan = new Scanner(System.in);
        IO.println("Introduzca el numero de personas);
        int personasE5 = scan.nextInt();

        int [][] arrayE5 = new int[personasE5][2];
        double mediahE5 = 0.0, mediamE5 = 0.0;
        int contadorh = 0.0, contadormE5 = 0.0;

        for (int i = 0; i < arrayE4.length; i++) {
            for (int j = 0; j < arrayE4[i].length; j++) {
                scan = new Scanner(System.in);
                IO.println("Introduce el genero de la persona);
                arrayE5[i][0]= scan.nextInt();
                IO.println("Introduce el salario de la persona);
                arrayE5[i][0]= scan.nextDouble();
            }
    }
    }

}
