package model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimientos {
        private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        private String Codigo;
        private LocalDate fechahora;
        private Movimiento movimiento;
        private int Cantidad;

    public Movimientos(String Codigo, Movimiento movimiento, int Cantidad) {
        this.Codigo = Codigo;
        this.fechahora = fechahora;
        this.movimiento = movimiento;
        this.Cantidad = Cantidad;
    }
}

