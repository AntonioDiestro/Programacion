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

public Pelicula(int ID, String titulo, LocalDate fecha){
    this.Id = Id;
    this.titulo = titulo;
    this.genero = genero;
    this.fecha = fecha;
    this.fechabaja = null;
    this.fechaalquiler = LocalDateTime.now();
    IsAlquilada = false;

}

}
