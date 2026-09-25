import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*1. Escribe un programa que dé los “buenos días”.*/

        System.out.println("Buenos dias");

        /*2. Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.*/

        int lado = 5;
        int area = lado * lado;
        System.out.println("El area del cuadrado es igual a "+ area);

        /*3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el lado del cuadrado");
        int lado1 = scan.nextInt();
        int area1 = lado1 * lado1;
        System.out.println("El area del cuadrado es igual a "+ area1);

        /*4. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        producto y división.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = scan.nextInt();

        int suma = num1 + num2;
        int res = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.println("La suma es igual a " + suma);
        System.out.println("La resta es igual a " + res);
        System.out.println("La multiplicacion es igual a " + multi);
        System.out.println("La division es igual a " + div);

        /*5. Escribe un programa que toma como dato de entrada un número que corresponde a la
        longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        volumen de la esfera que corresponden con dicho radio.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia");
        int radio = scan.nextInt();

        double longi = 2 * Math.PI * radio;
        double are = Math.PI * (radio * radio);
        double vol =  4 * Math.PI * Math.pow(radio, 3) / 3;

        System.out.println("La longitud de la esfera es de " + longi);
        System.out.println("El area de la esfera es de " + are);
        System.out.println("El volumen de la esfera es de " + vol);

        /*6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        muestre el porcentaje de descuento realizado.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca el precio de venta");
        double venta = scan.nextInt();
        System.out.println("Introduzca el precio real");
        double real = scan.nextInt();

        double desc = ((real - venta) / real) * 100;

        System.out.println("El descuento es del " + desc + " % ");


        /*7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca la distancia en millas");
        double milla = scan.nextInt();

        double metros = milla * 1852;

        System.out.println("La distancia en metros es de " + metros);

    /*8. Escribe un programa que lee dos números y los visualiza en orden ascendente.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int numero1 = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero2 = scan.nextInt();

        int may = Math.max( numero1, numero2);
        int men = Math.min( numero1, numero2);

        System.out.println( men + " " +may );

        /*9. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.*/
/*
        scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int nu1 = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int nu2 = scan.nextInt();

        int mayo = Math.max( nu1, nu2 );
        int mayo =

        System.out.println("El numero" + mayo + "es mayor");
*/
        /*10. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int nua = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int nub = scan.nextInt();
        System.out.println("Introduzca el tercer numero");
        int nuc = scan.nextInt();

        int ma3 = Math.max(nua, nub);
        int max3 = Math.max( ma3, nuc);

        System.out.println("El " + max3 +" es el numero mayor");

        /*11. Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
        producto y división. (Ten en cuenta la división por cero). */

        scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int nu1 = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int nu2 = scan.nextInt();

        int suma = nu1 + nu2;
        int res = nu1 - nu2;
        int multi = nu1 * nu2;
        int div = nu1 / nu2;

        System.out.println("La suma es igual a " + suma);
        System.out.println("La resta es igual a " + res);
        System.out.println("La multiplicacion es igual a " + multi);
        System.out.println("La division es igual a " + div);


        /*12. Escribe un programa que lee 2 números y muestra el mayor.*/

        scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int numero12a = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero12b = scan.nextInt();

        int numero12c = Math.max( numero1, numero2);

        System.out.println("El numero" + numero12c + "es mayor");

        /*13. Escribe un programa que lee un número y me dice si es positivo o negativo
        consideraremos el cero como positivo.*/
    }
}