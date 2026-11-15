package model;

import java.util.Scanner;

public class Cuentas {

    //Atributos de las cuentas bancarias
    public static String numcuenta;
    private final String IBAN;
    private String Titular;
    public static int Saldo;

    private final Movimientos[] movimientos;

    private int contmovact;


    //Constructor
    public Cuentas(String numcuenta, String IBAN, String Titular) {
        this.numcuenta = numcuenta;
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.movimientos =  new Movimientos[100];
        this.contmovact = 0;
    }

    //Datos cuenta
    public String getCuentas() {
        return "IBAN: " + this.IBAN + "\n" +
                "Titular: " + this.Titular + "\n" +
                "Saldo: " + this.Saldo;
    }

    //Pedir IBAN
    public String getIBAN() {
        return this.IBAN;
    }

    //Pedir Titular
    public String getTitular() {
        return this.Titular;
    }

    //Pedir Saldo
    public int getSaldo() {
        return this.Saldo;
    }

    public void Ingresar(Cuentas cuenta) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad a ingresar:");
        int cantidad = sc.nextInt();

        Cuentas.Saldo += cantidad;

        movimientos[contmovact] =
                new Movimientos(TipoMov.Ingreso, cantidad);
        contmovact++;
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

        movimientos[contmovact] =
                new Movimientos(TipoMov.Retirada, cantidad);
        contmovact++;
    }


    public void mostrarMovimientos() {

        for (int i = 0; i < contmovact; i++) {
            movimientos[i].mostrarInfoMovimiento();
        }
    }

}
