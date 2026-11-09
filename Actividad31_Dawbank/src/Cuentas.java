
public class Cuentas {

    //Atributos de las cuentas bancarias
    private String IBAN;
    private String Titular;
    private int Saldo;
    private Movimientos[] movimientos;


    private int MovIni = 100;
    private int contmovact;


    //Constructor
    public Cuentas(String IBAN, String Titular) {
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.movimientos = new Movimientos[MovIni];
        this.contmovact = 0;
    }

    //Datos cuenta
    public String Cuentas(){
        return this.IBAN;
        return this.Titular;
        return (String) this.Saldo;
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
    public Double getSaldo() {
        return this.Saldo;
    }



}
