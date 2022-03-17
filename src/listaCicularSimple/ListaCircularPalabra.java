package listaCicularSimple;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListaCircularPalabra {

    public static void main(String[] args) {
        String palabra;
        ListaCircularSimple listaCp;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        listaCp = new ListaCircularSimple();
        System.out.println("\n Entrada de Nombres. Termina con fin.\n");
        try {
            while (!(("fin").equals(palabra = entrada.readLine()))) {
                //while ((palabra = entrada.readLine()) != null) {
                //System.out.println("Leyó: " + palabra);
                String nueva;
                nueva = new String(palabra);
                listaCp.insertar(nueva);
            }
            System.out.println("\t\tLista circular de palabras");
            listaCp.recorrer();
        } catch (Exception e) {
            System.out.println("Error\n");
        }
    }
}
