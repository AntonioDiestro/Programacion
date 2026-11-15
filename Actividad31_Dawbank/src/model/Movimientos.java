package model;


import java.time.LocalDate;
import java.util.Scanner;

public class Movimientos {
    public String numcuenta;
    private LocalDate fechahora;
    private TipoMov tipomov;
    private int Cantidad;

    public Movimientos(TipoMov TipoMov, int Cantidad) {
        this.numcuenta = numcuenta;
        this.fechahora = fechahora;
        this.tipomov = TipoMov;
        this.Cantidad = Cantidad;
    }

    public void mostrarInfoMovimiento() {
        System.out.println("Nº Cuenta: " + numcuenta);
        System.out.println("Fecha: " + fechahora);
        System.out.println("Tipo: " + tipomov);
        System.out.println("Cantidad: " + Cantidad);

    }
}
