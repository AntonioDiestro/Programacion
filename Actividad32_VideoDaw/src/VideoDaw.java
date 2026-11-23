import Model.Cliente;
import Model.Pelicula;

import java.time.LocalDate;

public class VideoDaw {
    private String CIF;
    private String Direccion;
    private LocalDate FechaAlta;
    private Pelicula[] PeliculasRegistradas;
    private Cliente[] ClientesRegistrados;

    public VideoDaw(String CIF, String Direccion){
        this.CIF = CIF;
        this.Direccion = Direccion;
        this.FechaAlta = LocalDate.now();
        this.PeliculasRegistradas = new Pelicula[100];
        this.ClientesRegistrados = new Cliente[100];
    }
    int contadorpelis = 0;
    int contadorclientes = 0;


    public void AgregarPeli(){
        PeliculasRegistradas[contadorpelis] = Pelicula.infoPelicula();
        contadorpelis++;
    }



}
