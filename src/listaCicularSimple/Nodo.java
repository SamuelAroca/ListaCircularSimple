package listaCicularSimple;

public class Nodo {
    String dato;
    Nodo enlace;

    public Nodo(String entrada) {
        dato = entrada;
        enlace = this;
    }
}
