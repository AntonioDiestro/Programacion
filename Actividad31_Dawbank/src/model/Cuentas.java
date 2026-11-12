package model;

public class Cuentas {

    //Atributos de las cuentas bancarias
    public static String numcuenta;
    private final String IBAN;
    private String Titular;
    public static int Saldo;
    public Movimientos[] movimientos;

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



}
