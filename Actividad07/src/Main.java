import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    static void main(String[] args) {

        String jugada = " ";
        String jugadarival = " ";
        String eleccion = " ";

        do {

            int rival =  (int) (Math.random() * 3); //Generamos un numero aleatorio entre 0 y 2
            if (rival == 0) {
                jugadarival = "Piedra"; //Asignamos el 0 a piedra
            }else if (rival == 1){
                jugadarival = "Papel"; //Asignamos el 1 a papel
            }else if (rival == 2) {
                jugadarival = "Tijera"; //Asignamos el 2 a tijera
            }

            Scanner scan = new Scanner(System.in);
            IO.println("Introduzca P (piedra), L (papel), T (tijera) o S para terminar ");
            jugada = scan.nextLine();  //Pedimos al usuario que elija
            if (jugada.equals("P")) {
                eleccion = "Piedra";
            }else if (jugada.equals("L")){
                eleccion = "Papel";
            }else if (jugada.equals("T")) {
                eleccion = "Tijera";
            }

            switch (jugada) { //Hacemos un switch para cada jugada del usuario
                case "P":
                    IO.println("Has elegido " + eleccion); //Escribimos la decision del jugador
                    IO.println("El rival ha elegido " + jugadarival); // Escribimos la decision del rival
                    if (jugadarival.equals("Piedra")){ // Comparamos ambas
                        IO.println("Empate");
                        break; //Rompemos el bucle y hacemos uno para todos los casos
                    }else if(jugadarival.equals("Papel")){
                        IO.println( eleccion + " pierde contra " + jugadarival);
                        break;
                    }else  if(jugadarival.equals("Tijera")){
                        IO.println(eleccion + " gana a " + jugadarival);
                        break;
                    }
                case "L":
                    IO.println("Has elegido " + eleccion);
                    IO.println("El rival ha elegido " + jugadarival);
                    if (jugadarival.equals("Piedra")){
                        IO.println(eleccion + " gana a " + jugadarival);
                        break;
                    }else if(jugadarival.equals("Papel")){
                        IO.println("Empate");
                        break;
                    }else  if(jugadarival.equals("Tijera")){
                        IO.println(eleccion +" pierde contra " + jugadarival);
                        break;
                    }
                case "T":
                    IO.println("Has elegido " + eleccion );
                    IO.println("El rival ha elegido " + jugadarival);
                    if (jugadarival.equals("Piedra")){
                        IO.println(eleccion + " pierde contra " + jugadarival);
                        break;
                    }else if(jugadarival.equals("Papel")){
                        IO.println(eleccion + " gana a " + jugadarival);
                        break;
                    }else  if(jugadarival.equals("Tijera")){
                        IO.println("Empate");
                        break;
                    }
            }
        }while (!jugada.equals("S")); // En caso de seleccionar S se acaba el juego
    }
}