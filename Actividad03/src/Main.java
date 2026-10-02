import java.util.Scanner;

public class Main {
    static void main(String[] args) {

    }
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca la cantidad: ");
        int cantidad1 = scan.nextInt();

        int billete5 = 0;
        int billete10 = 0;
        int billete20 = 0;
        int billete50 = 0;
        int billete100 = 0;
        int billete200 = 0;
        int billete500 = 0;

        int dinero = 0;
        int diferencia1 = cantidad1 - dinero ;

        while (diferencia1 < 0) { {
            if (diferencia1 > 500 ){
                billete500 = billete500 + 1;
                dinero =  dinero +500;
            }else if (diferencia1 < 500 && diferencia1 > 200 ) {
                billete200 = billete200 + 1;
                dinero = dinero + 200;
            }else if (diferencia1 < 200 && diferencia1 > 100 ) {
                billete100 = billete100 + 1;
                dinero = dinero + 100;
            }else if (diferencia1 < 100 && diferencia1 > 50 ) {
                billete50 = billete50 + 1;
                dinero = dinero + 50;
            }else if (diferencia1 < 50 && diferencia1 > 20 ) {
                billete20 = billete20 + 1;
                dinero = dinero + 20;
            }else if (diferencia1 < 20 && diferencia1 > 10 ) {
                billete10 = billete10 + 1;
                dinero = dinero + 10;
            }else if (diferencia1 < 10 && diferencia1 > 5 ) {
                billete5 = billete5 + 1;
                dinero = dinero + 5;
            }else{
                    System.out.println("Se ha utilizado:\n " +
                            "        billete de 5 = 0;\n" +
                            "        billete de 10 = 0;\n" +
                            "        billete de 20 = 0;\n" +
                            "        billete de 50 = 0;\n" +
                            "        billete de 100 = 0;\n" +
                            "        billete de 200 = 0;\n" +
                            "        billete de 500 = 0;");
                }

        }


        }

    }


