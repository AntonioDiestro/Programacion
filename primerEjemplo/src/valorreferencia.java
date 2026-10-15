public class valorreferencia {

    void valorreferencia() {
    double a = 3 ;
    double b = 5;
    IO.println("El valor de a es : "+  a);
    IO.println("El valor de b es : "+  b);

    String s1 = "Hola";
    String s2 = "Mundo";

    IO.println("El valor de s1 es : "+  s1);
    IO.println("El valor de s2 es : "+  s2);

    int notas [] = {5, 7, 3};
    int notasRe [] = {7, 8, 4};
    notasRe = notas;

    notas [2] = 5; //Cambiar la nota del array de la posicion 3;
        

}
}
