import Model.Cliente;
import Model.Genero;
import Model.Pelicula;

import java.time.LocalDate;
import java.util.Scanner;


public class VideoDaw {
    private String CIF;
    private String Direccion;
    private LocalDate FechaAlta;
    public static Pelicula[] PeliculasRegistradas;
    private Cliente[] ClientesRegistrados;

    public VideoDaw(String CIF, String Direccion) {
        this.CIF = CIF;
        this.Direccion = Direccion;
        this.FechaAlta = LocalDate.now();
        this.PeliculasRegistradas = new Pelicula[100];
        this.ClientesRegistrados = new Cliente[100] ;
    }

    static int contadorpelis = 0;
    int contadorclientes = 0;


public void ElimiarPeli(){
    Scanner sc = new Scanner(System.in);
    IO.println("Introduce el ID");
    Pelicula.Id = sc.nextInt();
    for (int i=0; i < VideoDaw.PeliculasRegistradas.length; i++ ){
        if (PeliculasRegistradas[i].equals(Pelicula.Id){
            PeliculasRegistradas[i] = null;
        };

    };

}

}


/*
    Scanner sc = new Scanner(System.in);
    for(int i =0; i< PeliculasRegistradas.length; i++){
        sc = new Scanner(System.in);

        IO.println("Introduce el ID");
        String Id = sc.nextLine();
        IO.println("Introduce el titulo");
        String titulo = sc.nextLine();
        IO.println("Introduce el Genero");
        String Genero = sc.nextLine();

        VideoDaw.PeliculasRegistradas[i] = new Pelicula(Id,titulo,Genero);
    }
 */




