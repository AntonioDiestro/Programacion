package model;

public class Cuentas {

    //Atributos de las cuentas bancarias
    private int numcuenta;
    private final String IBAN;
    private String Titular;
    private int Saldo;
    public Movimientos[];


    private int MovIni = 100;
    private int contmovact;


    //Constructor
    public Cuentas(int numcuenta, String IBAN, String Titular) {
        this.numcuenta = numcuenta;
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.movimientos =
        this.contmovact = 0;
    }

    //Datos cuenta
    public String getCuentas(){
        return this.IBAN;
        return this.Titular;
        return this.Saldo;
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
