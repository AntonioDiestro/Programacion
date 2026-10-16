import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;


public class Main {
    static void main(String[] args) {

/*1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la cadena en una línea distinta. */

        Scanner sc = new Scanner(System.in);
        IO.println("Introduce una cadena de texto");
        String textoE1 =  sc.nextLine();

        String[] partesE1 = textoE1.split(" ");
        for (String separadoE1 : partesE1) {
            IO.println(separadoE1);
        }

/*2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales
 sin diferenciar entre mayúsculas y minúsculas.*/

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

        sc = new Scanner(System.in);
        IO.println("Introduce el nombre");
        String textoE3 =  sc.nextLine();
        IO.println("Introduce el primer apellido");
        String textoE3A =  sc.nextLine();
        IO.println("Introduce el segundo apellido");
        String textoE3B =  sc.nextLine();

        String textosE3 = textoE3.substring(0,2);
        String textosE3A = textoE3A.substring(0,2);
        String textosE3B = textoE3B.substring(0,2);





    }
}
