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
        this.ClientesRegistrados = new Cliente[100];
    }

    static int contadorpelis = 0;
    int contadorclientes = 0;

    public static Pelicula AgregarPeli() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ID");
        int ID = sc.nextInt();

        System.out.println("Introduce el Titulo:");
        String titulo = sc.nextLine();
        IO.println("Pelicula añadida correctamente");


        PeliculasRegistradas[contadorpelis] = new Pelicula(ID, titulo, Genero.Terror);

    }
}






}
