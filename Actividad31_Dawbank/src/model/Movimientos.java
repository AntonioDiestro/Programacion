package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimientos {
    private LocalDateTime fechahora;
    private TipoMov tipomov;
    private int Cantidad;

    public Movimientos(TipoMov TipoMov, int Cantidad) {

        this.fechahora = LocalDateTime.now();;
        this.tipomov = TipoMov;
        this.Cantidad = Cantidad;
    }

    public void mostrarInfoMovimiento() {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        IO.println("Fecha: " + fechahora.format(formato));
        IO.println("Tipo: " + tipomov);
        IO.println("Cantidad: " + Cantidad);
        IO.println("-----------------------------------");

    }
}
