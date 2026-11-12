package model;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimientos {
    public String numcuenta;
    private LocalDate fechahora;
    private Movimiento tipomov;
    private int Cantidad;

    public Movimientos(String numcuenta, int Cantidad) {
        this.numcuenta = Cuentas.numcuenta;
        this.fechahora = fechahora;
        this.tipomov = Movimiento.Ingreso;
        this.Cantidad = Cantidad;
    }




}






