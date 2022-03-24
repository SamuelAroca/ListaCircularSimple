package listaCicularSimple;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListaCircularPalabra {

    public static void main(String[] args) {
        String palabra;
        ListaCircularSimple listaCp;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        listaCp = new ListaCircularSimple();
        int opc;
        System.out.println("\n Entrada de Nombres. Termina con fin.\n");
        try {
            while (!(("fin").equals(palabra = entrada.readLine()))) {
                //while ((palabra = entrada.readLine()) != null) {
                //System.out.println("Leyó: " + palabra);
                String nueva = new String(palabra);
                listaCp.insertar(nueva);
            }
            System.out.println("\t\tLista circular de palabras");
            listaCp.recorrer();
            System.out.println("\n\t Opciones para manejar la lista");
            do {
                System.out.println("1. Insertar una palabra.\n");
                System.out.println("2. Eliminar una palabra.\n");
                System.out.println("3. Mostrar la lista completa.\n");
                System.out.println("4. Salir .\n");
                do {
                    opc = Integer.parseInt(entrada.readLine());
                } while (opc < 1 || opc > 4);
                switch (opc) {
                    case 1:
                        System.out.print("Palabra a insertar: ");
                        palabra = entrada.readLine();
                        listaCp.insertar(palabra);
                        break;
                    case 2:
                        System.out.print("Palabra a eliminar: ");
                        palabra = entrada.readLine();
                        listaCp.eliminar(palabra);
                        break;
                    case 3:
                        System.out.println("Palabras en la Lista:\n");
                        listaCp.recorrer();
                        break;
                }
            } while (opc != 4);
        } catch (Exception e) {
            System.out.println("Error\n");
        }
    }
}
