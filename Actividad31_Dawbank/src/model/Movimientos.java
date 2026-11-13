package model;


import java.time.LocalDate;
import java.util.Scanner;

public class Movimientos {
    public String numcuenta;
    private LocalDate fechahora;
    private TipoMov tipomov;
    private int Cantidad;

    public Movimientos() {
        this.numcuenta = numcuenta;
        this.fechahora = fechahora;
        this.tipomov = TipoMov.Ingreso;
        this.Cantidad = Cantidad;
    }


    public void Ingresar(Cuentas cuenta) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad a ingresar:");
        int cantidad = sc.nextInt();

        Cuentas.Saldo += cantidad;
    }

    public void Retirar(Cuentas cuenta) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad a retirar:");
        int cantidad = sc.nextInt();

        if (cantidad <= Cuentas.Saldo && cantidad > 0) {
            Cuentas.Saldo -= cantidad;
            System.out.println("Retirada realizada.");
        } else {
            System.out.println("Saldo insuficiente o cantidad incorrecta.");
        }
    }


}



/*


Movimientos M1 = new Movimientos(Cantingreso);
Cuentas.Saldo += Cantingreso;
                    break;



*/