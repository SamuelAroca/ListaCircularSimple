package listaCicularSimple;

public class ListaCircularSimple{
    private Nodo lc;

    public ListaCircularSimple() {
        lc = null;
    }

    public ListaCircularSimple insertar(String entrada) {
        Nodo nuevo = new Nodo(entrada);
        if (lc != null) { // lista circular no vacía
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        //System.out.println("Insertado: " + entrada);
        return this;
    }

    public void eliminar(String entrada) {
        Nodo actual = lc;
        if (lc == null) {
            return;
        }
        if (lc.dato.equals(entrada)) {
            if (lc == lc.enlace) { // Lista con un solo nodo
                lc = null;
            } else {
                lc = lc.enlace;
            }
            return;
        }
        while (actual.enlace != lc ) {
            if (actual.enlace.dato.equals(entrada)) {
                // Enlace de nodo anterior con el siguiente
                // si se ha encontrado el nodo.
                Nodo p = actual.enlace; // Nodo a eliminar
                if (p == lc) {
                    lc = actual; // Se borra el elemento referenciado por lc,
                    // el nuevo acceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
            } else {
                actual = actual.enlace;
            }
        }
    }

    public void recorrer() {
        Nodo p;
        if (lc != null) {
            p = lc; // siguiente nodo al de acceso
            System.out.println("\t" + p.dato);
            while (p.enlace != lc) {
                System.out.println("\t" + p.enlace.dato);
                p = p.enlace;
            }
        } else
            System.out.println("\t Lista Circular vacía.");
    }
}
