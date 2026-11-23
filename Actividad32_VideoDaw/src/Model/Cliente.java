package Model;

import java.time.LocalDate;

public class Cliente {
    private String DNI;
    private String Nombre;
    private String NumSocio;
    private String Direccion;
    private LocalDate FechaNacimiento;
    private LocalDate FechaBaja;
    private Pelicula[] PeliculasAlquiladas;

    public Cliente(String DNI, String Nombre, String NumSocio, String Direccion, LocalDate FechaNacimiento) {
    this.DNI = DNI;
    this.Nombre = Nombre;
    this.NumSocio = NumSocio;
    this.Direccion = Direccion;
    this.FechaNacimiento = FechaNacimiento;
    this.FechaBaja = null;
    PeliculasAlquiladas = new Pelicula[100];
    }
}

