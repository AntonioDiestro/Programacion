package Model;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private int Id;
    private String titulo;
    private Genero genero;
    private LocalDate fecha;
    private LocalDate fechabaja;
    private LocalDateTime fechaalquiler;
    private boolean IsAlquilada;

    public Pelicula(int ID, String titulo, Genero genero) {
        this.Id = Id;
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.fechabaja = null;
        this.fechaalquiler = LocalDateTime.now();
        IsAlquilada = false;

    }

    public String infoPeli() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: " + this.Id + "\n");
        sb.append("Titulo: " + this.titulo + "\n");
        sb.append("Genero: " + this.genero + "\n");
        sb.append("Fecha: " + this.fecha + "\n");
        sb.append("¿Alquilada?: " + IsAlquilada + "\n");
        return sb.toString();
    }


    public void AgregarPeli() {
        PeliculasRegistradas[contadorpelis] = Pelicula.infoPelicula();
        contadorpelis++;
    }
}
/*

    }

}

/*+








 */

