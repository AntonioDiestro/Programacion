
public class Banco {

    //Atributos de la clase
    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono;

    private Cuentas[] cuentas;
    private int cuentasactuales;
    private final int dimensioncuentas = 50;


//Constructor
public Banco(String codigo, String nombre, String direccion, String email, String nTelefono) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.direccion = direccion;
    this.email = email;
    this.nTelefono = nTelefono;
    this.cuentas = new Cuentas[this.dimensioncuentas];

    cuentasactuales = 0;
}

}
