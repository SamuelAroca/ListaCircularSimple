package listaCicularSimple;

public class ListaCircularSimple {
    private Nodo lc;

    public ListaCircularSimple() {
        lc = null;
    }

    public ListaCircularSimple insertar(String entrada) {
        Nodo nuevo = new Nodo(entrada);
        if (lc != null) {
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return this;
    }

    public void recorrer() {
        Nodo p;
        if (lc != null){
            p = lc.enlace;
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;

            } while (p != lc.enlace);
        } else {
            System.out.println("\t Lista cicular vacia.");
        }
    }
}
