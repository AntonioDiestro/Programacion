import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.lang.String;


public class Main {
    static void main(String[] args) {

/*1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la cadena en una línea distinta. */
        IO.println("Ejercicio1");

        Scanner sc = new Scanner(System.in);
        IO.println("Introduce una cadena de texto");
        String textoE1 =  sc.nextLine();

        String[] partesE1 = textoE1.split(" ");
        for (String separadoE1 : partesE1) {
            IO.println(separadoE1);
        }

/*2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales
 sin diferenciar entre mayúsculas y minúsculas.*/
        IO.println("Ejercicio2");

        sc = new Scanner(System.in);
        IO.println("Introduce una cadena de texto");
        String textoE2 =  sc.nextLine();
        IO.println("Introduce otra cadena de texto");
        String textoE2A =  sc.nextLine();

        if (textoE2.equals(textoE2A)){
            IO.println("Las cadenas son iguales");
        }else{IO.println("Las cadenas son diferentes");}

        if (textoE2.equalsIgnoreCase(textoE2A)){
            IO.println("Las cadenas son iguales (sin contar las mayusculas)");
        }else{IO.println("Las cadenas son diferentes");}

/*3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos Luego mostrará un código de usuario
(en mayúsculas) formado por la concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
“Tarazón” y “Alcocer” mostrará “LIOTARALC”.*/
        IO.println("Ejercicio3");

        sc = new Scanner(System.in);
        IO.println("Introduce el nombre");
        String textoE3 =  sc.nextLine();
        IO.println("Introduce el primer apellido");
        String textoE3A =  sc.nextLine();
        IO.println("Introduce el segundo apellido");
        String textoE3B =  sc.nextLine();

        String textosE3 = textoE3.substring(0,3);
        String textosE3A = textoE3A.substring(0,3);
        String textosE3B = textoE3B.substring(0,3);

        String textofinal3 = textosE3+textosE3A+textosE3B;

        IO.println(textofinal3.toUpperCase());

/*4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida
       por teclado. No se debe diferenciar entre mayúsculas y minúsculas*/
        IO.println("Ejercicio4");

        int contadora4 = 0;
        int contadore4 = 0;
        int contadori4 = 0;
        int contadoro4 = 0;
        int contadoru4 = 0;

        sc = new Scanner(System.in);
        IO.println("Introduce un texto");
        String textoE4 =  sc.nextLine();

        String textoE4A = textoE4.toLowerCase();

        char c[]=textoE4A.toCharArray();

        for (int i = 0; i < c.length; i++){
            if(c[i] == 'a'){
                contadora4++;
            }
            if(c[i] == 'e'){
                contadore4++;
            }
            if(c[i] == 'i'){
                contadori4++;
            }
            if(c[i] == 'o'){
                contadoro4++;
            }
            if(c[i] == 'u'){
                contadoru4++;
            }
        };

        IO.println("A: " + contadora4 + "; E: " + contadore4 + "; I: " + contadori4 + "; O: " + contadoro4 + "; U: " + contadoru4);

/*5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
                acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        derecha a izquierda. */
        IO.println("Ejercicio5");

        sc = new Scanner(System.in);
        IO.println("Introduce un texto");
        String textoE5 = sc.nextLine();

        String textocambiadoE5 = textoE5.replace(" ", "").toLowerCase();

        char arrayE5[] = textocambiadoE5.toCharArray();
        char arrayE5A[] = new char[arrayE5.length];

        for (int i = arrayE5.length - 1; i >= 0; i--) {
            arrayE5A[arrayE5.length - 1 - i] = arrayE5[i];
        }

        if (Arrays.equals(arrayE5, arrayE5A)) {
            IO.println("Es un palindromo");
        } else {
            IO.println("No es un palindromo");
        }


    }
}
